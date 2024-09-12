public class Sixteen_triangle {
    public static void main(String[] args) {
        triangle(4, 0);
        triangle2(3, 0);
    }

    static void triangle(int row, int column) {
        if(row == 0) {
            return;
        }

        if(column < row) {
            System.out.print("*");
            triangle(row, column+1);
        }
        if(column == row) {
            System.out.println();
            triangle(row-1, 0);
        }
    }

    static void triangle2(int row, int column) {
        if(row == 0) {
            return;
        }

        if(column < row) {
            triangle2(row, column+1);
            System.out.print("*");
        }
        if(column == row) {
            triangle2(row-1, 0);
            System.out.println();
        }
    }
}