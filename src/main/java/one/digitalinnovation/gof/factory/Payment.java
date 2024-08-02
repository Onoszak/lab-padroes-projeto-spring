
package one.digitalinnovation.gof.factory;

public abstract class Payment {

    public abstract void pay();

    public static Payment createPayment(String type) {
        if (type.equals("credit")) {
            return new CreditCardPayment();
        } else if (type.equals("debit")) {
            return new DebitCardPayment();
        } else {
            throw new IllegalArgumentException("Unknown payment type");
        }
    }
}

class CreditCardPayment extends Payment {
    public void pay() {
        // Implementação do pagamento com cartão de crédito
    }
}

class DebitCardPayment extends Payment {
    public void pay() {
        // Implementação do pagamento com cartão de débito
    }
}
