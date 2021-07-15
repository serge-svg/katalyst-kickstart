package com.codurance.katalyst.kickstart.service;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PaymentServiceShould {

    public static final User USER = new User();
    public static final PaymentDetails PAYMENT_DETAILS = new PaymentDetails();
    //public static final PaymentDetails PAYMENT_DETAILS = new PaymentDetails();

    @Mock
    private FraudService mockFraudService;
    @Mock
    private PaymentGateway mockPaymentGateway;

    private PaymentService paymentService;

    @Before
    public void initialise(){
        paymentService = new PaymentService(mockFraudService, mockPaymentGateway);
    }

    @Test
    public void check_if_paymentDetail_is_correct() {
        when(mockFraudService.isValid(USER, PAYMENT_DETAILS)).thenReturn(true);
        try {
            paymentService.paymentProcess(USER, PAYMENT_DETAILS);
            verify(mockPaymentGateway).makePayment(PAYMENT_DETAILS);
        } catch (Exception e){

        }

    }
}
