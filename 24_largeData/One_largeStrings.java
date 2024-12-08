import java.text.DecimalFormat;
import java.util.Arrays;

public class One_largeStrings {
    public static void main(String[] args) {

        // constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());


        // constructor 2
        StringBuffer sb2 = new StringBuffer("Ankur Bhowmik");

        // constructor 3
        StringBuffer sb3 = new StringBuffer(30);


        sb.append("WeMakeDevs");
        sb.append(" is nice!");

        sb.insert(2, " Ankur ");
        sb.replace(1, 5, "Bhowmik");
        sb.delete(1, 5);
        sb.reverse();

        String str = sb.toString();
        System.out.println(str);

        int n = 20;
        String name = Two_randomString.generate(n);
        System.out.println(name);

        //remove whiteSpaces

        String sentence = "hddj     vfgu      udfhnv";
        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\s", ""));


        // split
        String names = "Ankur Devdutt Rohit";
        String[] arr = names.split(" ");

        System.out.println(Arrays.toString(arr));

        // rounding off
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));   // 07.2900
    }
}