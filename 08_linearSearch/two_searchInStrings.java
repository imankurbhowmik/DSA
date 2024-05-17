public class two_searchInStrings {
    public static void main(String[] args) {
        String str = "Ankur Bhowmik";
        char ch = 'i';
        System.out.println(charSearch(str, ch));
    }

    static boolean charSearch(String str, char ch){
        if(str.length() == 0){
            return false;
        }
        for(char c : str.toCharArray()){
            if(c == ch){
                return true;
            }
        }return false;
    }
}