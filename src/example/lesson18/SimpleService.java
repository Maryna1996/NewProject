package example.lesson18;

@Service(name = "AnnotationSimpleService")
public class SimpleService {

    @Init
    public void initService() {
        System.out.println("I'm initService");
    }
}