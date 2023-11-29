package example.lesson18;


@Service(name = "AnnotationLazyService", lazyLoad = true)
public class LazyService {

    @Init(isSuppressException = false)
    public void lazyService() throws Exception {
        System.out.println("I'm lazyService");
        throw new Exception("LazyService exception was thrown!!!!!");
    }

    @Override
    public String toString() {
        return "LazyService{}";
    }
}
