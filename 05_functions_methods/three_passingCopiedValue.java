public class three_passingCopiedValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);

        System.out.println(a +" " +b);  // 10  20
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a +" " +b);  // 20 10
    }
}