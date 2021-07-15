package com.codurance.katalyst.kickstart.service;

public class AccountService {

    private TransactionService transactionService;
    private PrintService printService;

    public AccountService(TransactionService transactionService, PrintService printService) {
        this.transactionService = transactionService;
        this.printService = printService;
    }

    public void deposit(int amount){
        transactionService.deposit(amount);
    }

    public void withdraw(int amount){
        transactionService.withdraw(amount);
    }

    public void printStatement(){
        printService.printStatement();
    }


}
