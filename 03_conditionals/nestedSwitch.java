import java.util.*;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String department = sc.next();
        switch(empId){
            case 1 -> System.out.println("Rahul");
            case 2 -> System.out.println("Jugol");
            case 3 -> {
                System.out.println("Hari");
            switch(department){
                case "IT" -> System.out.println("IT");
                case "Management" -> System.out.println("Management");
                default -> System.out.println("No dept entered");
            }
        }
            default -> System.out.println("Enter valid employee id");

        }
    }
}