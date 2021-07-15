package com.codurance.katalyst.kickstart.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PrintStatementFeature {

    private AccountService accountService;
    @Mock
    private Console console;

    @Before
    public void initialise(){
        accountService = new AccountService();
    }

    @Test
    public void print_bank_statement(){
        // Given
        accountService.deposit(100);
        accountService.withdraw(50);
        accountService.withdraw(10);

        // When
        accountService.printStatement();
        // Then
        verify(console).print("DATE | AMOUNT | BALANCE");
        verify(console).print("15/07/2021 | 100.00 | 100.00");
        verify(console).print("15/07/2021 | -50.00 | 50.00");
        verify(console).print("15/07/2021 | -10.00 | 40.00");
    }

}
