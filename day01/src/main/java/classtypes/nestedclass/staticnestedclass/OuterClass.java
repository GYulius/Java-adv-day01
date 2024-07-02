package classtypes.nestedclass.staticnestedclass;

class OuterClass {


    static int data;
    public  static class StaticNestedClass{

        public void display(){
            data = 5;
            System.out.println("Hello from static nested class");
        }
    }

    public static void main(String[] args) {
        StaticNestedClass staticNestedClass = new StaticNestedClass();
    }
}
