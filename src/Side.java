public class Side {

    private String sideName;
    private double sidePrice;

    Side(String name, double price) {
        this.sideName = name;
        this.sidePrice = price;
    }

    public String getSideName() {
        return sideName;
    }

    public double getSidePrice() {
        return sidePrice;
    }

    public void setSideName(String sideName) {
        this.sideName = sideName;
    }

    public void setSidePrice(double sidePrice) {
        this.sidePrice = sidePrice;
    }
}
