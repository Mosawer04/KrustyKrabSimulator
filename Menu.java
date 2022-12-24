import java.util.HashMap;
public class Menu{
    //Entrees
    public HashMap<String, Double> Entree(){
        HashMap<String, Double> Entrees = new HashMap<>();
        Entrees.put("Pipsqueak Patty",1.00);
        Entrees.put("Mini Krabby Patty",1.25);
        Entrees.put("Krabby Nuggets (6pc)",1.25);
        Entrees.put("Krabby Spaghetti",2.25);
        Entrees.put("Krabby Wings (6pc)",3.25);
        Entrees.put("Krabby Sticks",2.25);
        Entrees.put("Krabby Patty", 1.25);
        Entrees.put("Krabby Patty W/ Sea Cheese", 1.50);
        Entrees.put("Double Krabby Patty", 2.00);
        Entrees.put("Double Krabby Patty W/ Sea Cheese", 2.25);
        Entrees.put("Triple Krabby Patty", 3.00);
        Entrees.put("Triple Krabby Patty W/ Sea Cheese", 3.25);
        Entrees.put("King-size Ultra Patty Supreme", 5.00);
        Entrees.put("Monster Patty", 6.00);
        Entrees.put("Small Krusty Krab Pizza - (12 inch)", 6.00);
        Entrees.put("Medium Krusty Krab Pizza - (16 inch)", 7.50);
        Entrees.put("Large Krusty Krab Pizza - (20 inch)", 9.00);
        Entrees.put("Jumbo Krusty Krab Pizza - (24 inch)", 11.50);
        Entrees.put("Krusty Dog", 2.00);
        Entrees.put("Jelly Patty", 2.50);
        Entrees.put("Krabby Meal", 3.50);
        Entrees.put("Double Krabby Meal", 3.75);
        Entrees.put("Triple Krabby Meal", 4.00);
        Entrees.put("Salty Sea Dog", 1.25);
        Entrees.put("FootLong", 2.00);
        Entrees.put("Sailors Surprise", 3.00);
        Entrees.put("Golden Loaf", 2.00);
        Entrees.put("Golden Loaf W/ Sauce", 2.50);
        return Entrees;
    }
    public void Entree_Menu() {
        System.out.println(
                " ---Kids-Menu---\n"+
                "(1) Pipsqueak Patty - 1.00\n"+
                "(2) Mini Krabby Patty - 1.25\n"+
                "(3) Krabby Nuggets (6pc) - 1.25\n"+
                "(4) Krabby Spaghetti  - 2.25\n"+
                "(5) Krabby Wings (6pc) - 3.25\n"+
                "(6) Krabby Sticks - 2.25\n"+
                " ---Main-Menu---\n"+
                "(7) Krabby Patty - 2.00\n"+
                "(8) Krabby Patty W/ Sea Cheese - 2.25\n"+
                "(9) Double Krabby Patty - 2.75\n"+
                "(10) Double Krabby Patty W/ Sea Cheese - 3.25\n"+
                "(11) Triple Krabby Patty - 3.75\n"+
                "(12) Triple Krabby Patty W/ Sea Cheese - 4.25\n"+
                " ---Special-Menu---\n"+
                "(13) King-size Ultra Patty Supreme  - 5.00\n"+
                "(14) Monster Patty - 6.00\n"+
                "(15) Small Krusty Krab Pizza - (12 inch) 6.00\n"+
                "(16) Medium Krusty Krab Pizza - (16 inch) 7.50\n"+
                "(17) Large Krusty Krab Pizza - (20 inch) 9.00\n"+
                "(18) Jumbo Krusty Krab Pizza - (24 inch) 11.50\n"+
                "(19) Krusty Dog - 2.00\n"+
                "(20) Jelly Patty - 2.50\n"+
                "(21) Krabby Meal - 3.50\n"+
                "(22) Double Krabby Meal - 3.75\n"+
                "(23) Triple Krabby Meal - 4.00\n"+
                "(24) Salty Sea Dog - 1.25\n"+
                "(25) FootLong - 2.00\n"+
                "(26) Sailors Surprise - 3.00\n"+
                "(27) Golden Loaf - 2.00\n"+
                "(28) Golden Loaf W/ sauce - 2.50\n"
        );
    }
    //Sides
    public void Sides_Menu() {
        System.out.println("" +
                "(1) Small Krusty Fries - 2.00\n"+
                "(2) Medium Krusty Fries- 3.25\n"+
                "(3) Large Krusty Fries - 4.50\n"+
                "(4) Kelp Rings - 1.50\n"+
                "(5) Salty Sauce - 0.50\n"
        );
    }
    public HashMap<String, Double> Sides() {
        HashMap<String, Double> Sides = new HashMap<>();
        Sides.put("Small Krusty Fries", 2.00);
        Sides.put("Medium Krusty Fries", 3.25);
        Sides.put("Large Krusty Fries", 4.50);
        Sides.put("Kelp Rings", 1.50);
        Sides.put("Salty Sauce", 0.50);
        return Sides;
    }
    //Drinks
    public void Drinks_Menu()
    {
        System.out.println(
                "(1) Kelp Shake - 2.00\n"+
                "(2) Small Sea Foam Soda - 1.00\n"+
                "(3) Medium Sea Foam Soda - 1.25\n"+
                "(4) Large Sea Foam Soda - 1.50\n"
        );
    }
    public HashMap<String, Double> Drinks()
    {

        HashMap<String, Double> Drinks = new HashMap<>();
        Drinks.put("Kelp Shake", 2.00);
        Drinks.put("Small Sea Foam Soda", 1.00);
        Drinks.put("Medium Sea Foam Soda", 1.25);
        Drinks.put("Large Sea Foam Soda", 1.50);
        return Drinks;
    }
    public void Condiments_and_Spices_Menu()
    {
        System.out.println(
                "---Condiments---\n"+
                "(1) Ketchup - .25\n"+
                "(2) Mustard - .25\n"+
                "(3) Mayo - .25\n"+
                "(4) Relish - .25\n"+
                "(5) Hot sauce - .25\n"+
                "(6) BBQ sauce - .25\n"+
                "(7) Ranch - .25\n"+
                "---Spices---\n"+
                "(8) Salt - .25\n"+
                "(9) Pepper - .25\n"+
                "(10) Cajun - .25\n"
        );
    }
    public HashMap<String, Double> Condiments_and_Spices()
    {
        HashMap<String, Double> Condiments_and_Spices = new HashMap<>();
        Condiments_and_Spices.put("Ketchup", .25);
        Condiments_and_Spices.put("Mustard", .25);
        Condiments_and_Spices.put("Mayo", .25);
        Condiments_and_Spices.put("Relish", .25);
        Condiments_and_Spices.put("Hot sauce", .25);
        Condiments_and_Spices.put("BBQ sauce", .25);
        Condiments_and_Spices.put("Ranch", .25);
        Condiments_and_Spices.put("Salt", .25);
        Condiments_and_Spices.put("Pepper", .25);
        Condiments_and_Spices.put("Cajun", .25);
        return Condiments_and_Spices;
    }
}