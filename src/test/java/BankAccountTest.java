import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount = new BankAccount("Marv", "Akib", "25-10-2000", 26, 0);


    @Test
    public void returnFirstName() {
//
        String result = bankAccount.getFirstname();
        assertThat(result).isEqualTo("Marv");

    }

    @Test
    public void returnLastName() {

        String result = bankAccount.getLastname();
        assertThat(result).isEqualTo("Akib");
    }

    @Test
    public void returnDoB() {

        String result = bankAccount.getDateOfBirth();
        assertThat(result).isEqualTo("25-10-2000");
    }

    @Test
    public void returnAccount() {

        int result = bankAccount.getAccountNumber();
        assertThat(result).isEqualTo(26);
    }

    @Test
    public void returnBalance() {

        int result = bankAccount.getBalance();
        assertThat(result).isEqualTo(100);
    }

    @Test
    public void bankDeposit() {
        bankAccount.deposit(100);
        assertThat(bankAccount.getBalance()).isEqualTo(100);
    }


    @Test
    public void bankWithdrawal() {
        bankAccount.withdrawal(100);
        assertThat(bankAccount.getBalance()).isEqualTo(-100);
    }

}


