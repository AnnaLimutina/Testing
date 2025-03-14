package desserts;

public class IceCream extends Desserts{

    private boolean nonDairy;
    private String flavor;
    private String topping;
    private String packaging;

    public IceCream(String name, double price, int caloriesBy100, boolean nonDairy,
                    int weight, String flavor, String topping, String packaging) {
        super(name, price, caloriesBy100, weight);
        this.nonDairy = nonDairy;
        this.flavor = flavor;
        this.packaging = packaging;
        this.topping = topping;
    }

    @Override
    public String getDescription() {
        if (nonDairy) {
            return String.format("This %s ice-cream is non-dairy with %s flavor and %s topping in %s as packaging contains %d costs %f",
                    getName(), getFlavor(), getTopping(), getPackaging(), getCaloriesBy100(), getPrice());
        }
        return String.format("This %s ice-cream with %s flavor and %s topping in %s as packaging contains %d costs %f",
                getName(), getFlavor(), getTopping(), getPackaging(), getCaloriesBy100(), getPrice());
    }

    public boolean isNonDairy() {
        return nonDairy;
    }

    public void setNonDairy(boolean nonDairy) {
        this.nonDairy = nonDairy;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }


}
