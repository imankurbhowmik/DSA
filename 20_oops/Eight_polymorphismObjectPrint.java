public class Eight_polymorphismObjectPrint {
    int num;

    public Eight_polymorphismObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Eight_polymorphismObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        Eight_polymorphismObjectPrint obj = new Eight_polymorphismObjectPrint(54);
        System.out.println(obj);
    }
}