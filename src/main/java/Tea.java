public class Tea extends Drink {
    private boolean mint;
    private double PRICE_MINT = 10;

    public Tea(
            String name, double volume, double price,
            boolean mapleSyrup, boolean mint) {
        super(name, volume, price, mapleSyrup);
        this.mint = mint;
    }

    public boolean isMint() {
        return mint;
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        if (isMint()) {
            totalPrice += PRICE_MINT;
        }
        totalPrice += super.getTotalPrice();
        return totalPrice;
    }
}
