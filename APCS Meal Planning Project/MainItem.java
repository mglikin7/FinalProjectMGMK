/**
 * Write a description of class MainItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainItem extends FoodItem
{
    private String type;
    private String name;
    private String properties;
    private int calories;
    private int size; 
    /**
     * Constructor for objects of class FoodItem
     */
    public MainItem(String inputName,  String inputProperties, String t, int inputCalories, int s)
    {
        super(inputName, inputProperties, inputCalories);
        type =t;
        size=s; 
    }
    public String getType()
    {
        return type; 
    }
    public String getSize(){
        String siZe=" "; 
        if(size==1){
            siZe="small";
        }
        else if(size==2){
            siZe="medium";
        }
        else{
            siZe="large";
        }
        return siZe; 
    }
}
