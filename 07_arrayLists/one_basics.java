import java.util.*;

public class one_basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);

        // System.out.println(list.set(0, 99));
        // System.out.println(list.remove(0));
        // System.out.println(list);
        // System.out.println(list.contains(56));


        for(int i=0; i<5 ;i++){
            list.add(sc.nextInt());
        }

        for(int i=0; i<5 ; i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);


        // size is fixed internally
        // say arraylist fills by some amount
        // it will create a new arraylist of say double the size
        // old elements are copied in the new one
        //the old one is deleted

        // amortised time complexity O(1)
    }
}