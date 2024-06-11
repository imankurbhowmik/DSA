public class Four_fibonacci {
    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);
    }

    static int fibo(int n) {
        if(n<2) {
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}


// how to understand and approach a problem
// identify if we can break down the problem into smaller problems
// write the recurrence relation if needed
// draw the recursive tree
// about the tree // see the flow of functions how they are getting in stack ; identify and focus on left tree calls and right tree calls  draw the treee and pointers again and again on paper
// see how the values are returned at each step; see where the function call will come out and in the end we will come out of the main function