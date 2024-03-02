package food;

public class FoodItems {
    public String rice;
    public String curry;


    @Override
    public String toString() {
        return "FoodItems{" +
                "rice='" + rice + '\'' +
                ", curry='" + curry + '\'' +
                '}';
    }

    public FoodItems(){
        rice = "Biryani";
        curry = "Paneer";

    }
}
