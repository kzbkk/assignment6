import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Subscription> subscriptions = Arrays.asList(
                new BasicSubscription("Ernar", 10.0),
                new PremiumSubscription("Alan", 20.0),
                new BasicSubscription("Rahat", 10.0)
        );
        SubscriptionReportVisitor reportVisitor = new SubscriptionReportVisitor();
        PriceCalculatorVisitor priceVisitor = new PriceCalculatorVisitor();
        System.out.println("SUBSCRIPTION REPORT:");
        for (Subscription subscription : subscriptions) {
            subscription.accept(reportVisitor);
        }
        for (Subscription subscription : subscriptions) {
            subscription.accept(priceVisitor);
        }
        System.out.println("Total monthly price: $" + priceVisitor.getTotalPrice());
    }
}
