package desserts;

public class Cake extends Bakery{

    private int layers;

    public Cake(String name, double price, int caloriesBy100, boolean glutenFree, int weight, int layers) {
        super(name, price, caloriesBy100, glutenFree, weight);
        this.layers = layers;
    }

    public int getLayers() {
        return layers;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    @Override
    public String getDescription() {
        return String.format("This cake %s with %d layers contains %d calories and costs %f", getName(), getLayers(), getCaloriesBy100(), getPrice() );
    }
}
