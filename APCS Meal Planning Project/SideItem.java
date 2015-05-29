/**
 * The SideItem class creates SideItem objects, one of the three objects a meal must contain.
 * The side dish in a meal.
 * 
 * @author (MGMK)
 * @version (5/29/15)
 */
public class SideItem extends FoodItem
{
    private String type;
    private String name;
    private int calories;
    private boolean doDip;
    private String dip; 
    /**
     * Constructor for objects of class FoodItem
     */
    public SideItem(String inputName,  String t, int inputCalories, String sauce)
    {
        super(inputName,  inputCalories);
        type = t;
        dip = "none";
        doDip = false; 
        if(sauce!="none"){
            dip(sauce);
        }
    }
    public String getType()
    {
        return type; 
    }
    
    public void dip(String sauce){
        dip = sauce;
        doDip = true; 
    }
    
    public String getDip(){
        return dip; 
    }
}