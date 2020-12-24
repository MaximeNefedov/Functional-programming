package Task2;

public class AreaBuilder {

//    В течение всей реализации паттерна строителя используются грязные функции,
//    поскольку явно происходит изменение объекта

    private Area area = new Area();

    public AreaBuilder setName(String name) {
        area.setName(name);
        return this;
    }

    public AreaBuilder setWidth(int width) {
        area.setWidth(width);
        return this;
    }

    public AreaBuilder setHeight(int height) {
        area.setHeight(height);
        return this;
    }

    public AreaBuilder calculateLandArea() {
        area.setLandArea(area.getWidth() * area.getHeight());
        return this;
    }

    public AreaBuilder setPrice(int price) {
        area.setTotalPrice(price);
        area.setLandPrice(area.getTotalPrice() / area.getLandArea());
        return this;
    }

    public Area build() {
        return area;
    }
}
