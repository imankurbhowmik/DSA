// this is a demo to show initialisation of static variables

public class Four_staticBlock {
    static int a = 4;
    static int b;

    // this will run only once when the first object is created that is when class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a*5;
    }

    public static void main(String[] args) {
        Four_staticBlock obj = new Four_staticBlock();
        System.out.println(Four_staticBlock.a + " " + Four_staticBlock.b);

        Four_staticBlock.b+=3;
        System.out.println(Four_staticBlock.a + " " + Four_staticBlock.b);

        Four_staticBlock obj2 = new Four_staticBlock();
        System.out.println(Four_staticBlock.a + " " + Four_staticBlock.b);
    }
}
