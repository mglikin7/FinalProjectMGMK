
/**
 * Write a description of class DrinkItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrinkItem extends  FoodItem
{
    private String type;
    private String name;
    private String properties;
    private int calories;
    /**
     * Constructor for objects of class FoodItem
     */
    public DrinkItem(String inputName,  String inputProperties, String t, int inputCalories)
    {
        super(inputName, inputProperties, inputCalories);
        type =t;
    }
    public String getType()
    {
        return type; 
    }
    public void refill(){ 
        calories*=2; 
    }
}
