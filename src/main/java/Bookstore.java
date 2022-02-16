import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private List<Book> Bookstore = new ArrayList<>();
    private List<Customer> CustomerList = new ArrayList<>();


    public  void showBooks() {
        for (Book book: Bookstore) {
            System.out.println(book.getTitle());
        }
    }
    public  void showCustomers() {
        for (Customer customer: CustomerList) {
            System.out.println(customer.getFirstName() + " " + customer.getLastName());
        }
    }

    Book book = new Book();


}
