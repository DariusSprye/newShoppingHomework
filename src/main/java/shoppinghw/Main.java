package shoppinghw;

public class Main {

    public static void main(String[] args) {
        // create a product shirt
        Product product1 = new Product("Shirt", 75.0, Size.LARGE);
        Product product2 = new Product("Pants", 100.0, Size.MEDIUM);
        Product product3 = new Product("Shoes", 150.0, Size.LARGE);

        //create an aray of produts to use with manager class

        Product[] products = {product1, product2, product3};
        Manager manager = new Manager("Bob", products, Size.LARGE);
        Student student = new Student("Sally", products, Size.SMALL);
        Business business = new Business("Main Street Newark Delaware", product1);

    }

}
