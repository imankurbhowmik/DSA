public class Twelve_interfaceNested {

    //nested interface
    public interface nestedInterface {
        boolean isOdd(int num);
    }
}

class B implements Twelve_interfaceNested.nestedInterface{
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}