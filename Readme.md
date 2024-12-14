## Library Management System in Java

### Project Structure:
```shell
src/
├── LibrarySystem/
│   ├── Users/
│   │   ├── User.java
│   │   ├── Librarian.java
│   │   └── Member.java
│   │
│   ├── Books/
│   │   ├── Book.java
│   │   ├── Catalog.java
│   │   └── Genre.java
│   │
│   ├── Transactions/
│   │   ├── BorrowTransaction.java
│   │   ├── ReturnTransaction.java
│   │   └── Transaction.java
│   │
│   ├── Exceptions/
│   │   └── BookNotFoundException.java
│   │
│   └── LibrarySystem.java
│
└── Main.java
```
### Code snippets:

```java
package LibrarySystem.Transactions;

public interface Transaction {
    public void execute() throws Exception;
    public String getTransactionDetails();
}
```
```java
package LibrarySystem.Exceptions;

public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}

```
```java
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
```