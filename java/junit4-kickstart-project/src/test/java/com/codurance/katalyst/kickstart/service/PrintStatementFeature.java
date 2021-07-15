package com.codurance.katalyst.kickstart.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class PrintStatementFeature {

    @Mock Console console;

    private AccountService accountService;
    private TransactionService transactionService;
    private PrintService printService;

    @Before
    public void initialise(){
        transactionService = new TransactionService();
        printService = new PrintService();
        accountService = new AccountService(transactionService, printService);
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
        InOrder inOrder = inOrder(console);
        inOrder.verify(console).printLine("DATE | AMOUNT | BALANCE");
        inOrder.verify(console).printLine("15/07/2021 | -10.00 | 40.00");
        inOrder.verify(console).printLine("14/07/2021 | -50.00 | 50.00");
        inOrder.verify(console).printLine("13/07/2021 | 100.00 | 100.00");
    }

}
