
/**
 * Write a description of class FoodItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FoodItem
{
    // instance variables
    private String name;
    private String type;
    private String properties;
    private int calories;
    /**
     * Constructor for objects of class FoodItem
     */
    public FoodItem(String inputName, String inputType, String inputProperties, int inputCalories)
    {
        // initialise instance variables
        name = inputName;
        type = inputType;
        properties = inputProperties;
        calories = inputCalories;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getName(FoodItem food)
    {
        return name;
    }
}
