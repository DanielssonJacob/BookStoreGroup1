import java.util.ArrayList;
import java.util.List;

public class Cart {

    private int orderId;
    private List<Book> cart;

    public Cart(int orderId) {
        this.orderId = orderId;
        this.cart = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<Book> getCart() {
        return cart;
    }

    public void setCart(List<Book> cart) {
        this.cart = cart;
    }

    public void addItem(Book book) {
        cart.add(book);
    }

    public void remove(int index) {
        cart.remove(index);
    }

    public double getTotal() {
        double total = 0;
        for (Book book : cart) {
            total += book.getPrice;
        }
        return total;
    }

    public String getListString() {
        StringBuilder listString = new StringBuilder();
        int i = 0;
        for (Book book : cart) {
            listString.append(i).append(" ").append(book.toString()).append("\n");
            i++;
        }
        return listString.toString();
    }

    public String getReceipt() {
        return getListString() + "\n" + "Total: " + getTotal();
    }

}


