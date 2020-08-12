import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountParameterizedTest {
    private BankAccount bankAccount;

    @BeforeEach
    public void setup() {
        bankAccount = new BankAccount("Mimin","jono", 1000.00, BankAccount.CHECKING);
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
