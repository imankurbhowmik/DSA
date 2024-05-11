import java.util.*;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        if(salary<10000){
            System.out.println("garib");
        }else if(salary > 10000 && salary < 20000 ){
            System.out.println("not garib");
        }else{
            System.out.println("dhoni");
        }
    }
}