import java.util.ArrayList;

public class Mediator implements IMediator{
    ArrayList<Product>ProductList;
    ArrayList<Customer>CustomerList;

    Mediator(){
        ProductList=new ArrayList<>();
        CustomerList=new ArrayList<>();
    }
    @Override
    public void addProduct(Product product) {
        ProductList.add(product);
    }

    @Override
    public void addCustomer(Customer customer) {
        CustomerList.add(customer);
    }

    @Override
    public boolean checkCustomerIsValid(String name, String password) {
        boolean found=false;
        for (Customer customer: CustomerList) {
            if(customer.name==name && customer.password==password){
                found = true;
            }
        }
        return found;
    }

    @Override
    public void purchaseProduct(Product product, Customer customer, Payment payment) {
        if(customer.walletAmount>=product.price){
            product.instock--;
            customer.walletAmount=customer.walletAmount-product.price;
            System.out.println("\n\n-----Payment Recipt-----\nThe product named "+product.name+" is purchased \n"+
            "Shipping Address: "+customer.address+
                    "\nPayment Method: "+payment.toString()+
                    "\nWallet Balance: "+customer.walletAmount);
        }
        else{
            System.out.println("Sorry, you don't have enough money in your wallet!");
        }

    }
}
