package food;

public class FoodTest {
    public static void main(String[]args){
        FoodItems foodItems = new FoodItems();
        foodItems.rice = "WhiteRice";
        foodItems.curry = "Potato";

        Family family = new Family("Krishna", "Radha", foodItems);
        System.out.println("HomeFood"+ family);
        Family family1 = new Family("Krishna", "Radha");
        System.out.println("OutSideFood"+ family1);

    }
}
