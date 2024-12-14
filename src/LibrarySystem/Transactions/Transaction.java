package LibrarySystem.Transactions;

public interface Transaction {
    public void execute() throws Exception;
    public String getTransactionDetails();
}
