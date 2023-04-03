import java.util.Scanner;

public class PurchaseProductSteps extends PurchaseProcessTemplate{
    Scanner scanner = new Scanner(System.in);
    PurchaseProductSteps(Mediator mediator) {
        super(mediator);
    }

    @Override
    public Payment doPayment() {
        Payment retPayment = null;
        System.out.println("How you wanna payment?\n1.Bkash\n2.CreditCard\n3.Bkash");
        int paymentChoice = scanner.nextInt();

        if(paymentChoice==1)
            retPayment =new Payment(new Bkash());
        else if(paymentChoice==2)
            retPayment = new Payment(new CreditCard());
        else retPayment = new Payment(new PayPal());

        return retPayment;
    }


}
