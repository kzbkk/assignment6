
public interface SubscriptionVisitor {
    void visitBasic(BasicSubscription subscription);
    void visitPremium(PremiumSubscription subscription);
}
