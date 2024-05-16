public class one_basics{
    public static void main(String args[]){
        int[] arr = new int[5];
        // System.out.println(arr[2]);  0   by default

        String[] str = new String[9];
        // System.out.println(str[3]);   null  by default

        int[] arr2 = {1, 45, 67};

        // int[] ros; => declaration of array ros is defined in the stack  (compile time)
        // new int[5]; => initialisation : actually here object is being created in  the heap  (runtime/ dynamic memory allocation)
        // new is used to create an object

        // array objects are in heap
        // heap objects are not continuous
        // dynamic memory allocation
        // java internally array may not be continuous it depends on jvm
    }
}