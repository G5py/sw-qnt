import java.util.List;

public class FinalPriceCalculator {
    private final List<PriceRule> rules;

    public FinalPriceCalculator(List<PriceRule> rules) {
        this.rules = rules;
    }

    public double calculate(ShoppingCart cart) {
        return rules.stream()
                .map(rule -> rule.priceToAggregate(cart))
                .reduce(Double::sum)
                .get();
    }
}
