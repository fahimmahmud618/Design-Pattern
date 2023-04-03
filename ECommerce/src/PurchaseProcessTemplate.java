import java.util.Scanner;

public abstract class PurchaseProcessTemplate {

    Scanner scanner = new Scanner(System.in);
    private Mediator mediator;

    PurchaseProcessTemplate(Mediator mediator){
        this.mediator=mediator;
    }

    public Customer login(){
        Customer retCustomer=null;
        boolean loginSuccess=false;
        do{
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Enter password: ");
            String password = scanner.nextLine();


            for (Customer customer: mediator.CustomerList){

                if(customer.name.equals(name) && customer.password.equals(password)){
                    System.out.println("Matched!");
                    loginSuccess=true;
                    retCustomer=customer;
                }
            }
        }while (!loginSuccess);
        return retCustomer;
    }

    public void displayProducts(){
        for(Product product: mediator.ProductList){
            System.out.println("\n\nProduct name: "+product.name+
            "\nPrice: "+product.price+"\nIn stock: "+product.instock
            );
        }
    }

    public Product chooseProduct(){
        Product retproduct = null;
        boolean match = false;
        do{
            System.out.println("\n--------\n\nEnter Product name to purchase:");
            String productName = scanner.nextLine();

            for (Product product: mediator.ProductList){
                if(product.name.equals(productName)){
                    retproduct=product;
                    match = true;
                    break;
                }
            }
        }while (!match);

        return retproduct;
    }

    public abstract Payment doPayment();
}
