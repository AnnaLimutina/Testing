package desserts;

public class Cookie extends Bakery{
    private int size;
    private String shape;

    public Cookie(String name, double price, int caloriesBy100, boolean glutenFree, int weight, int size, String shape) {
        super(name, price, caloriesBy100, glutenFree, weight);
        this.shape = shape;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String getDescription() {
        return String.format("This cookie %s in shape of %s contains %d calories and costs %f", getName(), getShape(), getCaloriesBy100(), getPrice() );
    }
}
