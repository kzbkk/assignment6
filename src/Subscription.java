public interface Subscription {
    void accept(SubscriptionVisitor visitor);
}
