public abstract class Eleven_abstractDemoParent {

    int age;

    public Eleven_abstractDemoParent(int age) {
        this.age = age;
    }

    static void gello() {
        System.out.println("Heyy");
    }

    void normal() {
        System.out.println("this is a normal method");
    }

    abstract void career ();
    abstract void partner ();
}