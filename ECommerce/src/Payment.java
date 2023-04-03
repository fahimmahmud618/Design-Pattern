public class Payment {
    private PaymentMethod paymentMethod;
    Payment(PaymentMethod paymentMethod){
        this.paymentMethod=paymentMethod;
    }

    @Override
    public String toString() {
        return paymentMethod.doPayment();
    }
}
