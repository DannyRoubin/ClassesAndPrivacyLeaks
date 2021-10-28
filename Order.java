public class Order {
    private Money amount;
    private Date orderDate;
    private Date sentDate;
    private String customer;
    private String item;

    // Note check for null on any method that passes in an object

    public Order(Money amount, Date orderDate, String customer, String item) {
        if (amount != null && orderDate != null && customer != null && item != null) {
            this.amount = amount;
            this.orderDate = orderDate;
            this.customer = customer;
            this.item = item;
        }
    }

    public Order(Order toCopy) {
        if (toCopy.amount != null && toCopy.orderDate != null && toCopy.customer != null && toCopy.item != null) {
            this.amount = toCopy.amount;
            this.orderDate = toCopy.orderDate;
            this.customer = toCopy.customer;
            this.item = toCopy.item;
        }
    }

    public Money getAmount() {
        return this.amount;
    }

    public Date getOrderDate() {
        return this.orderDate;
    }

    public String getCustomer() {
        return this.customer;
    }

    public String getItem() {
        return this.item;
    }

    public boolean isFulfilled() {
        if (sentDate != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean setFulfilled(Date dateSent) {
        if (dateSent != null) {
            if (this.sentDate == null) {

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

    public void setCustomer(String customer) {
        if (customer != null) {
            this.customer = customer;
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
