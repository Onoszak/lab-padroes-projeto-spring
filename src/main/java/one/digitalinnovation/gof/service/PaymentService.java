
package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.factory.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public void processPayment(String type) {
        Payment payment = Payment.createPayment(type);
        payment.pay();
    }
}

package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.template.DataProcessor;
import one.digitalinnovation.gof.template.JSONDataProcessor;
import one.digitalinnovation.gof.template.XMLDataProcessor;
import org.springframework.stereotype.Service;

@Service
public class DataService {
    public void processData(String type) {
        DataProcessor processor;
        if (type.equals("xml")) {
            processor = new XMLDataProcessor();
        } else if (type.equals("json")) {
            processor = new JSONDataProcessor();
        } else {
            throw new IllegalArgumentException("Unknown data type");
        }
        processor.process();
    }
}
