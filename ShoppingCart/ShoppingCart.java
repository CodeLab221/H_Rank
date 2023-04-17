import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> productsList;

    public ShoppingCart() {
        productsList = new ArrayList<>();
    }

    public void addItem(String productId, String itemName, double price) {
        /*
         * Add an item to the shopping cart with the given parameters.
         */
        Product newProduct = new Product(productId, itemName, price);
        productsList.add(newProduct);
    }

    public void removeItem(Product product) {
        /*
         * Remove an item from the shopping cart.
         */
        if (productsList.contains(product)) {
            productsList.remove(product);
        } else {
            System.out.println("Product not found in the shopping cart.");
        }
    }

    public void viewItems() {
        /*
         * View the items in the shopping cart.
         */
        System.out.println("Items in the shopping cart:");
        if (!productsList.isEmpty()) {
            for (Product product : productsList) {
                System.out.println("- " + product.getItemName() + " (Product ID: " + product.getProductId() + ", Price: $" + product.getPrice() + ")");
            }
        } else {
            System.out.println("No items in the shopping cart.");
        }
    }

    public void clearCart() {
        /*
         * Clear all items from the shopping cart.
         */
        productsList.clear();
        System.out.println("Shopping cart cleared.");
    }

    private static class Product {
        private String productId;
        private String itemName;
        private double price;

        public Product(String productId, String itemName, double price) {
            this.productId = productId;
            this.itemName = itemName;
            this.price = price;
        }

        public String getProductId() {
            return productId;
        }

        public String getItemName() {
            return itemName;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart myCart = new ShoppingCart();

        // Add items to the cart with parameters
        myCart.addItem("001", "Apple", 0.99);
        myCart.addItem("002", "Banana", 0.49);
        myCart.addItem("003", "Orange", 0.79);

        // View items in the cart
        myCart.viewItems();

        // Remove an item from the cart
        Product productToRemove = new Product("002", "Banana", 0.49);
        myCart.removeItem(productToRemove);

        // View items in the cart after removing an item
        myCart.viewItems();

        // Clear the cart
        myCart.clearCart();

        // View items in the cart after clearing the cart
        myCart.viewItems();
    }
}

