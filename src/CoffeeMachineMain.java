public class CoffeeMachineMain {
    public static void main(String[] args) {
        System.out.println("Кофемашина");

        int moneyAmount = 120;

        int cappuccinoPrice = 200;
        int espressoPrice = 100;
        int waterPrice = 50;

        if (moneyAmount >= cappuccinoPrice) {
            System.out.println("Вы можете купить каппучино");
        }
        if (moneyAmount >= espressoPrice) {
            System.out.println("Вы можете купить эспрессо");
        }
        if (moneyAmount >= waterPrice) {
            System.out.println("Вы можете купить воду");
        }
    }
}
