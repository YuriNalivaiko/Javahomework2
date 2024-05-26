public class Main {
    public static void main(String[] args) {
        int ticketCost = 13676; // стоимость билета
        int milesPerRuble = 20; // количество рублей для одной бонусной мили

        int miles = ticketCost / milesPerRuble; // рассчитываем количество бонусных миль

        System.out.println("Начислено " + miles + " бонусных миль");
    }
}
