public class Coffee_cream extends Coffee{

    boolean is_Cream_coffee_available()
    {
        if(super.cream_powder>=10)
            return true;
        else
            return  false;
    }
    @Override
    public void purchase_coffee() {
        super.purchase_coffee();
        super.cream_powder -= 10;
        System.out.println("........Cream Coffee Purchased.........");
    }
}
