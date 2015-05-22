import java.util.*;
/**
 * Write a description of class Processor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Processor
{
    ArrayList<FoodItem> drink = new ArrayList<FoodItem>();
    ArrayList<FoodItem> main = new ArrayList<FoodItem>();
    ArrayList<FoodItem> side = new ArrayList<FoodItem>();
    ArrayList<Meal> blds = new ArrayList<Meal>();

    Scanner sc = new Scanner(System.in);
    
    

    /**
     * Constructor for objects of class Processor
     */
    public void main()
    {

        FoodItem water = new DrinkItem("water","any",0);
        FoodItem oj = new DrinkItem ("orange juice", "breakfast", 111);
        FoodItem milk = new DrinkItem("milk","breakfast", 103);
        FoodItem coffee = new DrinkItem("coffee","breakfast",1);
        FoodItem tea = new DrinkItem("tea","any",2);
        FoodItem soda = new DrinkItem("soda","lunch",182);
        FoodItem cmilk = new DrinkItem("chocolate milk","lunch",209);
        FoodItem aj = new DrinkItem("Apple juice", "lunch",113);
        FoodItem lemonade = new DrinkItem("lemonade","snack",99);
        FoodItem iceTea = new DrinkItem("ice tea", "dinner",2);
        FoodItem smoothie = new DrinkItem("smoothie", "snack", 400);
        FoodItem thebloodofyourenemies = new DrinkItem("The Blood of your Enemies","dinner", 124);
        
        FoodItem pancake = new MainItem("Pancakes(x4)","breakfast",344);
        FoodItem cerial = new MainItem("cerial","breakfast",606);
        FoodItem bagel = new MainItem("bagel with cream chease","breakfast",450);
        FoodItem oatmeal = new MainItem("oatmeal","any",339);
        FoodItem eggs = new MainItem("eggs","breakfast",234);
        FoodItem sausagePatties = new MainItem("saussage patties","breakfast",229);
        FoodItem pbj = new MainItem("Peanut butter and jelly andwich","lunch",376);
        FoodItem gchease = new MainItem("Grilled Chease Sandwich","lunch",291);
        FoodItem delisandwich = new MainItem("Deli sandwich","lunch",350);
        FoodItem Pizza = new MainItem("pizza","lunch",285);
        FoodItem hamburger = new MainItem("hamburger","lunch",354);
        FoodItem hotdog = new MainItem("hotDog","lunch",151);
        FoodItem spaghetti = new MainItem("spaghetti","dinner",221);
        FoodItem meatandpotatoes = new MainItem("beef and potatoes","dinner",376);
        FoodItem steak = new MainItem("porterhouse steak","dinner",282);
        FoodItem chicken = new MainItem("chicken","dinner",306);
        FoodItem expensice = new MainItem("Strawberies Arnaud","dinner",300);
        
        int w,h,a;
        String g;
        System.out.println("please enter in your wieght in pounds:");
        w=sc.nextInt();
        System.out.println("please enter in your height in inches: ");
        h=sc.nextInt();
        System.out.println("please enter in your age in years: ");
        a=sc.nextInt();
        System.out.println("enter in your gender(male or female): ");
        g = sc.nextLine();
        System.out.println("do you want to gain or lose weight: ");
        String go=sc.nextLine();
        int tc = calorieCalculator(w,h,a,g,go);
        
        

    }
    

   
    public int calorieCalculator(int weightInPounds, int heightInInches, int age, String gender, String goal)


    {
        double totalCalories = 0;
        weightInPounds /= 2.2;
        heightInInches *= 2.54;
        if(gender.equals("male")) totalCalories = 66.47 + (13.75 * weightInPounds) + (5.0 * heightInInches) - (6.75 * age);
        else if(gender.equals("female")) totalCalories = 665.09 + (9.56 * weightInPounds) + (1.84 * heightInInches) - (4.67 * age);
        if(goal.equals("gain")) totalCalories += 500;
        else if(goal.equals("lose")) totalCalories -= 500;
        return (int) totalCalories;
    }

    public void createBreakfasts(int breakfastCalories)
    {
 
    }

    public void creatLunches(int lunchCalories)
    {

    }

    public void creatDinners(int dinnerCalories)
    {

    }

    public void createSnacks(int snackChoice)
    {

    }

    public ArrayList<Meal> choice(int bChoice, int lChoice, int dChoice, int sChoice)
    {
        ArrayList<Meal> chosen = new ArrayList<Meal>();
        chosen.add(blds.get(bChoice));
        chosen.add(blds.get(lChoice));
        chosen.add(blds.get(dChoice));
        chosen.add(blds.get(sChoice));
        return chosen;
    }
}
