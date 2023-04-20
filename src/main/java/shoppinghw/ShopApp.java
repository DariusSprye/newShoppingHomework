package shoppinghw;

public class ShopApp {

    public static void printPersonName(Person person){

    }

    public static double calculateTotal(Product[] products){
        return 0.0;
    }

    public static boolean isAFit(Customer customer, Product product){

        return false;
    }

    public static void printEveryDiscountAvailableForAProduct(Discountable[] discountables, Product product){
            //for every item in the array that is discountable
        for(Discountable disc : discountables ){

            System.out.println(Math.round(disc.calculateDiscount(product)));
            // calculate the discount for each product's price
        }


    }


}