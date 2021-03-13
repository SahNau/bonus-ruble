public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int payment = 1100;
        int bonus=0;
        if (payment >= 1000) {
            bonus = payment / 100;
        }
        int balance = payment + startBalance + bonus;
        System.out.println(balance);
    }
}
