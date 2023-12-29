import java.util.Random;
public class Store {

    static Product[] products = new Product[20];

    public void getPlaceProduct(Product product){
        Random rn = new Random();
        int place = rn.nextInt(2)+1;
        if (place == 1 ){
            product.setInIcebox(true);
        } else {
            product.setInIcebox(false);
        }
    }

    public static void doInspection() {
        System.out.println("\n         Inspection result");
        System.out.println("  Product |" + "  Produce on |" + "  Storage place |" + "  S. life days | Fresh");
        System.out.println("----------+-------------+----------------+---------------+-------");

        for (int i = 0; i < products.length; i++) {
            Random rnd = new Random();
            int product = rnd.nextInt(5) + 1;
            switch (product) {
                case 1:
                    products[i] = new Milk();
                    break;
                case 2:
                    products[i] = new Corn();
                    break;
                case 3:
                    products[i] = new Salt();
                    break;
                case 4:
                    products[i] = new Stew();
                    break;
                default:
                    products[i] = new Fish();
                    break;
            }
            System.out.printf("%-10s|  %-12s|  %-14s|  %-13s|  %s\n",
                    products[i].getName(),
                    products[i].getProducedDate(),
                    products[i].isInIcebox() ? "Icebox" : "Showcase",
                    products[i].getExpirationDate(),
                    products[i].isFresh());
        }
    }
}


