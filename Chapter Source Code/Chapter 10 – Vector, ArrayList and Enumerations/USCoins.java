import java.util.Vector;

public class USCoins {

    public enum Coins {

        Penny (0.01), Nickel (0.05), Dime (0.10), Quarter (0.25),
        HalfDollar(0.50);

        private final double value;
        private Coins(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }
    }

    public static void main(String[] args) {

        // Our pocket is a vector rather than an array.
        Vector<Coins> pocket = new Vector<>();
        int x, numCoins, randomCoin;

        // values() returns the enumeration as an array
        Coins[] definedCoins = Coins.values();
        double pocketValue = 0.0;

        // from 1 to 10 random coins in our pocket.
        numCoins = (int)(Math.random() * 10 + 1);
        System.out.printf("There are %d coins in our pocket.%n", numCoins);

        // add a random coin
        for (x = 0; x < numCoins; x++) {
            randomCoin = (int)(Math.random() * definedCoins.length);
            pocket.add(definedCoins[randomCoin]);
        }

        // Display the list of coins and calculate the pocket value
        System.out.println("Our pocket contains:\n" + pocket);
        for (Coins coin : pocket)
            pocketValue = pocketValue + coin.getValue();

        System.out.printf("%nPocket value is $%.2f.%n%n", pocketValue);
    }
}
