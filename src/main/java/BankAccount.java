public class BankAccount {

    private String firstname;
    private String lastname;
    private String dateOfBirth;
    private Integer accountNumber;

    private Integer balance;

    public BankAccount(String firstname, String lastname, String dateOfBirth, Integer accountNumber, Integer balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;


    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

//    deposit method
    public void deposit(int amount){
        balance += amount;

    }

//    withdrawal method

    public void withdrawal(int amount){
    balance -= amount;

    }


}


