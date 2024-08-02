
package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/{type}")
    public ResponseEntity<Void> pay(@PathVariable String type) {
        paymentService.processPayment(type);
        return ResponseEntity.ok().build();
    }
}

package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired
    private DataService dataService;

    @PostMapping("/{type}")
    public ResponseEntity<Void> processData(@PathVariable String type) {
        dataService.processData(type);
        return ResponseEntity.ok().build();
    }
}
