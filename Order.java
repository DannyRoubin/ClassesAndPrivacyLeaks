/*
Name: Danny Roubin
Class: CSS 143 Sec B
Assignment: Classes and privacy leaks assignment

Purpose of this file/class is to be a money class where a user is able to add in a dollar and cent amount, 
then is able to add to it, set dollar and cent amounts, compare it to other money objects, and print the value out
*/
public class Order {
    private Money amount;
    private Date orderDate;
    private Date sentDate;
    private String customer;
    private String item;

    // constructor which makes sure that no null data is entered in prior to setting any of the data in
    public Order(Money amount, Date orderDate, String customer, String item) {
        if (amount != null && orderDate != null && customer != null && item != null) {
            this.amount = amount;
            this.orderDate = orderDate;
            this.customer = customer;
            this.item = item;
        }
    }

    // copy constructor which makes sure all the incoming data is valid prior to setting anything
    public Order(Order toCopy) {
        if (toCopy.amount != null && toCopy.orderDate != null && toCopy.customer != null && toCopy.item != null) {
            this.amount = toCopy.amount;
            this.orderDate = toCopy.orderDate;
            this.customer = toCopy.customer;
            this.item = toCopy.item;
        }
    }

    // simple get method which gets the amount
    public Money getAmount() {
        return this.amount;
    }

    // simple get method which gets the orderDate
    public Date getOrderDate() {
        return this.orderDate;
    }

    // simple get method which gets the customer name
    public String getCustomer() {
        return this.customer;
    }

    // simple get method which gets the item
    public String getItem() {
        return this.item;
    }

    // method to check if the order is fulfilled (if it was sent out) or not
    public boolean isFulfilled() {
        if (sentDate != null) {
            return true;
        } else {
            return false;
        }
    }

    // setter for sentDate, but first checks if the order has been fulfilled, if not then checks to make sure
    // the dateSent is either after or equal to the orderDate prior to setting any data
    public boolean setFulfilled(Date dateSent) {
        if (dateSent != null) {
            if (isFulfilled() == false) {

                if (this.orderDate.isAfter(dateSent) || this.orderDate.equals(dateSent)) {
                    this.sentDate = dateSent;
                    return true;
                } else {
                    System.out.println("The date given was before the order date and therefore not valid");
                    return false;
                }
            } else {
                System.out.println("This order has already been fulfilled");
                return false;
            }
        } else {
            return false;
        }
    }

    // sets the orderdate but first checks if the order has already been fulfilled
    public boolean setOrderDate(Date nextDate) {
        if (nextDate != null) {
            if (!this.isFulfilled()) {
                this.orderDate = nextDate;
                return true;
            } else {
                System.out.println("This order has already been fulfilled");
                return false;
            }
        } else {
            System.out.println("The new orderDate can't be null");
            return false;
        }
    }

    // sets the amount of the order but first checks to see if the order has already been fulfilled
    public boolean setAmount(Money amount) {
        if (amount != null) {
            if (!this.isFulfilled()) {
                this.amount = amount;
                return true;
            } else {
                System.out.println("This order has already been fulfilled");
                return false;
            }
        } else {
            System.out.println("The new amount can't be null");
            return false;
        }
    }

    // Sets a customer for the order but first makes sure that the order is not already fulfilled
    public void setCustomer(String customer) {
        if (customer != null) {
            if (!this.isFulfilled()) {
                this.customer = customer;
            } else {
                System.out.println("This order has already been fulfilled");
            }
        } else {
            System.out.println("the customer cannot be null");
        }
    }

    // For this toString I am also adding the customer name since I feel as if that
    // is an important piece of info as well
    public String toString() {
        if (isFulfilled()) {
            return "{" + " item='" + getItem() + "'" + " Customer name='" + getCustomer() + "'" + " amount='"
                    + getAmount() + "'" + ", orderDate='" + getOrderDate() + "'" + ", if sent='" + isFulfilled() + "'"
                    + ", sentDate='" + this.sentDate + "'" + "}";
        } else {
            return "{" + " item='" + getItem() + "'" + " Customer name='" + getCustomer() + "'" + " amount='"
                    + getAmount() + "'" + ", orderDate='" + getOrderDate() + "'" + ", if sent='" + isFulfilled() + "'"
                    + "}";
        }
    }

    // equals method to check if the two orders are equal to each other in content
    public boolean equals(Object toCompare) {
        if (toCompare instanceof Order) {
            Order other = (Order) toCompare;
            if (this.customer == other.customer && this.item == other.item) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
