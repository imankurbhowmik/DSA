public class Three_human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;


    static void message() {
        System.out.println("hello world");
//        System.out.println(this.age);  // staic is not dependent on objects so this cannot be used
    }

    public Three_human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Three_human.population+=1;

        Three_human.message();
    }
}
