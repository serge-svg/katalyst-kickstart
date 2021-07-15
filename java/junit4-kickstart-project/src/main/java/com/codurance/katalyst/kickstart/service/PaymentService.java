package com.codurance.katalyst.kickstart.service;

public class PaymentService {

    private FraudService fraudService;
    private PaymentGateway paymentGateway;

    public PaymentService(FraudService fraudService, PaymentGateway paymentGateway) {
        this.fraudService = fraudService;
        this.paymentGateway = paymentGateway;
    }

    public void paymentProcess(User user, PaymentDetails paymentDetails) throws Exception {
        if (fraudService.isValid(user, paymentDetails)){
            paymentGateway.makePayment(paymentDetails);
        }else{
            throw new Exception();
        }

    }
}


