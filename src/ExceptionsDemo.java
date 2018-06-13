import java.sql.SQLException;

public class ExceptionsDemo {
    public static void main(String[] args) {

        Account acc = new Account();
        try {
            System.out.println("first line");
            acc.withdraw(100);
            System.out.println("After trying the withdraw method");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Try again later");
        }
        finally {
            System.out.println("Always executes");
        }
    }
}
