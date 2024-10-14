public class Eight_polymorphismNumbers {
    public static void main(String[] args) {

        Eight_polymorphismNumbers obj = new Eight_polymorphismNumbers();


        System.out.println(obj.num(2, 3));
        System.out.println(obj.num(2, 3, 4));
    }

    int num(int a, int b) {
        return a+b;
    }

    int num(int a, int b, int c) {
        return a+b+c;
    }


}
