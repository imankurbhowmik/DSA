public class Ten_objectDemo {

    int num;
    float gpa;

    public Ten_objectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }


    // gives number representation of an object
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Ten_objectDemo obj = new Ten_objectDemo(34, 56.6f);
        Ten_objectDemo obj2 = new Ten_objectDemo(34, 78.9f);


        if(obj == obj2) {
            System.out.println("obj is equal to obj2");
        }
        if(obj.equals(obj2)) {
            System.out.println("obj is equal to obj2");
        }

//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }
}