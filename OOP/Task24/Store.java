import java.util.Random;
public class Store {

    static Product[] products = new Product[20];

//    public void getplaceProduct(Product product){
//        Random rn = new Random();
//        int place = product.setInIcebox();
//        place = rn.nextInt(2)+1;
//        if (place == 1 ){
//            System.out.print("    IceBox|");
//        } else {
//            System.out.print("    Showcase|");
//        }
//    }

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
                    System.out.print(products[i].getName());
                    System.out.print("      |  " + products[i].getProducedDate());
                    System.out.print(" |  ");

                    System.out.print(" |  " + products[i].isFresh());
                    System.out.println("");
                    break;
                case 2:
                    products[i] = new Corn();
                    System.out.print(products[i].getName());
                    System.out.print("      |  " + products[i].getProducedDate());
                    System.out.print(" |  " + products[i].isInIcebox());
                    System.out.print(" |  " + products[i].isInIcebox());
                    System.out.print(" |  " + products[i].isFresh());
                    System.out.println("");
                    break;
                case 3:
                    products[i] = new Salt();
                    System.out.print(products[i].getName());
                    System.out.print("      |  " + products[i].getProducedDate());
                    System.out.print(" |  " + products[i].isInIcebox());
                    System.out.print(" |  " + products[i].isInIcebox());
                    System.out.print(" |  " + products[i].isFresh());
                    System.out.println("");
                    break;
                case 4:
                    products[i] = new Stew();
                    System.out.print(products[i].getName());
                    System.out.print("      |  " + products[i].getProducedDate());
                    System.out.print(" |  " + products[i].isInIcebox());
                    System.out.print(" |  " + products[i].isInIcebox());
                    System.out.print(" |  " + products[i].isFresh());
                    System.out.println("");
                    break;
                default:
                    products[i] = new Fish();
                    System.out.print(products[i].getName());
                    System.out.print("      |  " + products[i].getProducedDate());
                    System.out.print(" |  " + products[i].isInIcebox());
                    System.out.print(" |  " + products[i].isInIcebox());
                    System.out.print(" |  " + products[i].isFresh());
                    System.out.println("");
                    break;
            }
        }
    }
}


