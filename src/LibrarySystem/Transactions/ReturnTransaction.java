package LibrarySystem.Transactions;

import LibrarySystem.Exceptions.BookNotFoundException;

public class ReturnTransaction implements Transaction {
    @Override
    public void execute() throws BookNotFoundException {
        // Return transaction logic
    }

    @Override
    public String getTransactionDetails() {
        return "Return transaction";
    }
}
