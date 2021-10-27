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
        double res = 0.0;
        String strVal = this.getMonToString();
        res = Double.parseDouble(strVal); 

        return res;
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

    // toString method, contains if statement for proper printing if the number is under 10
    public String toString() {
        if (this.cents <10) {
        String res = ("$"+this.dollars+".0"+this.cents);
        return res;
        } else {
        String res = ("$"+this.dollars+"."+this.cents);
        return res;
        }
    }

    public String getMonToString() {
        if (this.cents <10) {
            String res = (this.dollars+".0"+this.cents);
            return res;
            } else {
            String res = (this.dollars+"."+this.cents);
            return res;
            }
    }

    public void centCheck(){
        while (this.cents > 99) {
            this.cents -= 100;
            this.dollars++;
        }
    }

    
}
