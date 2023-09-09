package example.lesson8;

class FinallyDemo {


    //case 1
//    public void method(String count){
//        try {
//            System.out.println("The count is " + Integer.parseInt(count));
//        } catch (NumberFormatException e) {
//            System.out.println("ERROR: No count");
//        } finally {
//            System.out.println("In finally");
//        }
//    }

    //case 2
//    public void method(){
//        try {
//            System.out.println("Inside try");
//            throw new RuntimeException("Houston we have a problem!");
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }

    //case 3
//    public void method(){
//        try {
//            System.out.println("Inside try");
//        } finally {
//            System.out.println("Inside finally");
//        }
//    }

    //case 4
//    public void method() {
//        try {
//            System.out.println("Inside try");
//            throw new RuntimeException();
//        } finally {
//            System.out.println("Inside finally");
//        }
//    }

    //case 5
//    public void method() throws Exception {
//        try {
//            System.out.println("Inside try");
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("Inside catch");
//        } finally {
//            System.out.println("Inside finally");
//        }
//    }

    //case 6
//    public String method(){
//        try {
//            System.out.println("Inside try");
//            return "from try";
//        } finally {
//            System.out.println("Inside finally");
//        }
//    }

    //case 7
//    public String method(){
//        try {
//            System.out.println("Inside try");
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("Inside catch");
//            return "from catch";
//        } finally {
//            System.out.println("Inside finally");
//        }
//    }


    //case 8
//    public String method(){
//        try {
//            System.out.println("Inside try");
//            return "from try";
//        } catch (Exception e) {
//            System.out.println("Inside catch");
//            return "from catch";
//        } finally {
//            System.out.println("Inside finally");
//        }
//    }

    //case 9
//    public String method(){
//        try {
//            System.out.println("Inside try");
//            return "from try";
//        } catch (Exception e) {
//            System.out.println("Inside catch");
//            return "from catch";
//        } finally {
//            System.out.println("Inside finally");
//            return "from finally";
//        }
//    }

    //case 10
//    public String method(){
//        try {
//            System.out.println("Inside try");
//            return "from try";
//        } finally {
//            throw new RuntimeException();
//        }
//    }

    //case 11
//    public void method(){
//        try {
//            System.out.println("Inside try");
//            throw new IllegalStateException("error");
//        } catch (NumberFormatException e) {
//            System.out.println("ERROR: catch");
//        }
//    }



    //case 12
    public void method(){
        try {
            System.out.println("Inside try");
            System.exit(1);
        } finally {
            System.out.println("Inside finally");
        }
    }



    public static void main(String args[]) throws Exception {
        FinallyDemo finallyDemo = new FinallyDemo();
        finallyDemo.method();
    }
}
