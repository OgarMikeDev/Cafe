public class Americano extends Drink {
    private boolean milk;
    public final double PRICE_MILK = 20;

    public Americano(
            String name, double volume, double price,
            boolean mapleSyrup, boolean milk) {
        super(name, volume, price, mapleSyrup);
        this.milk = milk;
    }

    public boolean isMilk() {
        return milk;
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        if (isMilk()) {
            totalPrice += PRICE_MILK;
        }
        totalPrice += super.getTotalPrice();
        return totalPrice;
    }
}
