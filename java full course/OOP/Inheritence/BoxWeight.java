package OOP.Inheritence;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double h, double l, double w, double weight) {
        super(h, l, w);// calling parent class constructor
        // used to initialise values present in parent class
        this.weight = weight;
    }
}
