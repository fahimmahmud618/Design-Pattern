public class Coffee_suger extends Coffee{
    boolean is_suger_coffee_available()
    {
        if(super.suger>=2)
            return true;
        else
            return  false;
    }
    @Override
    public void purchase_coffee() {
        super.purchase_coffee();
        super.suger -= 2;
        System.out.println("........Sugar Coffee Purchased.........");
    }
}
