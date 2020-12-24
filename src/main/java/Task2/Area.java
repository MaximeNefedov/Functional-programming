package Task2;

public class Area {

    private String name;
    private int width;
    private int height;
    private int landArea;
    private int totalPrice;
    private int landPrice;

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLandArea() {
        return landArea;
    }

    public int getLandPrice() {
        return landPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLandArea(int landArea) {
        this.landArea = landArea;
    }

    public void setLandPrice(int landPrice) {
        this.landPrice = landPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return String.format("Участок \"%s\", %d кв.м (%dм x %dм), цена за квадратный метр %d, общая стоимость %d",
                name, landArea, width, height, landPrice, totalPrice);
    }
}
