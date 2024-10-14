public class Eight_polymorphismMain {
    public static void main(String[] args) {
           Eight_polymorphismShapes shape = new Eight_polymorphismShapes();
           Eight_polymorphismCircle circle = new Eight_polymorphismCircle();
           Eight_polymorphismSquare square = new Eight_polymorphismSquare();

           shape.area();

        Eight_polymorphismShapes circle2 = new Eight_polymorphismCircle();
        circle2.area();
    }
}