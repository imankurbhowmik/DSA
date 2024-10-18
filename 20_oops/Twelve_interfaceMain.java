public class Twelve_interfaceMain {
    public static void main(String[] args) {

        Twelve_interfaceCar car = new Twelve_interfaceCar();

        car.stop();
        car.acc();
        car.brake();
        car.start();


        Twelve_interfaceMedia carMedia = new Twelve_interfaceCar();
        carMedia.stop();

        Twelve_interfaceNiceCar niceCar = new Twelve_interfaceNiceCar();
        niceCar.start();
        niceCar.stopMusic();
        niceCar.upgradeEngine();
        niceCar.start();



        //
        B obj = new B();
        System.out.println(obj.isOdd(5));
    }
}