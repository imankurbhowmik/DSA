public class Three_prettyPrinting {
    public static void main(String[] args) {
        float a = 453.1345f;
        System.out.printf("formatted number is %.3f", a); //453.134

        System.out.printf("Pie : %.3f",Math.PI); ///3.142

        System.out.printf("Hello my name is %s and i am a %s", "Ankur", "Software Developer");
    }
}


// placeholders in java
//%c - character
//%d - decimal number (base10)
//%e - exponential floating-point number 
//%f - floating point number
//%i - integer (base10)
//%o - octal number (base8)
//%s - String
//%u - Unsigned decimal (integer) number
//%x - Hexadecimal number (base16)
//%t - date/time
//%n - newline