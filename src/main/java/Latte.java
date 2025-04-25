public class Latte extends Drink {
    private boolean cinnamon;
    public final double PRICE_CINNAMON = 5;
    public Latte(
            String name, double volume, double price,
            boolean mapleSyrup, boolean cinnamon) {
        super(name, volume, price, mapleSyrup);
        this.cinnamon = cinnamon;
    }

    public boolean isCinnamon() {
        return cinnamon;
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        if (isCinnamon()) {
            totalPrice += PRICE_CINNAMON;
        }
        totalPrice += super.getTotalPrice();
        return totalPrice;
    }
}
