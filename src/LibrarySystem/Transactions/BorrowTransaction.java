package LibrarySystem.Transactions;

import LibrarySystem.Exceptions.BookNotFoundException;

public class BorrowTransaction implements Transaction{
    @Override
    public void execute() throws BookNotFoundException {
     // Borrow Transaction logic goes here
    }

    @Override
    public String getTransactionDetails() {
        return "Borrow transaction";
    }
}
