public class PriceCalculatorVisitor implements SubscriptionVisitor {
    private double totalPrice = 0;
    @Override
    public void visitBasic(BasicSubscription subscription) {
        totalPrice += subscription.getMonthlyPrice();
    }
    @Override
    public void visitPremium(PremiumSubscription subscription) {
        totalPrice += subscription.getMonthlyPrice();
    }
    public double getTotalPrice() {
        return totalPrice;
    }
}
