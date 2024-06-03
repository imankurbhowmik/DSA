//how to approach
// run the outer for loop no of times we have lines no of lines == no of rows == no of times outer for loop will run 
// identify for every row no how many colums are there or types of elements in the column

public class Main  {
    public static void main(String args[]) {
        pattern1(4);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(4);
        System.out.println();
        pattern4(4);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern32(4);
        System.out.println();
        // pattern31(4);
    }    

    static void pattern1(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    static void pattern5(int n) {
        for(int i=1; i<=2*n-1; i++) {
            int totalCols = i<=n ? i : 2*n-i; 
            for(int j=1; j<=totalCols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern32(int n) {
        n = 2*n;
        int elementAtEveryIndex = 0;
        for(int row = 0; row<= n; row++) {
            for(int col= 0; col<=n; col++) {
                elementAtEveryIndex = Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(elementAtEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
