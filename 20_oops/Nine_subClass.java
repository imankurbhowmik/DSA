public class Nine_subClass extends Nine_accessA {

    public Nine_subClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Nine_accessA obj = new Nine_accessA(23, "Ankur");
//        int n = obj.num;  // cannot be accessed via its own class in diff package when protected
            // we can access protected member in a subclass of a subclass
    }
}
