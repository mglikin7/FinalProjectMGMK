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
    public Meal(MainItem m, SideItem s, DrinkItem d){
        main = m;
        side = s;
        drink = d;
        tc=(m.getCalories()+s.getCalories()+d.getCalories());
    }
    
    public FoodItem getMain(){
     return main;   
    }
    
    public FoodItem getSide(){
     return side;   
    }
    
    public FoodItem getDrink(){
     return drink;   
    }
    
    public void printMeal(){
        System.out.println("your drink is "+drink.getName()+".");
        System.out.println("your side is "+side.getName()+".");
        System.out.println("your main is "+main.getName()+".");
        System.out.println("toatal calories: "+ tc+".");
    }
   
}