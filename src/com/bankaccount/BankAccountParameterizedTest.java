package com.bankaccount;

import com.bankaccount.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountParameterizedTest {
    private BankAccount.BankAccount bankAccount;

    @BeforeEach
    public void setup() {
        bankAccount = new BankAccount.BankAccount("Mimin","jono", 1000.00, BankAccount.BankAccount.CHECKING);
        System.out.println("Running a test");
    }

    static Stream<Arguments> testConditions() {
        return Stream.of(
                Arguments.of(100.00, 1100.00),
                Arguments.of(200.00, 1200.00),
                Arguments.of(325.14, 1325.14),
                Arguments.of(498.13, 1498.13),
                Arguments.of(1000.00, 2000.00)
        );
    }

    @ParameterizedTest
    @MethodSource("testConditions")
    void deposit(double deposit, double expected) {
        double balance = bankAccount.deposit(deposit, true);
        assertEquals(expected, balance, .01);
    }
}
