package solid_violation.srp;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StatementFormatter {
    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final String AMOUNT_FORMAT = "#.00";

    public List<String> formatTransactions(List<Transaction> transactions) {
        final AtomicInteger balance = new AtomicInteger(0);
        return transactions.stream()
                .map(transaction -> formatStatementLine(transaction, balance.addAndGet(transaction.amount())))
                .collect(Collectors.toList());
    }

    private String formatStatementLine(Transaction transaction, int balance) {
        return MessageFormat.format("{0} | {1} | {2}",
                formatDate(transaction.date()),
                formatNumber(transaction.amount()),
                formatNumber(balance));
    }

    private String formatDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern(DATE_FORMAT));
    }

    private String formatNumber(int amount) {
        DecimalFormat decimalFormat = new DecimalFormat(AMOUNT_FORMAT, DecimalFormatSymbols.getInstance(Locale.UK));
        return decimalFormat.format(amount);
    }
}