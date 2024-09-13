public class TwentyOne_stream {
    public static void main(String[] args) {
//        String str = "bccdaaah";
//        skip("", str);
//        System.out.println(skip2(str));
        String str = "cbsjsbsapplkjbcfdsfkjdsb";
        System.out.println(skipAppNotApple(str));
    }
    public static void skip(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(up.charAt(0) == 'a') {
            skip(p, up.substring(1));
        }else{
            skip(p + ch, up.substring(1) );
        }
    }

    public static String skip2(String up) {
        if(up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a') {
            return skip2(up.substring(1));
        }else {
            return ch + skip2(up.substring(1));
        }
    }

    public static String skipApple(String up) {
        if(up.isEmpty()) {
            return "";
        }

        if(up.startsWith("apple")) {
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    public static String skipAppNotApple(String str) {
        if(str.isEmpty()) {
            return "";
        }

        if(str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppNotApple(str.substring(3));
        }else {
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }
}