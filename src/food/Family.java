package food;

public class Family {
public String husband;
public String wife;
public FoodItems food;

    public Family(String husband, String wife, FoodItems food) {
        this.husband = husband;
        this.wife = wife;
        this.food = food;
    }

    @Override
    public String toString() {
        return "Family{" +
                "husband='" + husband + '\'' +
                ", wife='" + wife + '\'' +
                ", food=" + food +
                '}';
    }

    public Family(String husband, String wife){
        this( husband, wife, new FoodItems());

    }
}
