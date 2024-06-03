public class Two_numbers {
    public static void main(String[] args) {
        // write a function that takes input as a number and prints it
        // print first five numbers : 1 2 3 4 5

        print1(1);
    }

    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }
    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }
    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }
    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }
    static void print5(int n) {
        System.out.println(n);
    }
}

// important points

// while the function is not finished executing it will remain in the stack
// when a function finishes executing it is removed from the stack and the flow of program is restored to where it was called


