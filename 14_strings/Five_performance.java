public class Five_performance {
    public static void main(String[] args) {
        String series = "";
        for(int i=0; i<26; i++){
            char ch = (char)('a' + i);
            series += ch;
        }
        System.out.println(series);
        // time complexity of O(N^2)  we can modify using string builder
    }
}