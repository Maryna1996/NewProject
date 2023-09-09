package example.lesson8;

public class C {
    public void c() throws OwnException {
        System.out.println("c");
        try {
            throw new Exception("Error");
        } catch (Exception e) {
            // do nothing
        }
        finally {
            System.out.println("Close connection");
        }
    }

    public static void main(String[] args) throws OwnException {
        C c = new C();
        c.c();
    }
}
