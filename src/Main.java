public class Main {
    public static void main(String[] args) {
        double scet = 100.50; // начальный счет
        int amount = 100;// суммы пополнения
        int bonus;

        // if (amount > 1000) {
        //      bonus = amount / 100;
        //  } else {
        //      bonus = 0;
        //  }
        bonus = (amount > 1000) ? bonus = amount / 100 : 0;
        System.out.println("Ваша сумма:" + (scet + amount + bonus));

    }
}
