public class BankStatementGenerator {
    public static void main(String[] args) {
        StringBuilder statement = new StringBuilder();

        statement.append("=========== BANK STATEMENT ===========\n")
                 .append("Account Holder : Alice\n")
                 .append("Account Number : 1001\n")
                 .append("--------------------------------------\n")
                 .append("Deposit         : $500.00\n")
                 .append("Withdrawal      : $200.00\n")
                 .append("Current Balance : $4300.00\n")
                 .append("======================================");

        System.out.println("Original Statement:\n");
        System.out.println(statement);

        int start = statement.indexOf("Alice");
        int end = start + "Alice".length();
        statement.replace(start, end, "Kaja");

        int deleteStart = statement.indexOf("Withdrawal");
        int deleteEnd = statement.indexOf("Current Balance");
        statement.delete(deleteStart, deleteEnd);

        System.out.println("\nModified Statement:\n");
        System.out.println(statement);
    }
}
