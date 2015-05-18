
import java.util.*;

/**
 * Write a description of class Processor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Processor
{

    // instance variables - replace the example below with your own

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

    /**
     *
     */
    public int calorieCalculator(double weight, double height, String gender, int age)
    {
        double BMI;
        int totalCalories = 0;
        BMI = (weight / Math.pow(height, 2) * 703);
        BMI =  (int) BMI;
        
    }
    
    

  
    }



