package com.bankaccount;

import com.bankaccount.BankAccount;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount.BankAccounts account;

    @BeforeAll
    static void first() {
        System.out.println("This is the first to run");
    }

    @BeforeEach
    void setup() {
        account = new BankAccount.BankAccounts("Listya", "Tapp", 700, BankAccount.BankAccounts.CHECKING);
        System.out.println("Running test");
    }

    @Test
    void deposit() {

        double balance = account.deposit(200, true);
        assertEquals(900, balance, 0);
        assertEquals(900,account.getBalance(), 0);

    }

    @Test
    void withdraw_atBranch() {
       double balance = account.withdraw(600, true);
       assertEquals(100, balance);

    }

    @Test
    void withdraw_notBranch() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(600, false);
        });

    }

    @Test
    void getBalance_deposit() {

        account.deposit(200, true);
        assertEquals(900, account.getBalance(), 0);
    }

    @Test
    void getBalance_withdraw() {

        account.withdraw(200, true);
        assertEquals(500, account.getBalance(), 0);
    }

    @Test
    void isChecking_true() {

        assertTrue(account.isChecking());
    }

    @AfterAll
    static void after() {
        System.out.println("After all");
    }

}