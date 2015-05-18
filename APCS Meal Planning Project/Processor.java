import java.lang.Math;
/**
 * Write a description of class Processor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Processor
{
    /**
     * Constructor for objects of class Processor
     */
    public Processor()
    {
        
    }

    /**
     *
     */
    public int calorieCalculator(double weight, double height)
    {
        double BMI;
        int totalCalories = 0;
        BMI = (weight / Math.pow(height, 2) * 703);
        BMI =  (int) BMI;
        
    }
}
