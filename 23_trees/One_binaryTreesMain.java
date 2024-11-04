import java.util.Scanner;

public class One_binaryTreesMain {
    public static void main(String[] args) {
        One_binaryTrees tree = new One_binaryTrees();
        Scanner scanner = new Scanner(System.in);
        tree.populate(scanner);
        tree.prettyDisplay();
    }
}