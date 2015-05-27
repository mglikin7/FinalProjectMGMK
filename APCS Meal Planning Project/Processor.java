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
        DrinkItem water = new DrinkItem("water","any",0);
        DrinkItem oj = new DrinkItem ("orange juice", "breakfast", 111);
        DrinkItem milk = new DrinkItem("milk","breakfast", 103);
        DrinkItem coffee = new DrinkItem("coffee","breakfast",1);
        DrinkItem tea = new DrinkItem("tea","any",2);
        DrinkItem soda = new DrinkItem("soda","lunch",182);
        DrinkItem cmilk = new DrinkItem("chocolate milk","lunch",209);
        DrinkItem aj = new DrinkItem("Apple juice", "lunch",113);
        DrinkItem lemonade = new DrinkItem("lemonade","any",99);
        DrinkItem iceTea = new DrinkItem("ice tea", "dinner",2);
        DrinkItem smoothie = new DrinkItem("smoothie", "any", 400);
        DrinkItem thebloodofyourenemies = new DrinkItem("The Blood of your Enemies","dinner", 124);
        DrinkItem sd1 = new DrinkItem("none","snack",0);
        DrinkItem sd2 = new DrinkItem("none","snack",0);
        DrinkItem sd3 = new DrinkItem("none","snack",0);
        
        
        drink.add(water);
        drink.add(oj);
        drink.add(milk);
        drink.add(coffee);
        drink.add(tea);
        drink.add(soda);
        drink.add(cmilk);
        drink.add(aj);
        drink.add(lemonade);
        drink.add(iceTea);
        drink.add(smoothie);
        drink.add(thebloodofyourenemies);
        drink.add(sd1);
        drink.add(sd2);
        drink.add(sd3);
        

        MainItem pancake = new MainItem("Pancakes(x4)","breakfast",344,2);
        MainItem cerial = new MainItem("cerial","breakfast",606,3);
        MainItem bagel = new MainItem("bagel with cream chease","breakfast",450,3);
        MainItem oatmeal = new MainItem("oatmeal","any",339,2);
        MainItem eggs = new MainItem("eggs","breakfast",234,1);
        MainItem sausagePatties = new MainItem("saussage patties","breakfast",229,1);
        MainItem pbj = new MainItem("Peanut butter and jelly andwich","lunch",376,2);
        MainItem gchease = new MainItem("Grilled Chease Sandwich","lunch",291,1);
        MainItem delisandwich = new MainItem("Deli sandwich","lunch",350,2);
        MainItem Pizza = new MainItem("pizza","lunch",285,1);
        MainItem hamburger = new MainItem("hamburger","lunch",354,2);
        MainItem hotdog = new MainItem("hotDog","lunch",151,1);
        MainItem spaghetti = new MainItem("spaghetti","dinner",221,1);
        MainItem meatandpotatoes = new MainItem("beef and potatoes","dinner",376,2);
        MainItem steak = new MainItem("porterhouse steak","dinner",282,1);
        MainItem chicken = new MainItem("chicken","dinner",306,2);
        MainItem expensive = new MainItem("Strawberies Arnaud","dinner",300,2);
        MainItem fish = new MainItem("cooked atlantic salmonm","dinner",366,2);
        MainItem sm1 = new MainItem("none","snack",0,0);
        MainItem sm2 = new MainItem("none","snack",0,0);
        MainItem sm3 = new MainItem("none","snack",0,0);
        
        main.add(pancake);
        main.add(cerial);
        main.add(bagel);
        main.add(oatmeal);
        main.add(eggs);
        main.add(sausagePatties);
        main.add(pbj);
        main.add(gchease);
        main.add(delisandwich);
        main.add(Pizza);
        main.add(hamburger);
        main.add(hotdog);
        main.add(spaghetti);
        main.add(meatandpotatoes);
        main.add(steak);
        main.add(chicken);
        main.add(expensive);
        main.add(fish);
        main.add(sm1);
        main.add(sm2);
        main.add(sm3);
        

        
        SideItem rice = new SideItem("rice","dinner",111,"none");
        SideItem gbeans = new SideItem("grean beans","dinner",44,"none");
        SideItem mpotates = new SideItem("mashed potatoes","dinner",214, "gravy");
        SideItem appleslices = new SideItem("Apple slices ","snack",95+188,"peanut butter");
        SideItem gbar = new SideItem("Granola Bar","snack",132,"none");
        SideItem chips = new SideItem("generic chips","snacks",152,"none");
        SideItem fries = new SideItem("small french fries","lunch",222,"ketchup");
        SideItem ttchips = new SideItem("trtilla chips(10chips)","lunch",100,"salsa");
        SideItem fcup = new SideItem("fruit cup","lunch",64,"none");
        SideItem nuts = new SideItem("nut mix","breakfast",172,"none");
        SideItem yogurt = new SideItem("Yogurt","breakfast",100,"none");
        SideItem hashbrown = new SideItem("hashbrown","breakfast",235,"none");
        SideItem salad = new SideItem("salad","any",137,"ranch dressing");
        SideItem apple = new SideItem("Apple","any",95,"none");
        SideItem grapes = new SideItem("grapes","any", 62,"none");
        
        side.add(rice);
        
        int w,h,a; 
        String g;
        System.out.println("please enter in your weight in pounds:");
        w=sc.nextInt();
        while(w > 500 || w < 50){
            System.out.println("invalid weight, please enter in your real weight dawg: ");
            w=sc.nextInt();
        }
        System.out.println("please enter in your height in inches: ");
        h=sc.nextInt();
        System.out.println("please enter in your age in years: ");
        a=sc.nextInt();
        System.out.println("enter in your gender(male or female): ");
        g = sc.nextLine();
        System.out.println("do you want to gain or lose weight: ");
        String go=sc.nextLine();
        
        int breaky;
        int lunchy;
        int snacky;
        int dinnery;
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
                    if((main.get(ctr1).getCalories() + side.get(ctr2).getCalories() + drink.get(ctr3).getCalories() >= breakfastCalories - 300
                    || main.get(ctr1).getCalories() + side.get(ctr2).getCalories() + drink.get(ctr3).getCalories() <= breakfastCalories + 300)
                    && ((main.get(ctr1).getType().equals("breakfast") || main.get(ctr1).getType().equals("any"))
                    && (side.get(ctr2).getType().equals("breakfast") || side.get(ctr2).getType().equals("any"))
                    && (drink.get(ctr3).getType().equals("breakfast") || drink.get(ctr3).getType().equals("any"))))
                    {
                        Meal current = new Meal(main.get(ctr1), side.get(ctr2), drink.get(ctr3), "b");
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
                    if((main.get(ctr1).getCalories() + side.get(ctr2).getCalories() + drink.get(ctr3).getCalories() >= lunchCalories - 300
                    || main.get(ctr1).getCalories() + side.get(ctr2).getCalories() + drink.get(ctr3).getCalories() <= lunchCalories + 300)
                    && ((main.get(ctr1).getType().equals("lunch") || main.get(ctr1).getType().equals("any"))
                    && (side.get(ctr2).getType().equals("lunch") || side.get(ctr2).getType().equals("any"))
                    && (drink.get(ctr3).getType().equals("lunch") || drink.get(ctr3).getType().equals("any"))))
                    {
                        Meal current = new Meal(main.get(ctr1), side.get(ctr2), drink.get(ctr3), "l");
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
                    if((main.get(ctr1).getCalories() + side.get(ctr2).getCalories() + drink.get(ctr3).getCalories() >= dinnerCalories - 300
                    || main.get(ctr1).getCalories() + side.get(ctr2).getCalories() + drink.get(ctr3).getCalories() <= dinnerCalories + 300)
                    && ((main.get(ctr1).getType().equals("dinner") || main.get(ctr1).getType().equals("any"))
                    && (side.get(ctr2).getType().equals("dinner") || side.get(ctr2).getType().equals("any"))
                    && (drink.get(ctr3).getType().equals("dinner") || drink.get(ctr3).getType().equals("any"))))
                    {
                        Meal current = new Meal(main.get(ctr1), side.get(ctr2), drink.get(ctr3), "d");
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
                    if((main.get(ctr1).getCalories() + side.get(ctr2).getCalories() + drink.get(ctr3).getCalories() >= snackCalories - 300
                    || main.get(ctr1).getCalories() + side.get(ctr2).getCalories() + drink.get(ctr3).getCalories() <= snackCalories + 300)
                    && ((main.get(ctr1).getType().equals("snack") )
                    && (side.get(ctr2).getType().equals("snack") || side.get(ctr2).getType().equals("any"))
                    && (drink.get(ctr3).getType().equals("snack") )))
                    {
                        Meal current = new Meal(main.get(ctr1), side.get(ctr2), drink.get(ctr3), "s");
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