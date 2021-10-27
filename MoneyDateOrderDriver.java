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
        System.out.println("");

        // testing getters
        System.out.println("Testing getters");
        System.out.println("----------------------------");
        System.out.println("Testing getDollars, expecting 6: " + money2.getDollars());
        System.out.println("Testing getCents, expecting 11: " + money4.getCents());
        System.out.println("Testing getMoney, expecting 5.11: " + money4.getMoney());
        System.out.println("");

        // testing Setters
        System.out.println("Testing Setters");
        System.out.println("----------------------------");
        System.out.println("Showing the value of money2 prior to any setters " + money2.toString());
        money2.setDollars(10);
        System.out.println("Testing setDollars, expecting $10.00: " + money2.toString());
        System.out.println("Testing SetDollars with a negative number, expecting error on the next line: ");
        money2.setDollars(-10);
        money2.setCents(49);
        System.out.println("Testing setCents, expecting $10.49: " + money2.toString());
        System.out.println("Testing setCents with a negative number, expecting error on the next line: " );
        money2.setCents(-49);
        money2.setCents(149);
        System.out.println("Testing setCents with a number over 99, expecting $11.49: " + money2.toString());
        money2.setMoney(5,10);
        System.out.println("Testing setMoney, expecting $5.10: " + money2.toString());
        System.out.println("Testing setMoney with a negative dollar amount, expecting error on the next line: ");
        money2.setMoney(-2,15);
        System.out.println("Testing setMoney with a negative cent amount, expecting error on the next line: ");
        money2.setMoney(98,-75);
        System.out.println("Testing setMoney with a negative cent and dollar amount, expecting error on the next line: ");
        money2.setMoney(-63,-150);
        money2.setMoney(30,150);
        System.out.println("Testing setMoney with a cent value over 99, expecting $31.50: " + money2.toString());
        System.out.println("");

         // testing Adding
         System.out.println("Testing Adding");
         System.out.println("----------------------------");
         System.out.println("Showing the value of money1 prior to any setters " + money1.toString());


    }
}
