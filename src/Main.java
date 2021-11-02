public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1005;
        int totalBalance = balance + refill;
        boolean bonus = true;
        int refillBalance;
        if (refill > 1000) {
            refillBalance = totalBalance + refill / 100;
        } else {
            refillBalance = totalBalance;
        }
        System.out.println(refillBalance);
    }
}
