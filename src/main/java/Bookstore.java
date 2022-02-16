import java.util.List;

public class Bookstore {
    private List<Book> Bookstore = new List<Book>();
    private List<Customer> CustomerList = new List<Customer>();


    public static void showBooks() {
        for (Book book: Bookstore) {
            System.out.println(book.getName());
        }
    }
    public static void showCustomers() {
        for (Customer customer: CustomerList) {
            System.out.println(customer.getName());
        }
    }


}
