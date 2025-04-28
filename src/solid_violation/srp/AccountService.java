package solid_violation.srp;

import java.util.List;

public class AccountService {
    private final TransactionRepository transactionRepository;
    private final Clock clock;

    public AccountService(TransactionRepository transactionRepository, Clock clock) {
        this.transactionRepository = transactionRepository;
        this.clock = clock;
    }

    public void deposit(int amount) {
        transactionRepository.add(new Transaction(clock.today(), amount));
    }

    public void withdraw(int amount) {
        transactionRepository.add(new Transaction(clock.today(), -amount));
    }

    public List<Transaction> getTransactions() {
        return transactionRepository.all();
    }

    public void printStatement(StatementFormatter formatter, StatementPrinter printer) {
        List<String> formattedTransactions = formatter.formatTransactions(transactionRepository.all());
        printer.print(formattedTransactions);
    }

}