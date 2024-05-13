import java.util.*;

public class switchCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String fruit = sc.next();
        // switch(fruit){
        //     case "orange":
        //     System.out.println("round fruit");
        //     break;
        //     case "mango":
        //     System.out.println("king of fruits");
        //     break;
        //     case "apple":
        //     System.out.println("a sweet red fruit");
        //     break;
        //     case "grapes":
        //     System.out.println("a small fruit");
        //     break;
        //     default:
        //     System.out.println("please enter a valid fruit");
        // }

        int day = sc.nextInt();
        switch(day){
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
        }
    }
}