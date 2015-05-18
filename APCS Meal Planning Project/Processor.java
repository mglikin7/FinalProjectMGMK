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
    /**
     * Constructor for objects of class Processor
     */
    public void main()
    {
        
    }
    public double calorieCalculator(double weight, double height, String gender, int age)

    {
        double totalCalories = 0;
        if(gender.equals("male")) totalCalories = 66.47 + (13.75 * weight) + (5.0 * height) - (6.75 * age);
        else if(gender.equals("female")) totalCalories = 665.09 + (9.56 * weight) + (1.84 * height) - (4.67 * age);
        return totalCalories;
    }
    }



