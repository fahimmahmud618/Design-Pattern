public class Test {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Product product[] = new Product[5];
        product[0]=new Product("Book",100,5);
        product[1]=new Product("Pen",10,50);
        product[2]=new Product("Mobile",1000,10);
        product[3]=new Product("PC",10000,3);
        product[4]=new Product("Food",80,100);

        Customer customer[] = new Customer[2];
        customer[0]=new Customer("Fahim","123","Dhaka",2000);
        customer[1]=new Customer("Rahim","1234","Chuadanga",5000);

        for (int i = 0; i < 5; i++) {
            mediator.addProduct(product[i]);
        }
        for (int i = 0; i < 2; i++) {
            mediator.addCustomer(customer[i]);
        }

        PurchaseProductSteps purchaseProductSteps = new PurchaseProductSteps(mediator);
        Customer logincCustomer = purchaseProductSteps.login();
        while (true){
            purchaseProductSteps.displayProducts();
            Product selectedProduct = purchaseProductSteps.chooseProduct();
            Payment selectedPayment = purchaseProductSteps.doPayment();
            mediator.purchaseProduct(selectedProduct,logincCustomer,selectedPayment);
        }



    }
}
