package desserts;

public abstract class Desserts {
    private String name;
    private double price;
    private int caloriesBy100;
    private int weight;

    public Desserts(String name, double price, int caloriesBy100, int weight) {
        this.name = name;
        this.price = price;
        this.caloriesBy100 = caloriesBy100;
        this.weight = weight;
    }

    public abstract String getDescription();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCaloriesBy100() {
        return caloriesBy100;
    }

    public void setCaloriesBy100(int caloriesBy100) {
        this.caloriesBy100 = caloriesBy100;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
