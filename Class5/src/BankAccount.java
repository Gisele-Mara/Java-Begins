public class BankAccount {

    private int clientNumber;
    private String clientName;

    private float balance;

    private float sum = 0;


    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {

        this.balance = balance;
    }

    public void depositAmount (float valueToDeposit){
        setBalance(getBalance() + valueToDeposit);
    }

    public boolean withdrawOption (float valueToWithdraw) {
        float finalBalance;
        if (this.balance > valueToWithdraw){
            return false;
        } else {
            finalBalance = getBalance() - valueToWithdraw;
            setBalance(finalBalance);
            return true;
        }

    }
}
