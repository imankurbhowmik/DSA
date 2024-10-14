public class Eight_polymorphismCircle extends Eight_polymorphismShapes{

    // this will run when an object of circle is created
    // hence it is overriding the parent method
    @Override   // this is called annotation
    void area() {
        System.out.println("Area is pi*r*r");
    }
}