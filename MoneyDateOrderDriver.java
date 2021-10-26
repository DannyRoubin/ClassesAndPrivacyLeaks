public class MoneyDateOrderDriver {
    
    public static void main(String[] args) {
        moneyClassDriver();
    }

    // Driver method for testing money class
    public static void moneyClassDriver() {
        // testing constructors constructors
        System.out.println("Testing constructors");
        System.out.println("---------------------------");
        Money money1 = new Money();
        System.out.println("Testing blank constructor, expecting '$0.00': " + money1.toString());
        Money money2 = new Money(6);
        System.out.println("Testing dollar only constructor, expecting '$6.00': " + money2.toString());
        Money money3 = new Money(5,11);
        System.out.println("Testing dollar and cents constructor, expecting '$5.11': " + money3.toString());
        Money money4 = new Money(money3);
        System.out.println("Testing copy constructor, expecting '$5.11': " + money4.toString());

        // testing getters
        System.out.println("Testing getters");
        System.out.println("----------------------------");
        System.out.println("Testing getDollars, expecting 6: " + money2.getDollars());
        System.out.println("Testing getCents, expecting 11: " + money4.getCents());

    }
}
