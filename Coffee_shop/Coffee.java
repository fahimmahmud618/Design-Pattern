public class Coffee {

    Coffee Coffee_type;

    int cup_price, number_of_cup=20, hot_water=200, coffee_powder=20;
    int suger=20, cream_powder=20;
    boolean cup_sufficient, hot_water_sufficient, coffee_powder_sufficient;

    public void purchase_coffee()
    {
        number_of_cup--;
        hot_water -= 10;
        coffee_powder -= 5;
    }
    boolean is_coffee_avalable()
    {
        if(cup_sufficient&&hot_water_sufficient&&coffee_powder_sufficient)
            return true;
        else
            return false;
    }

    public void display_materials()
    {
        System.out.println("Available Cup: "+number_of_cup);
        System.out.println("Available Hot Water: "+hot_water+ " L");
        System.out.println("Available Coffee Powder: "+coffee_powder);
        System.out.println("Available Suger: "+suger);
        System.out.println("Available Cream: "+cream_powder);
    }

    public  void refill()
    {
        number_of_cup +=100;
        hot_water +=10;
        coffee_powder +=100;
        suger += 20;
        cream_powder +=50;

        System.out.println("Materials Updated");
        display_materials();

    }
}
