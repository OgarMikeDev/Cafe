public class Main {
    public static void main(String[] args) {
        Drink firstDrink = new Tea(
                "Чёрный чай", 0.5, 680,
                true, true
        );
        System.out.println(
                "Полная стоимость первого напитка: " +
                        firstDrink.getTotalPrice() + " руб.");

        Drink secondDrink = new Latte(
                "Обычный латте", 0.3, 250,
                true, true
        );
        System.out.println(
                "Полная стоимость второго напитка: " +
                        secondDrink.getTotalPrice() + " руб.");

        Drink thirdDrink = new Americano(
                "Американо", 0.3, 100,
                false, true
        );
        System.out.println(
                "Полная стоимость третьего напитка: " +
                        thirdDrink.getTotalPrice() + " руб.");
    }
}
