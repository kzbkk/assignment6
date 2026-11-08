public class PremiumSubscription implements Subscription {
    private String customerName;
    private double monthlyPrice;
    public PremiumSubscription(String customerName, double monthlyPrice) {
        this.customerName = customerName;
        this.monthlyPrice = monthlyPrice;
    }
    public String getCustomerName() {
        return customerName;
    }
    public double getMonthlyPrice() {
        return monthlyPrice;
    }
    @Override
    public void accept(SubscriptionVisitor visitor) {
        visitor.visitPremium(this);
    }
}
