package desserts;

public abstract class Bakery extends Desserts{
    private boolean glutenFree;

    public Bakery(String name, double price, int caloriesBy100, boolean glutenFree, int weight) {
        super(name, price, caloriesBy100, weight);
        this.glutenFree = glutenFree;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }
}
