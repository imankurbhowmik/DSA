public class Eleven_abstractDemoMain {

    public static void main(String[] args) {
        Eleven_abstractDemoSon son = new Eleven_abstractDemoSon(34);
        son.career();

        Eleven_abstractDemoDaughter daughter = new Eleven_abstractDemoDaughter(21);
        daughter.career();

        Eleven_abstractDemoParent.gello();
    }

}