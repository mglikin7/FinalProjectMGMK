/**
 * Write a description of class FoodItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FoodItem
{
    private String name;

    private int calories;
    /**
     * Constructor for objects of class FoodItem
     */
    public FoodItem(String inputName,  int inputCalories)
    {
        name = inputName;

        calories = inputCalories;
    }

    /**
     * Returns name of FoodItem
     */
    public String getName()
    {
        return name;
    }

    

    /**
     * Returns name of FoodItem
     */
    public int getCalories()
    {
        return calories;
    }
}