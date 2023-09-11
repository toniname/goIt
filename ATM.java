package java_core_grom.mateAkademi.treni.goIt;

public class ATM {

    public int countBanknotes(int sum) {
        int[] banknoteValues = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int banknote = 0;
        int i = 0;

        while (sum > 0) {
            while (sum >= banknoteValues[i]) {
                sum -= banknoteValues[i];
                banknote++;
            }
            i++;
        }

        return banknote;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.countBanknotes(1000));
    }

}
