public class Four_fiboFormula {
    public static void main(String[] args) {
        System.out.println(fiboFormula(7));
    }

    static int fiboFormula(int n) {
        return (int)((Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n) )/Math.sqrt(5));
    }
}
