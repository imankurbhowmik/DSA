public class Seven_inheritanceBox {
    double l;
    double h;
    double w;

    public Seven_inheritanceBox() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //cube
    public Seven_inheritanceBox(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    public Seven_inheritanceBox(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Seven_inheritanceBox(Seven_inheritanceBox old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Box is running");
    }

    public static void greeting() {
        System.out.println("Hey I am in Box class. Greetings!!");
    }
}