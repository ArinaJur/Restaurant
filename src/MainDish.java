public class MainDish {
    private String mainDishName;
    private double mainDishPrice;

    MainDish(String name, double price) {
        this.mainDishName = name;
        this.mainDishPrice = price;
    }

    public String getMainDishName() {
        return mainDishName;
    }

    public double getMainDishPrice() {
        return mainDishPrice;
    }

    public void setMainDishName(String name) {
        this.mainDishName = name;
    }

    public void setMainDishPrice(double price) {
        this.mainDishPrice = price;
    }
}
