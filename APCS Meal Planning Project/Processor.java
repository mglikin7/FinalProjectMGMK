import java.util.*;
/**
 * Write a description of class Processor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Processor
{
    ArrayList<DrinkItem> drink = new ArrayList<DrinkItem>();
    ArrayList<MainItem> main = new ArrayList<MainItem>();
    ArrayList<SideItem> side = new ArrayList<SideItem>();
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
        
        FoodItem pancake = new MainItem("Pancakes(x4)","breakfast",344,2);
        FoodItem cerial = new MainItem("cerial","breakfast",606,3);
        FoodItem bagel = new MainItem("bagel with cream chease","breakfast",450,3);
        FoodItem oatmeal = new MainItem("oatmeal","any",339,2);
        FoodItem eggs = new MainItem("eggs","breakfast",234,1);
        FoodItem sausagePatties = new MainItem("saussage patties","breakfast",229,1);
        
        FoodItem pbj = new MainItem("Peanut butter and jelly andwich","lunch",376,2);
        FoodItem gchease = new MainItem("Grilled Chease Sandwich","lunch",291,1);
        FoodItem delisandwich = new MainItem("Deli sandwich","lunch",350,2);
        FoodItem Pizza = new MainItem("pizza","lunch",285,1);
        FoodItem hamburger = new MainItem("hamburger","lunch",354,2);
        FoodItem hotdog = new MainItem("hotDog","lunch",151,1);
        
        FoodItem spaghetti = new MainItem("spaghetti","dinner",221,1);
        FoodItem meatandpotatoes = new MainItem("beef and potatoes","dinner",376,2);
        FoodItem steak = new MainItem("porterhouse steak","dinner",282,1);
        FoodItem chicken = new MainItem("chicken","dinner",306,2);
        FoodItem expensive = new MainItem("Strawberies Arnaud","dinner",300,2);
        FoodItem fish = new MainItem("cooked atlantic salmonm","dinner",366,2);
        
        
        
        FoodItem rice = new SideItem("rice","dinner",111,"none");
        FoodItem gbeans = new SideItem("grean beans","dinner",44,"none");
        FoodItem mpotates = new SideItem("mashed potatoes","dinner",214, "gravy");
        
        FoodItem appleslices = new SideItem("Apple slices ","snack",95+188,"peanut butter");
        FoodItem gbar = new SideItem("Granola Bar","snack",132,"none");
        FoodItem chips = new SideItem("generic chips","snacks",152,"none");
        
        
        FoodItem fries = new SideItem("small french fries","lunch",222,"ketchup");
        FoodItem ttchips = new SideItem("trtilla chips(10chips)","lunch",100,"salsa");
        FoodItem fcup = new SideItem("fruit cup","lunch",64,"none");
        
        FoodItem nuts = new SideItem("nut mix","breakfast",172,"none");
        FoodItem yogurt = new SideItem("Yogurt","breakfast",100,"none");
        FoodItem hashbrown = new SideItem("hashbrown","breakfast",235,"none");
        
        FoodItem salad = new SideItem("salad","any",137,"ranch dressing");
        FoodItem apple = new SideItem("Apple","any",95,"none");
        FoodItem grapes = new SideItem("grapes","any", 62,"none");
        
        
        
        


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

    public ArrayList<Meal> createBreakfasts(int breakfastCalories)
    {

        ArrayList<Meal> BreakfastMeals = new ArrayList<Meal>();
        int ctr4 = 1;
        for(int ctr1 = 0; ctr1 <= main.size(); ctr1++)
        {
            for(int ctr2 = 0; ctr2 <= side.size(); ctr2++)
            {
                for(int ctr3 = 0; ctr3 <= drink.size(); ctr3++)
                {
                    if(main.get(ctr1).getCalories() + side.get(ctr2).getCalories() + drink.get(ctr3).getCalories() == breakfastCalories)
                    {
                        Meal current = new Meal(main.get(ctr1), side.get(ctr2), drink.get(ctr3), "breakfast" , "b");
                        BreakfastMeals.add(current);
                        ctr4++;
                    }
                }
            }
        }
        return BreakfastMeals;

    }

    public ArrayList<Meal> createLunches(int lunchCalories)
    {
        ArrayList<Meal> LunchMeals = new ArrayList<Meal>();
        int ctr4 = 1;
        for(int ctr1 = 0; ctr1 <= main.size(); ctr1++)
        {
            for(int ctr2 = 0; ctr2 <= side.size(); ctr2++)
            {
                for(int ctr3 = 0; ctr3 <= drink.size(); ctr3++)
                {
                    if(main.get(ctr1).getCalories() + side.get(ctr2).getCalories() + drink.get(ctr3).getCalories() == lunchCalories)
                    {
                        Meal current = new Meal(main.get(ctr1), side.get(ctr2), drink.get(ctr3), "lunch" , "l");
                        LunchMeals.add(current);
                        ctr4++;
                    }
                }
            }
        }
        return LunchMeals;
    }

    public ArrayList<Meal> createDinners(int dinnerCalories)
    {
        ArrayList<Meal> DinnerMeals = new ArrayList<Meal>();
        int ctr4 = 1;
        for(int ctr1 = 0; ctr1 <= main.size(); ctr1++)
        {
            for(int ctr2 = 0; ctr2 <= side.size(); ctr2++)
            {
                for(int ctr3 = 0; ctr3 <= drink.size(); ctr3++)
                {
                    if(main.get(ctr1).getCalories() + side.get(ctr2).getCalories() + drink.get(ctr3).getCalories() == dinnerCalories)
                    {
                        Meal current = new Meal(main.get(ctr1), side.get(ctr2), drink.get(ctr3), "dinner" , "d");
                        DinnerMeals.add(current);
                        ctr4++;
                    }
                }
            }
        }
        return DinnerMeals;
    }

    public ArrayList<Meal> createSnacks(int snackCalories)
    {
        ArrayList<Meal> SnackMeals = new ArrayList<Meal>();
        int ctr4 = 1;
        for(int ctr1 = 0; ctr1 <= main.size(); ctr1++)
        {
            for(int ctr2 = 0; ctr2 <= side.size(); ctr2++)
            {
                for(int ctr3 = 0; ctr3 <= drink.size(); ctr3++)
                {
                    if(main.get(ctr1).getCalories() + side.get(ctr2).getCalories() + drink.get(ctr3).getCalories() >= snackCalories)
                    {
                        Meal current = new Meal(main.get(ctr1), side.get(ctr2), drink.get(ctr3), "lunch" , "s");
                        SnackMeals.add(current);
                        ctr4++;
                    }
                }
            }
        }
        return SnackMeals;
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
