import java.util.Scanner;

public class One_binaryTreesMain {
    public static void main(String[] args) {
//        One_binaryTrees tree = new One_binaryTrees();
//        Scanner scanner = new Scanner(System.in);
//        tree.populate(scanner);
//        tree.prettyDisplay();

        Two_BST binaryTree = new Two_BST();
        int[] nums = {5, 10, 20, 5, 12};
        binaryTree.populate(nums);
        binaryTree.display();

    }
}