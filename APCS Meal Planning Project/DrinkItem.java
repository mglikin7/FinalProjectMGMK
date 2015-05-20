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
    private int w;
    /**
     * Constructor for objects of class FoodItem
     */
    public DrinkItem(String inputName, String t, int inputCalories)
    {
        super(inputName, inputCalories);
        type =t;
        w=0;
    }
    public String getType()
    {
        return type; 
    }
    public void refill(){ 
        calories+=calories-calories-(calories*w); 
        w+=1;
    }
}
