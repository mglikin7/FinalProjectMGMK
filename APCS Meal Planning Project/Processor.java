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
                    && ((main.get(ctr1).getType().equals("snack") || main.get(ctr1).getType().equals("any"))
                    && (side.get(ctr2).getType().equals("snack") || side.get(ctr2).getType().equals("any"))
                    && (drink.get(ctr3).getType().equals("snack") || drink.get(ctr3).getType().equals("any"))))
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
