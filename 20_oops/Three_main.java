public class Three_main {
    public static void main(String[] args) {
        Three_human Ankur = new Three_human(21, "Ankur", 10000, false);
        Three_human Rahul = new Three_human(21, "rahul", 10000, false);

        System.out.println(Ankur.name);

        System.out.println(Three_human.population);  //2
        System.out.println(Three_human.population);  //2

        Three_main funn = new Three_main();
        funn.fun2();
    }

    // this is not dependent on objects
    static void fun() {
        //greeting();  // we cannot use this bcz it requires an instance
        // but the function we are using it in doesnt require an instance



        // we cannnot access a non static stuff without referencing their instances in a static context

        // hence we are referencing it here
        Three_main obj = new Three_main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // we know that something that is non static belongs to an object
    void greeting() {
        System.out.println("Hello world");
    }
}
