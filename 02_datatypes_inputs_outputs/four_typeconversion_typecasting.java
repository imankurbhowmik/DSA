import java.util.*;


public class four_typeconversion_typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float num = sc.nextFloat();  // but i will input an integer : two datatypes should be compatible and destination type should be greater than source type 
        
        //converting float to integer : typecasting
        int number = (int)(5358.7649f);
        System.out.println(number);  //5358

        //automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);  //257 % 256 == 1

        byte c = 60;
        byte d = 40;
        byte e = 30;
        int f = (c*d)/e;
        System.out.println(f);  // expression (c*d) is automatically promoted to int by java thats why the below gives an error

        byte g = 40;
        //g = g * 2;

        int h = 'A';
        System.out.println(h);  //65

        //rules:
        // all the byte short and char values are promoted to integer
        // if any of the operands is long/float whole operation would be converted to long/float

        byte h = 42;
        char i = 'a';
        short j = 1024;
        int k = 50000;
        float l = 6747.5874f;
        double m = 0.36523746235;
        double result = (l*h) + (k/i) - (m*j);
        // float + int - double = double
        System.out.println((l*h) + " " + (k/i) + " "  + (m*j));
        System.out.println(result);
    }
    
}