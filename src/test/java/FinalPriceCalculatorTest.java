import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FinalPriceCalculatorTest {

    @Test
    void calculate() {
        // given
        ShoppingCart cart = new ShoppingCart();
        cart.add(new Item(ItemType.OTHER, "ITEM", 1, 1));

        PriceRule rule1 = mock(PriceRule.class);
        PriceRule rule2 = mock(PriceRule.class);
        PriceRule rule3 = mock(PriceRule.class);

        when(rule1.priceToAggregate(cart)).thenReturn(1.0);
        when(rule2.priceToAggregate(cart)).thenReturn(0.0);
        when(rule3.priceToAggregate(cart)).thenReturn(2.0);

        List<PriceRule> ruleList = List.of(rule1, rule2, rule3);

        // when
        double actualOutput = new FinalPriceCalculator(ruleList).calculate(cart);

        // then
        assertEquals(3.0, actualOutput);
    }
}