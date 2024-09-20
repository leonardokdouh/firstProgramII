import model.*;
import service.ProductsService;

public class Main {
    public static void main(String[] args) {


        Chair firstChair = new Chair(1, 100, "Tulip", 25.5f, true);
        Desk firstDesk = new Desk(2, 20, "The Desk", 55.5f, 33f, 100f);
        Printer firstPrinter = new Printer(3, 10, "ModelCero", 100f, "Brothers", 15);
        Notebook firstNote = new Notebook(4, 5, "Gaming", 150f, "Legion", 8);

        ProductsService service = new ProductsService();
        service.addProduct(firstChair);
        service.addProduct(firstDesk);
        service.addProduct(firstPrinter);
        service.addProduct(firstNote);
        //Showing the instances of every 4 objets
        service.showInstance();

        //Prints the uses of the IDiscount method
        System.out.println("The new price is = " + firstPrinter.applyDiscount(5));
        System.out.println("The new price is = " + firstChair.applyDiscount(15));


        //Showing the list of the objets before the update
        System.out.println("Original list");
        service.showList();

        //Showing the list of the objets after the update

        System.out.println("The updated list");
        service.printUpdatedProducts();



    }


}