class Invoice {
    String name, product;
    int quantity;
    double price, totalPrice;

    Invoice(String n, String pro, double pri, int q) {
        name = n;
        product = pro;
        quantity = q;
        price = pri;      
    }

    void display() {
        System.out.println("name : " + name);
        System.out.println("quantity : " + quantity);
        System.out.println("product : " + product);
        System.out.println("price : " + price);
        System.out.println("totalPrice : " + (price*quantity));
    }
}

class InvoiceProgram{
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Anish", "Books", 120, 2);
        invoice.display();
    }
}