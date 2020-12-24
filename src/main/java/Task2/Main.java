package Task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите честную цену за кв.м");
        int price = 38;
        AreaSeller seller = new AreaSeller();
        System.out.println("Список рекомендованных сделок:");
//        Чистая функция, за исключением вывода к консоль
        seller.getAreaList().stream()
                .filter(x -> x.getLandPrice() >= price)
                .forEach(System.out::println);

        System.out.println("Список нерекомендованных сделок:");
        seller.getAreaList().stream()
                .filter(x -> x.getLandPrice() < price)
                .forEach(System.out::println);
    }
}
