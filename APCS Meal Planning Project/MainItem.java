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
    public MainItem(String inputName,   String t, int inputCalories, int s)
    {
        super(inputName,  inputCalories);
        type = t;
        size = s; 
    }
    public String getType()
    {
        return type; 
    }
    public String getSize(){
        String wordSize = " "; 
        if(size == 1){
            wordSize = "small";
        }
        else if(size==2){
            wordSize = "medium";
        }
        else{
            wordSize = "large";
        }
        return wordSize; 
    }
}