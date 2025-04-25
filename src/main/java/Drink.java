public abstract class Drink {
    private String name;
    private double volume;
    private double price;
    private boolean mapleSyrup;

    public final double PRICE_MAPLE_SYRUP = 30;

    public Drink(String name, double volume, double price, boolean mapleSyrup) {
        this.name = name;
        this.volume = volume;
        this.price = price;
        this.mapleSyrup = mapleSyrup;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public double getPrice() {
        return price;
    }

    public boolean isMapleSyrup() {
        return mapleSyrup;
    }

    public double getTotalPrice() {
        double totalPrice = getPrice();
        if (isMapleSyrup()) {
            totalPrice += PRICE_MAPLE_SYRUP;
        }

        return totalPrice;
    }
}
