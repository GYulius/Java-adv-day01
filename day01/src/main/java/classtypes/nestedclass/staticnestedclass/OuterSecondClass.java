package classtypes.nestedclass.staticnestedclass;

public class OuterSecondClass {

    private static int outerStaticVariable = 400;

    private int  outerVariable = 200;


    public static class StaticNestedClass{
            public void displayNestedClass(){
                System.out.println("Hello from static class and the variable is  " + outerStaticVariable);
            }
    }

    public class NestedClass{
        public void displayNestedClass(){
            System.out.println("Hello from non-static and the variable is " + outerVariable);
            System.out.println("Hello from non-static and the variable is " + outerStaticVariable);
        }
    }

    public static void main(String[] args) {
        StaticNestedClass object = new StaticNestedClass();
        object.displayNestedClass();

        OuterSecondClass outerClass = new OuterSecondClass();

    }




}
