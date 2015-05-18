/**
 * Write a description of class FoodItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FoodItem
{
    private String name;
    private String properties;
    private int calories;
    /**
     * Constructor for objects of class FoodItem
     */
    public FoodItem(String inputName,  String inputProperties, int inputCalories)
    {
        name = inputName;
        properties = inputProperties;
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
     * Returns properties of FoodItem
     */
    public String getProperties()
    {
        return properties;
    }

    /**
     * Returns name of FoodItem
     */
    public int getCalories()
    {
        return calories;
    }
}