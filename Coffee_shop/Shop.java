import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Coffee_cream coffeeCream = new Coffee_cream();
        Coffee_suger coffeeSuger = new Coffee_suger();
        Coffee coffee = new Coffee();

        while (true)
        {
            System.out.println("What type of coffe do you want?");
            System.out.println("1. Cream Coffee");
            System.out.println("2. Suger Coffee");

            int choice = scan.nextInt();

            if(choice==1)
                if(coffeeCream.is_Cream_coffee_available())
                {
                    coffeeCream.purchase_coffee();
                    coffeeCream.display_materials();
                }
            else if(choice==2)
                if(coffeeSuger.is_suger_coffee_available())
                {
                    coffeeSuger.purchase_coffee();
                    coffeeSuger.display_materials();
                }
            else if(choice==-1)
                break;
            else if (choice==-2) {
                    coffee.refill();
                }
            else
                continue;

        }
    }
}
