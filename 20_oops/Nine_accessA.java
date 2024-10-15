public class Nine_accessA {
    private int num;  // for private we cannot access outside the class and for default access modifier we cannot access outside the package
    String name;
    int[] arr;

    public Nine_accessA(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }