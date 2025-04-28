package solid_violation.srp;

import java.util.Collections;
import java.util.List;

public class StatementPrinter {
    private static final String STATEMENT_HEADER = "DATE | AMOUNT | BALANCE";
    private final Console console;

    public StatementPrinter(Console console) {
        this.console = console;
    }

    public void print(List<String> formattedTransactions) {
        console.printLine(STATEMENT_HEADER);
        Collections.reverse(formattedTransactions);
        formattedTransactions.forEach(console::printLine);
    }
}