/**
 * Write a description of class Meal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meal
{
    FoodItem main;
    FoodItem side;
    FoodItem drink;
    int tc;
    String whatMeal; 
    public Meal(MainItem m, SideItem s, DrinkItem d, String blds){
        main = m;
        side = s;
        drink = d;
        tc=(m.getCalories()+s.getCalories()+d.getCalories());
        whatMeal= blds; 
    }

    public FoodItem getMain()
    {
        return main;   
    }

    public FoodItem getSide()
    {
        return side;   
    }

    public FoodItem getDrink()
    {
        return drink;   
    }

    public void printMeal()
    {
        System.out.println("Your meal has a main dish of " + main.getName() +
            ", a side of " + side.getName() +
            ", and a beverage of " + drink.getName() + ".");
        System.out.println("Your meal contains " + tc + " calories.");
    }

    public String getMealType(){
        String mt = ""; 
        if(whatMeal .equals("b")){
            mt= "Breakfast";
        }
        else if(whatMeal .equals("l")){
            mt= "Lunch";
        }
        else if(whatMeal .equals("d")){
            mt= "Dinner";
        }
        else{
            mt= "Snack";
        }
        return mt; 
    }
}