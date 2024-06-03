public class Three_numbersRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n) {
        System.out.println(n);
        if(n==5) {
            return;
        }
        print(n+1);
    }
}

// base condition in recursion : condition where our recursion will stop making new calls
// if we r calling a function again and again we can treat it as a separate call in the stack
// no base condition => function calls will keep happening stack will get filled again and again until memory of computer exceed the limit => stack overflow error
// why recursion : it helps us in solving bigger/ complex problems in a simple way