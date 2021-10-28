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
            if (day > 0 && day < 32) {
                if (year > 2015 && year < 2027) {
                    this.month = month;
                    this.day = day;
                    this.year = year;
                } else {
                    System.out.println("Invalid year");
                }
            } else {
                System.out.println("Invalid day");
            }
        } else {
            System.out.println("Invalid month");
        }
    }

    public Date(Date other) {
        if (other.month > 0 && other.month < 13) {
            if (other.day > 0 && other.day < 32) {
                if (other.year > 2015 && other.year < 2027) {
                    this.month = other.month;
                    this.day = other.day;
                    this.year = other.year;
                } else {
                    System.out.println("Invalid year");
                }
            } else {
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
            String holder = ("0" + this.month);
            int res = Integer.parseInt(holder);
            return res;
        } else {
            return this.month;
        }
    }

    public int getDay() {
        if (this.day < 10) {
            String holder = ("0" + this.day);
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

    public void setMonth(int month) {
        if (month > 0 && month < 13) {
            this.month = month;
        } else {
            System.out.println("Invalid month");
        }
    }

    public void setDay(int day) {
        if (day > 0 && day < 32) {
            this.day = day;
        } else {
            System.out.println("Invalid day");
        }
    }

    public void setAll(int month, int day, int year) {
        if (month > 0 && month < 13) {
            if (day > 0 && day < 32) {
                if (year > 2015 && year < 2027) {
                    this.month = month;
                    this.day = day;
                    this.year = year;
                } else {
                    System.out.println("Invalid year");
                }
            } else {
                System.out.println("Invalid day");
            }
        } else {
            System.out.println("Invalid month");
        }
    }

    // checks to see if the compareTo date is after the date this was called on
    public boolean isAfter(Date compareTo) {
        // first check if they're equal so after isequal is made insert a call here

        if (compareTo.year >= this.year) {
            if (compareTo.year > this.year) {
                return true;
            } else {
                if (compareTo.month >= this.month) {
                    if (compareTo.month > this.month) {
                        return true;
                    } else {
                        if (compareTo.day > this.day) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean equals(Object date) {
        if (date instanceof Date) {
            Date other = (Date) date;
            if (this.month == other.month && this.year == other.year && this.day == other.day) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String toString() {
        if (this.month < 10) {
            if (this.day < 10) {
                String res = ("0" + this.month + "/0" + this.day + "/" + this.year);
                return res;
            } else {
                String res = ("0" + this.month + "/" + this.day + "/" + this.year);
                return res;
            }
        } else {
            if (this.day < 10) {
                String res = (this.month + "/0" + this.day + "/" + this.year);
                return res;
            } else {
                String res = (this.month + "/" + this.day + "/" + this.year);
                return res;
            }
        }
    }

}
