public class Seven_boxPrice extends Seven_boxWeight{
    double cost;

    Seven_boxPrice() {
        super();
        this.cost =-1;
    }

    Seven_boxPrice(Seven_boxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public Seven_boxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }
}