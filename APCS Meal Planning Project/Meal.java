
/**
 * Write a description of class meal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class meal
{
    // test
    FoodItem drink;
    FoodItem main;
    FoodItem side; 
    /**
     * Constructor for objects of class meal
     */
    public meal(FoodItem d, FoodItem m, FoodItem s)
    {
       drink = d;
       main = m;
       side = s;
    }
    
    public FoodItem getDrink(){
        return drink;
        
    }
    
    public FoodItem getMain(){
        return main;
        
    }
    
    public FoodItem geside(){
        return side;
        
    }
    
    public int getTC(){
        return (drink.getCalories()+main.getCalories()+side.getCalories());
    }
    
    public void printMeal(){
        system.out.printLn("your drink is "+ drink.getName()+".");
        system.out.printLn("your main is "+ main.getName()+".");
        system.out.printLn("your side is "+ side.getName()+".");
        system.out.printLn("toatal calories: "+ this.getTC()+".");
        
        
    }

    
}
