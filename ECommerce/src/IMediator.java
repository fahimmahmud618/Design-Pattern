public interface IMediator {
    public void addProduct(Product product);
    public void addCustomer(Customer customer);
    public boolean checkCustomerIsValid(String name, String password);
    public void purchaseProduct(Product product, Customer customer, Payment payment);
}
