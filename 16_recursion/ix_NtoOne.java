public class Six_NtoOne {
    public static void main(String[] args) {
        // print(5);
        ///printReverse(5);
        concept(5);
    }

    // concept : --n and n--

    static void concept(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        //concept(n--);
        concept(--n);
    }




    static void print (int n) {
        if (n==0) {
            return;
        }

        System.out.println(n);
        print(n-1);
    }

    static void printReverse (int n) {
        if (n==0) {
            return;
        }

        printReverse(n-1);
        System.out.println(n);
    }
}
