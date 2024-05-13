import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Enter the operator : ");
            char c = sc.next().trim().charAt(0);
            if(c == '+' || c == '-' || c == '*' || c == '/' || c == '%'){
                System.out.println("Enter the two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if(c == '+'){
                    ans = num1 + num2;
                }
                if(c == '-'){
                    ans = num1 - num2;
                }
                if(c == '*'){
                    ans = num1 * num2;
                }
                if(c == '/'){
                    ans = num1 / num2;
                }
                if(c == '%'){
                    ans = num1 % num2;
                }
            }else if(c == 'x' || c== 'X'){
                break;
            }else{
                System.out.println("invalid operator");
                break;
            }System.out.println(ans);
        }
    }
}
