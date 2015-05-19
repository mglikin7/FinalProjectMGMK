import java.util.*;
/**
 * Write a description of class Processor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Processor
{
    ArrayList<FoodItem> breakfast = new ArrayList<FoodItem>();
    ArrayList<FoodItem> lunch = new ArrayList<FoodItem>();
    ArrayList<FoodItem> dinner = new ArrayList<FoodItem>();
    ArrayList<FoodItem> snacks = new ArrayList<FoodItem>();
    ArrayList<Meal> blds = new ArrayList<Meal>();
    
    /**
     * Constructor for objects of class Processor
     */
    public void main()
    {
        
    }
    
    /**
     * http://www.bodybuilding.com/fun/calorie-know-how-get-equation-right-to-get-results.htm
     */
    public double calorieCalculator(double weightInPounds, double heightInInches, int age, String gender, String goal)

    {
        double totalCalories = 0;
        weightInPounds /= 2.2;
        heightInInches *= 2.54;
        if(gender.equals("male")) totalCalories = 66.47 + (13.75 * weightInPounds) + (5.0 * heightInInches) - (6.75 * age);
        else if(gender.equals("female")) totalCalories = 665.09 + (9.56 * weightInPounds) + (1.84 * heightInInches) - (4.67 * age);
        if(goal.equals("gain")) totalCalories += 500;
        else if(goal.equals("lose")) totalCalories -= 500;
        return totalCalories;
    }

    public void createBreakfasts(int breakfastCalories)
    {
        
    }
    
    public void creatLunches(int lunchCalories)
    {
        
    }
    
    public void creatDinners(int dinnerCalories)
    {
        
    }

    
    public void createSnacks(int snackChoice){
        
    }
    
    public void choice(int bChoice, int lChoice, int dChoice, int sChoice){
        
    }
    }