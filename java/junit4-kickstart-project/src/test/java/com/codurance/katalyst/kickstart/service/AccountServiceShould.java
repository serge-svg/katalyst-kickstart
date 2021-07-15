package com.codurance.katalyst.kickstart.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AccountServiceShould {

    private AccountService accountService;
    @Mock
    private TransactionService transactionService;
    @Mock
    private PrintService printService;

    @Before
    public void initialise(){
        accountService = new AccountService(transactionService, printService);
    }

    @Test
    public void make_a_deposit(){
        accountService.deposit(100);

        verifyNoInteractions(printService);
        verify(transactionService).deposit(100);
        verify(transactionService, never()).withdraw(anyInt());
    }

    @Test
    public void make_a_withdraw(){
        accountService.withdraw(50);

        verifyNoInteractions(printService);
        verify(transactionService).withdraw(50);
        verify(transactionService, never()).deposit(anyInt());
    }

    @Test
    public void call_print_service_with_none_operation_interaction(){
        accountService.printStatement();

        verifyNoInteractions(transactionService);
        verify(printService).printStatement();
    }


}
