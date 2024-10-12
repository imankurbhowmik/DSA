public class Six_singleton {
    private Six_singleton (){

    }

    private static Six_singleton instance;

    public static Six_singleton getInstance() {

        // checks whether one object is created or not
        if(instance == null) {
            instance = new Six_singleton();
        }
        return instance;
    }
}
