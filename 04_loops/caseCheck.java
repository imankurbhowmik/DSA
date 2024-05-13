import java.util.*;

public class caseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().trim().charAt(0);
        if(c >= 'a' && c <= 'z'){
            System.out.println("lowercased");
        }else{
            System.out.println("uppercased");
        }
    }
}