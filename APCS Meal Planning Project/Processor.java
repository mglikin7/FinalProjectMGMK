import java.util.*;
/**
 * Write a description of class Processor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Processor
{
    ArrayList<Meal> breakfast = new ArrayList<Meal>();
    ArrayList<Meal> lunch = new ArrayList<Meal>();
    ArrayList<Meal> dinner = new ArrayList<Meal>();
    /**
     * Constructor for objects of class Processor
     */
    public void main()
    {
        
    }

    /**
     *
     */
    public double calorieCalculator(double weight, double height, int age, String gender)
    {
        double totalCalories = 0;
        if(gender.equals("male")) totalCalories = 66.47 + (13.75 * weight) + (5.0 * height) - (6.75 * age);
        else if(gender.equals("female")) totalCalories = 665.09 + (9.56 * weight) + (1.84 * height) - (4.67 * age);
        return totalCalories;
    }
    }



