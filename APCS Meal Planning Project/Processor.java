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
    Scanner sc = new Scanner(System.in);
    
    
    /**
     * Constructor for objects of class Processor
     */
    public void main()
    {
        double w,h,a;
        String g;
        System.out.println("please enter in your wieght in pounds:");
        w=sc.nextInt();
        System.out.println("please enter in your height in inches: ");
        h=sc.nextInt();
        System.out.println("please enter in your age in years: ");
        a=sc.nextInt();
        System.out.println("enter in your gender(male or female): ");
        g = sc.nextLine();
        int tc = (int)(calorieCalculator(w,h,g,a));
        
        
    }
    public double calorieCalculator(double weight, double height, String gender, double age)

    {
        double totalCalories = 0;
        if(gender.equals("male")) totalCalories = 66.47 + (13.75 * weight) + (5.0 * height) - (6.75 * age);
        else if(gender.equals("female")) totalCalories = 665.09 + (9.56 * weight) + (1.84 * height) - (4.67 * age);
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



