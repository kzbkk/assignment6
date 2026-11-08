public class SubscriptionReportVisitor implements SubscriptionVisitor {
    @Override
    public void visitBasic(BasicSubscription subscription) {
        System.out.println(
                "Basic subscription: " + subscription.getCustomerName() + ", price: $" + subscription.getMonthlyPrice()
        );
    }
    @Override
    public void visitPremium(PremiumSubscription subscription) {
        System.out.println(
                "Premium subscription: " + subscription.getCustomerName() + ", price: $" + subscription.getMonthlyPrice()
        );
    }
}
