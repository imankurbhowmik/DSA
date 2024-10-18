public class Twelve_interfaceNiceCar {
    private Twelve_interfaceEngine engine;
    private Twelve_interfaceMedia player = new Twelve_interfaceCDPlayer();

    public Twelve_interfaceNiceCar() {
        engine = new Twelve_interfacePowerEngine();
    }

    public Twelve_interfaceNiceCar(Twelve_interfaceEngine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        engine = new Twelve_interfaceElectricEngine();
    }
}
