
package one.digitalinnovation.gof.strategy;

public interface PaymentStrategy {
    void pay();
}

class CreditCardPaymentStrategy implements PaymentStrategy {
    public void pay() {
        // Implementação do pagamento com cartão de crédito
    }
}

class DebitCardPaymentStrategy implements PaymentStrategy {
    public void pay() {
        // Implementação do pagamento com cartão de débito
    }
}

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment() {
        strategy.pay();
    }
}
