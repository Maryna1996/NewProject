package example.lesson18;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<String, Object> MAP = new HashMap<>();


    public static void main(String[] args)
            throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException,
            IllegalAccessException {
//1        LazyService lazyService = new LazyService();
//        final Class<? extends LazyService> aClass1 = lazyService.getClass();
//        final Class<LazyService> lazyServiceClass = LazyService.class;
//        final Class<?> aClass2 = Class.forName("edu.hillel.lesson18.LazyService");


//2        inspectService(LazyService.class);
//        inspectService(SimpleService.class);
//        inspectService(Integer.class);


//3        findMethods(LazyService.class);

        createService("edu.hillel.lesson18.LazyService");
        callInitMethod("edu.hillel.lesson18.LazyService");
    }


    public static void inspectService(Class<?> service) {
        if (service.isAnnotationPresent(Service.class)) {
            final Service annotation = service.getAnnotation(Service.class);
            System.out.println(annotation.name());
        } else {
            System.out.println("Didn't find annotation " + Service.class);
        }
    }

    public static void findMethods(Class<?> service) {
        final Method[] methods = service.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            if (method.isAnnotationPresent(Init.class)) {
                System.out.println("Method with Init annotation was found");
            }
        }
    }


    public static void createService(String className)
            throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException,
            IllegalAccessException {
        final Class<?> aClass = Class.forName(className);
        if (aClass.isAnnotationPresent(Service.class)) {
            final Constructor<?> constructor = aClass.getConstructor(null);
            final Object instance = constructor.newInstance(null);
            MAP.put(className, instance);
            System.out.println(MAP);
        } else {
            System.out.println(" Didn't find annotation " + Service.class);
        }
    }


    public static void callInitMethod(String className)
            throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        final Class<?> aClass = Class.forName(className);
        final Method[] methods = aClass.getMethods();
        final Service annotation1 = aClass.getAnnotation(Service.class);
        if (annotation1!=null && !annotation1.lazyLoad()) {
            for (Method method : methods) {
                if (method.isAnnotationPresent(Init.class)) {
                    try {
                        method.invoke(MAP.get(className));
                    } catch (Exception e) {
                        final Init annotation = method.getAnnotation(Init.class);
                        if (annotation.isSuppressException()) {
                            System.out.println("Reflection approach " + e.getCause().getMessage());
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        } else {
            System.out.println("I'm too lazy and do anything");
        }
    }

}
