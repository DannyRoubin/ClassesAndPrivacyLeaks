/*
Name: Danny Roubin
Class: CSS 143 Sec B
Assignment: Classes and privacy leaks assignment

Purpose of this file/class is to be a driver for the money, date, and order classes
and to test every method with a proper and improper insertion of data
*/
public class MoneyDateOrderDriver {


    /*
    ASK QUESTION ABOUT GETTERS RETURNING 01 OR 1
    */
    
    public static void main(String[] args) {
        // moneyClassDriver();
        dateClassDriver();
    }

    // Driver method for testing money class
    public static void moneyClassDriver() {
        // testing constructors 
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
         money1.add(2);
         System.out.println("Testing add with just a dollar amount, expecting $2.00: " + money1.toString());
         System.out.println("Testing add with just a negative dollar amount, expecting error on next line: " );
         money1.add(-2);
         money1.add(1,10);
         System.out.println("Testing add with a dollar and cent amount, expecting $3.10: " + money1.toString()); 
         System.out.println("Testing add with a negative dollar and positive cent amount, expecting error on next line: "); 
         money1.add(-2,40);
         System.out.println("Testing add with a positive dollar and negative cent amount, expecting error on next line: "); 
         money1.add(5,-80);
         System.out.println("Testing add with a negative dollar and negative cent amount, expecting error on next line: "); 
         money1.add(-990,-4);
         money1.add(money2);
         System.out.println("Testing adding another money object, expecting $34.60: " + money1.toString());
         System.out.println("");

          // testing Equals
          System.out.println("Testing Equals");
          System.out.println("----------------------------");
          System.out.println("money1 " + money1.toString());
          System.out.println("money2 " + money2.toString());
          System.out.println("money3 " + money3.toString());
          System.out.println("money4 " + money4.toString());
          System.out.println("Checking if money1 and money2 are equal, expected outcome, false: " + money1.equals(money2));
          System.out.println("Checking if money3 and money4 are equal, expected outcome, true: " + money3.equals(money4));
    }

    public static void dateClassDriver() {
        // testing constructors and toString()
        System.out.println("Testing constructors");
        System.out.println("---------------------------");
        System.out.println("Testing blank constructor, expecting error on the next line: ");
        Date date1 = new Date();
        Date date2 = new Date(1,2,2016);
        System.out.println("Testing full input constructor, expecting '01/02/2016': " + date2.toString());
        Date date3 = new Date(12,5,2018);
        System.out.println("Testing full input constructor, expecting '12/05/2018': " + date3.toString());
        Date date4 = new Date(11,15,2026);
        System.out.println("Testing full input constructor, expecting '11/15/2026': " + date4.toString());
        Date date5 = new Date(2,23,2019);
        System.out.println("Testing full input constructor, expecting '02/23/2019': " + date5.toString());
        Date date6 = new Date(date5);
        System.out.println("Testing copy constructor, expecting '02/23/2019': " + date6.toString());
        System.out.println("Testing full input constructor but looking for error, expecting 'invalid month' on next line: ");
        Date date7 = new Date(0,20,2019);
        System.out.println("Testing full input constructor but looking for error, expecting 'invalid day' on next line: ");
        Date date8 = new Date(3,56,2021);
        System.out.println("Testing full input constructor but looking for error, expecting 'invalid year' on next line: ");
        Date date9 = new Date(3,12,11);
        System.out.println("");

        // testing getters
        System.out.println("Testing getters");
        System.out.println("----------------------------");
        System.out.println("Testing getYear, expecting 2016: " + date2.getYear());
        System.out.println("Testing getMonth, expecting 01: " + date2.getMonth());
        System.out.println("Testing getDay, expecting 02: " + date2.getDay());
        System.out.println("");

        // testing Setters
        System.out.println("Testing Setters");
        System.out.println("----------------------------");
        System.out.println("Showing the value of date1 prior to any setters: " + date1.toString());
        date1.setAll(1,5,2020);
        System.out.println("Testing setAll with all valid inputs, expecting 01/05/2020: " + date1.toString());
        System.out.println("Testing setAll with an invalid month input, expecting error on the next line: ");
        date1.setAll(13,10,2016);
        System.out.println("Testing setAll with an invalid day input, expecting error on the next line: ");
        date1.setAll(11,54,2017);
        System.out.println("Testing setAll with an invalid year input, expecting error on the next line: ");
        date1.setAll(9,14,2096);
        date1.setYear(2017);
        System.out.println("Testing setYear with a valid input, expecting 01/05/2017: " + date1.toString());
        System.out.println("Testing setYear with an invalid input, expecting error on the next line: ");
        date1.setYear(2751);
        date1.setMonth(12);
        System.out.println("Testing setMonth with a valid input, expecting 12/05/2017: " + date1.toString());
        System.out.println("Testing setMonth with an invalid input, expecting error on the next line: ");
        date1.setMonth(13);
        date1.setDay(31);
        System.out.println("Testing setDay with a valid input, expecting 12/31/2017: " + date1.toString());
        System.out.println("Testing setDay with an invalid input, expecting error on the next line: ");
        date1.setDay(32);
        System.out.println("");

         // testing isAfter
         System.out.println("Testing isAfter");
         System.out.println("----------------------------");
         System.out.println("Printing out date1 to show what it is prior to any changes: " + date1.toString());
         System.out.println("Printing out date2 to show what it is prior to any changes: " + date2.toString());
         System.out.println("Testing if date2 is after date1, expecting false: "+ date1.isAfter(date2));
         System.out.println("Testing if date1 is after date2, expecting true: "+ date2.isAfter(date1));
         date2.setYear(2017);
         System.out.println("Printing out date1 to show what it is : " + date1.toString());
         System.out.println("Printing out date2 to show what it is : " + date2.toString());
         System.out.println("Testing if date2 is after date1 now that the years are the same, expecting false: "+ date1.isAfter(date2));
         System.out.println("Testing if date1 is after date2 now that the years are the same, expecting true: "+ date2.isAfter(date1));
         date2.setMonth(12);
         System.out.println("Printing out date1 to show what it is : " + date1.toString());
         System.out.println("Printing out date2 to show what it is : " + date2.toString());
         System.out.println("Testing if date2 is after date1 now that the years and months are the same, expecting false: "+ date1.isAfter(date2));
         System.out.println("Testing if date1 is after date2 now that the years and months are the same, expecting true: "+ date2.isAfter(date1));
         System.out.println("");

         // testing Equals
         System.out.println("Testing Equals");
         System.out.println("----------------------------");
         System.out.println("Printing out date1 to show what it is prior to any changes: " + date1.toString());
         System.out.println("Printing out date2 to show what it is prior to any changes: " + date2.toString());
         System.out.println("Testing equals method, expecting false: " + date1.equals(date2));
         date2.setDay(31);
         System.out.println("Testing equals method, expecting true: " + date1.equals(date2));


    }

}
