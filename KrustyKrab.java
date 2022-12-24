import java.util.*;
import java.util.stream.*;

public class KrustyKrab {
    public static void main(String[]args)
    {
        //Menu Information taken from Menu class
        //each method is instantiated in the class for re-usage
        Menu items = new Menu();
        HashMap<String, Double> Menu = items.Entree();
        HashMap<String, Double> Menu2 = items.Sides();
        HashMap<String, Double> Menu3 = items.Drinks();
        HashMap<String, Double> Menu4 = items.Condiments_and_Spices();
        Scanner in = new Scanner(System.in);
        int num = 1;int num2 = 1;int num3 = 1;int num4 = 1;
        double sum = 0;

        //prompt
        System.out.println("Welcome to the Krusty Krab, May I take your oder?");

        //Entree menu given
        items.Entree_Menu();

        //User input required
        System.out.println("How many Entrees would you Like?");
        int amount = in.nextInt();

        //Entrees
        ArrayList<Double> price1 = new ArrayList<>();
        for(int i = 1; i <= amount; i++) {
            ArrayList<Double> Entree = getEntree(Menu, in, price1, num);
            num++;
        }

        //Sides
        items.Sides_Menu();
        System.out.println("How many Sides would you Like?");
        int amount2 = in.nextInt();
        ArrayList<Double> price2 = new ArrayList<>();
        for(int i = 1; i <= amount2; i++){
            ArrayList<Double> Sides = getSides(Menu2, in, price2, num2);
            num2++;
        }

        //Drinks
        items.Drinks_Menu();
        System.out.println("How many Drinks would you Like?");
        int amount3 = in.nextInt();
        ArrayList<Double> price3 = new ArrayList<>();
        for(int i = 1; i <= amount3; i++){
            ArrayList<Double> Drinks = getDrinks(Menu3, in, price3, num3);
            num3++;
        }
        //Condiments
        items.Condiments_and_Spices_Menu();
        System.out.println("How many Condiments and Spices would you like?");
        int amount4 = in.nextInt();
        ArrayList<Double> price4 = new ArrayList<>();
        for(int i = 1; i <= amount4; i++){
            ArrayList<Double> Condiments = getCondiments(Menu4, in, price4, num4);
            num4++;
        }

        //TotalBill
        calculateBill(price1, price2, price3,price4, sum);
    }
    public static ArrayList getEntree(HashMap<String, Double> Entree, Scanner in, ArrayList price1List, int num)
    {
        System.out.println("What is Entree #" + num);
        int entree = in.nextInt();
        double price1 = 0;
        if(entree < 0 || entree > 28){
            System.out.println("INVALID");
            System.exit(0);
        } else
            switch (entree) {
                case 1-> price1 = Entree.get("Pipsqueak Patty");
                case 2-> price1 = Entree.get("Mini Krabby Patty");
                case 3-> price1 = Entree.get("Krabby Nuggets (6pc)");
                case 4-> price1 = Entree.get("Krabby Spaghetti");
                case 5-> price1 = Entree.get("Krabby Wings (6pc)");
                case 6-> price1 = Entree.get("Krabby Sticks");
                case 7-> price1 = Entree.get("Krabby Patty");
                case 8-> price1 = Entree.get("Krabby Patty W/ Sea Cheese");
                case 9-> price1 = Entree.get("Double Krabby Patty");
                case 10-> price1 = Entree.get("Double Krabby Patty W/ Sea Cheese");
                case 11-> price1 = Entree.get("Triple Krabby Patty");
                case 12-> price1 = Entree.get("Triple Krabby Patty W/ Sea Cheese");
                case 13-> price1 = Entree.get("King-size Ultra Patty Supreme");
                case 14-> price1 = Entree.get("Monster Patty");
                case 15-> price1 = Entree.get("Small Krusty Krab Pizza - (12 inch)");
                case 16-> price1 = Entree.get("Medium Krusty Krab Pizza - (16 inch)");
                case 17-> price1 = Entree.get("Large Krusty Krab Pizza - (20 inch)");
                case 18-> price1 = Entree.get("Jumbo Krusty Krab Pizza - (24 inch)");
                case 19-> price1 = Entree.get("Krusty Dog");
                case 20-> price1 = Entree.get("Jelly Patty");
                case 21-> price1 = Entree.get("Krabby Meal");
                case 22-> price1 = Entree.get("Double Krabby Meal");
                case 23-> price1 = Entree.get("Triple Krabby Meal");
                case 24-> price1 = Entree.get("Salty Sea Dog");
                case 25-> price1 = Entree.get("FootLong");
                case 26-> price1 = Entree.get("Sailors Surprise");
                case 27-> price1 = Entree.get("Golden Loaf");
                case 28-> price1 = Entree.get("Golden Loaf W/ sauce");
                default-> throw new IllegalStateException("Invalid");
            }
        price1List.add(price1);
        return price1List;
    }
    public static ArrayList getSides(HashMap<String, Double> Sides, Scanner in, ArrayList price2List, int num2){
        System.out.println("What is Side #" + num2);
        int sides = in.nextInt();
        double price2 = 0;
        if(sides < 0 || sides > 6){
            System.out.println("INVALID");
            System.exit(0);
        } else
            switch (sides) {
                case 1-> price2 = Sides.get("Small Krusty Fries");
                case 2-> price2 = Sides.get("Medium Krusty Fries");
                case 3-> price2 = Sides.get("Large Krusty Fries");
                case 4-> price2 = Sides.get("Kelp Rings");
                case 5-> price2 = Sides.get("Salty Sauce");
                default-> throw new IllegalStateException("Invalid");
            }
        price2List.add(price2);
        return  price2List;
    }
    public static ArrayList getDrinks(HashMap<String, Double> Drinks, Scanner in, ArrayList price3List, int num3){
        System.out.println("What is Drink #" + num3);
        int drinks = in.nextInt();
        double price3 = 0;
        if(drinks < 0 || drinks > 5){
            System.out.println("INVALID");
            System.exit(0);
        } else
            switch (drinks) {
                case 1-> price3 = Drinks.get("Kelp Shake");
                case 2-> price3 = Drinks.get("Small Sea Foam Soda");
                case 3-> price3 = Drinks.get("Medium Sea Foam Soda");
                case 4-> price3 = Drinks.get("Large Sea Foam Soda");
                default -> throw new IllegalStateException("Invalid");
            }
        price3List.add(price3);
        return  price3List;
    }
    public static ArrayList<Double> getCondiments(HashMap<String, Double> Condiments, Scanner in, ArrayList<Double> price4List, int num4){
        System.out.println("what is Condiment/spice #" + num4);
        int Condiments_and_Spices = in.nextInt();
        double price4 = 0;
        if(Condiments_and_Spices < 0 || Condiments_and_Spices > 10){
            System.out.println("INVALID");
            System.exit(0);
        } else
            switch (Condiments_and_Spices) {
                case 1-> price4 = Condiments.get("Ketchup");
                case 2-> price4 = Condiments.get("Mustard");
                case 3-> price4 = Condiments.get("Mayo");
                case 4-> price4 = Condiments.get("Relish");
                case 5-> price4 = Condiments.get("Hot sauce");
                case 6-> price4 = Condiments.get("BBQ sauce");
                case 7-> price4 = Condiments.get("Ranch");
                case 8-> price4 = Condiments.get("Salt");
                case 9-> price4 = Condiments.get("Pepper");
                case 10-> price4 = Condiments.get("Cajun");
                default -> throw new IllegalStateException("Invalid");
            }
        price4List.add(price4);
        return  price4List;
    }
    public static void calculateBill(ArrayList<Double> price1, ArrayList<Double> price2, ArrayList<Double> price3,ArrayList<Double> price4, double sum){
        List<Double> combinedList = Stream.of(price1, price2, price3, price4)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        for(int i = 0; i < combinedList.size(); i++)
            sum += combinedList.get(i);
        System.out.println("Thank you for coming to the Krusty Krab, your total is: $" + sum );
    }
}