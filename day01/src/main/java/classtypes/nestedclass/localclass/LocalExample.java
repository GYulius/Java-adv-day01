package classtypes.nestedclass.localclass;
public class LocalExample {
    protected int value = 0;

    @Override
    public String toString(){
        return String.valueOf(value);
    }


    // doSomething
    public LocalExample(){

    }

//    public LocalExample(String message,int value) {
//        System.out.println(message);
//        this.value = value;
//    }

    public static void main(String[] args) {
     //   LocalExample localExample = new LocalExample("Buna seara", 20);

        LocalExample localExample = new LocalExample();

        System.out.println(localExample);
    }
}
