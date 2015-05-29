/**
 * The DrinkItem class creates DrinkItem objects, one of the three objects a meal must contain.
 * The drink in a meal.
 * 
 * @author (MGMK)
 * @version (5/29/15)
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
        type = t;
        w = 0;
    }
    public String getType()
    {
        return type; 
    }
    public void refill(){ 
        calories += (calories * w); 
        w += 1;
    }
}
