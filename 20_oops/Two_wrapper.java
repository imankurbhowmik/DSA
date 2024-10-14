public class Two_wrapper {
    public static void main(String[] args) {
        Integer a = 10;

        Integer b = new Integer(45);

        swap(a, b);

        System.out.println(a + " " + b);  // no swap Integer is a final class

        final A Ankur = new A("Ankur");
        Ankur.name = "Bhow";

        // when a non primitive is final we cannot reasign
//        Ankur = new A("other");

        A obj;

        for(int i=0; i<1000000; i++) {
            obj = new A("new object");
        }
    }



    public static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name ;

    public A(String name) {
        this.name = name;
    }


    /// this will be called on garbage; whenever any object of class A is deleted this will be called
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
