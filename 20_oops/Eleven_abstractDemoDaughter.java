public class Eleven_abstractDemoDaughter extends Eleven_abstractDemoParent{

    public Eleven_abstractDemoDaughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be an engineer");
    }

    @Override
    void partner() {
        System.out.println("I love Ankur");
    }
}