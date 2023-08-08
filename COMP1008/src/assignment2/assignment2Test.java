package assignment2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class assignment2Test {
    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account();
    }

    @Test
    void testGetAccountName() {
        assertEquals("TEMP_NAME", account.getAccountName());
    }

    @Test
    void testSetAccountName() {
        assertTrue(account.setAccountName("John Doe"));
        assertEquals("John Doe", account.getAccountName());

        assertFalse(account.setAccountName("John--  ''"));
        assertEquals("John Doe", account.getAccountName());
    }

    @Test
    void testGetAccountNumber() {
        assertEquals(0, account.getAccountNumber());
    }

    @Test
    void testSetAccountNumber() {
        assertTrue(account.setAccountNumber(987654321));
        assertEquals(987654321, account.getAccountNumber());

        assertFalse(account.setAccountNumber(1234));
        assertEquals(987654321, account.getAccountNumber());
    }

    @Test
    void testGetAccountBalance() {
        assertEquals(0.0, account.getAccountBalance());
    }

    @Test
    void testSetAccountBalance() {
        assertTrue(account.setAccountBalance(1000.0));
        assertEquals(1000.0, account.getAccountBalance());

        assertFalse(account.setAccountBalance(-500.036));
        assertEquals(1000.0, account.getAccountBalance());
    }

    @Test
    void testEquals() {
        Account account1 = new Account("John Doe", 987654321, 1000.0);
        Account account2 = new Account("John Doe", 987654321, 1000.0);
        Account account3 = new Account("John Smith", 123456789, 500.0);

        assertTrue(account1.equals(account2));
        assertFalse(account1.equals(account3));
    }

    @Test
    void testToString() {
        Account account = new Account("John Doe", 987654321, 1000.0);
        String expected = "Account{accountName='John Doe', accountNumber=987654321, accountBalance=1000.0}";

        assertEquals(expected, account.toString());
    }
}
