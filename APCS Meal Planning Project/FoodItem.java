/**
 * The FoodItem class creates food objects that meal objects are created from.
 * The MainItem, SideItem, and DrinkItem classes all extend FoodItem.
 * 
 * @author (MGMK)
 * @version (5/29/15)
 */
public class FoodItem
{
    private String name;
    private int calories;
   
    public FoodItem(String inputName,  int inputCalories)
    {
        name = inputName;

        calories = inputCalories;
    }

    public String getName()
    {
        return name;
    }
    
    public int getCalories()
    {
        return calories;
    }
}