/*
Name: Danny Roubin
Class: CSS 143 Sec B
Assignment: Classes and privacy leaks assignment

Purpose of this file/class is to be a date class

Assumptions for this file:
All days are between 1-31
Each month is between 1-12
each month has 31 days
years will be between 2016-2026
printing an invalid date will return an error message and continue
*/
public class Date {
    private int month;
    private int day;
    private int year;

    public Date() {
        System.out.println("Please only provide a valid date");
    }

    public Date(int month, int day, int year) {
        if (month > 0 && month < 13) {
            if(day >0 && day < 32) {
                if(year > 2015 && year < 2027) {
                    this.month = month;
                    this.day = day;
                    this.year = year;
                } else {
                    System.out.println("Invalid year");
                }
            } else  {
                System.out.println("Invalid day");
            }
        } else {
            System.out.println("Invalid month");
        }
    }

    public Date(Date other) {
        if (other.month > 0 && other.month < 13) {
            if(other.day >0 && other.day < 32) {
                if(other.year > 2015 && other.year < 2027) {
                    this.month = other.month;
                    this.day = other.day;
                    this.year = other.year;
                } else {
                    System.out.println("Invalid year");
                }
            } else  {
                System.out.println("Invalid day");
            }
        } else {
            System.out.println("Invalid month");
        }
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        if (this.month < 10) {
            String holder = ("0"+this.month);
            int res = Integer.parseInt(holder);
            return res;
        } else {
        return this.month;
        }
    }

    public int getDay() {
        if (this.day < 10) {
            String holder = ("0"+this.day);
            int res = Integer.parseInt(holder);
            return res;
        } else {
        return this.day;
        }
    }

    public void setYear(int year) {
        if (year > 2015 && year < 2027) {
            this.year = year;
        } else {
            System.out.println("Invalid year");
        }
    }









    public String toString() {
        if(this.month < 10) {
            if(this.day < 10) {
                String res = ("0" + this.month + "/0" +this.day + "/" + this.year);
                return res;
            } else {
                String res = ("0" + this.month + "/" +this.day + "/" + this.year);
                return res;
            }
        } else {
            if(this.day < 10) {
                String res = (this.month + "/0" +this.day + "/" + this.year);
                return res;
            } else {
                String res = (this.month + "/" +this.day + "/" + this.year);
                return res;
            }
        }
    }




}
