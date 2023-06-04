public abstract class CheckoutProcess {
    public void process() {
        selectItems();
        applyDiscounts();
        calculateShipping();
        choosePayment();
        confirmOrder();
    }

    protected abstract void selectItems();

    protected abstract void applyDiscounts();

    protected abstract void calculateShipping();

    protected abstract void choosePayment();

    protected abstract void confirmOrder();
}
