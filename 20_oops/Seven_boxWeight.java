public class Seven_boxWeight extends Seven_inheritanceBox {
    double weight;

    public Seven_boxWeight() {
        this.weight = -1;
    }

    public Seven_boxWeight(double l, double h, double w, double weight) {
        super(l, h, w);  // call the parent class constructor
        // used to initialise values present in parent class
        this.weight = weight;
    }

    Seven_boxWeight(Seven_boxWeight other) {
        super(other);   // this is similar to Seven_inheritanceBox box = new Seven_boxWeight();
        weight = other.weight;
    }
}
