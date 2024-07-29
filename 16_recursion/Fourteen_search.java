import java.util.ArrayList;

public class Fourteen_search {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 3 ,6, 89, 90};
    //    System.out.println(search(arr, 90, 0)); 
       //System.out.println(searchIndex(arr, 90, 0)); 
       findAllIndex(arr, 3, 0);
       System.out.println(list);
    }

    static boolean search(int[] arr, int target, int index) {
        if(index == arr.length) {
            return false;
        }

        return arr[index] == target || search(arr, target, index+1);
    }
    
    static int searchIndex(int[] arr, int target, int index) {
        if(index == arr.length) {
            return -1;
        }

        if(arr[index] == target) {
            return index;
        }
        else {
            return searchIndex(arr, target, index+1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex (int[] arr, int target, int index) {
        if(index == arr.length) {
            return;
        }

        if(arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }
}
