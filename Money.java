public class Money {
    private int dollars;
    private int cents;

    public Money(){
        dollars = 0;
        cents = 0;
    }

    public Money( int dol){
        if(dol < 0) {
            System.out.println("You cannot have negative dollars");
        } else {
        dollars = dol;
        cents = 0;
        }
    }

    public Money(int dol, int cent){
        if(cent < 0 || dol < 0) {
            System.out.println("You cannot have negative dollars or cents");
        } else {
        dollars = dol;
        cents = cent;
        centCheck();
        }
    }

    public Money(Money other){
        if(other.cents < 0 || other.dollars< 0) {
            System.out.println("You cannot add negative dollars or cents");
        } else {
        this.dollars = other.dollars;
        this.cents = other.cents;
        centCheck();
        }
    }


    public int getDollars() {
        return this.dollars;
    }

    public int getCents() {
        centCheck();
        return this.cents;
    }

    public void setDollars(int dollars) {
        if(dollars < 0) {
            System.out.println("You cannot have negative dollars");
        } else {
        this.dollars = dollars;
        }
    }

    public void setCents(int cents) {
        if(cents < 0) {
            System.out.println("You cannot have negative cents");
        } else {
        this.cents = cents;
        centCheck();
        }
    }

    public void setMoney(int dollars, int cents) {
        if(cents < 0 || dollars< 0) {
            System.out.println("You cannot have negative dollars or cents");
        } else {
        this.dollars = dollars;
        this.cents = cents;
        centCheck();
        }
    }

    public double getMoney() {
        centCheck();
        double combined = 0.0;
        double newCents = (this.cents / 100);
        combined = (this.dollars + newCents);
        return combined;
    }

    public void add(int dollars) {
        if(dollars < 0) {
            System.out.println("You cannot add negative dollars");
        } else {
        this.dollars += dollars;
        }
    }

    public void add(int dollars, int cents) {
        if(cents < 0 || dollars< 0) {
            System.out.println("You cannot add negative dollars or cents");
        } else {
        this.dollars += dollars;
        this.cents += cents;
        centCheck();
        }
    }

    public void add (Money other) {
        if(other.cents < 0 || other.dollars< 0) {
            System.out.println("You cannot add negative dollars or cents");
        } else {
        this.dollars += other.dollars;
        this.cents += other.cents;
        centCheck();
        }
    }

    public boolean equals(Object o) {
        centCheck();
        Money other = (Money) o;
        if(this.dollars == other.dollars && this.cents == other.cents) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        int newCents = (this.cents / 100);
        String res = ("$"+this.dollars+"."+newCents);
        return res;
    }

    public void centCheck(){
        while (this.cents > 99) {
            this.cents -= 100;
            this.dollars++;
        }
    }

    
}
