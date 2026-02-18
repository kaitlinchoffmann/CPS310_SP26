class Note {
    //attributes/instance methods
    private String text;
    private String date;
    private boolean locked;

    //constructors
    public Note() {
        text = "empty";
        date = null;
        locked = false;
    }

    public Note(String text, String date, boolean locked) {
        this.text = text;
        this.locked = locked;
        setDate(date);
    }

    //get/accessor methods
    public String getText() {
        return text;
    }

    public String getDate() {
        return date;
    }

    public boolean getLocked() {
        return locked;
    }

    //set/mutator methods
    public void setText(String text) { this.text = text; }

    public void setDate(String date) {
        if (checkDate(date)) {
            this.date = date;
        } else {
            System.out.println("Something is wrong with the date.");
            System.exit(0);
        }
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    //other methods
    public boolean checkDate(String date) {
        if (date.length() == 10) {
            if (date.charAt(2) != '/' || date.charAt(5) != '/') {
                return false;
            }
            String beg = date.substring(0, 2);
            String mid = date.substring(3, 5);
            String end = date.substring(6);
            String onlyNumbers = beg + mid + end;
            for (int i = 0; i < onlyNumbers.length(); i++) {
                char c = onlyNumbers.charAt(i);
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            //next part was NOT needed for the lab, but showing how
            //you can make sure numbers are in correct range:
            int m = Integer.parseInt(beg);
            int d = Integer.parseInt(mid);
            int y = Integer.parseInt(end);
            if (!checkMonthsDaysYear(m, d, y)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return "Note: " + text + " Date: " + date + " Locked: " + locked;
    }

    //NOT part of lab, but showing how we can check dates are realistic
    public boolean checkMonthsDaysYear(int m, int d, int y) {
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (d < 1 || d > 31) {
                    return false;
                }
                return true;
            case 4:
            case 6:
            case 9:
            case 11:
                if (d < 1 || d > 30) {
                    return false;
                }
                return true;
            case 2:
               /*
               checking for leap year:
               A leap year is divisible by 4. However, Century years like 300, 700, 1900, 2000,
               need to be divisible by 400 to check whether they are leap years or not.
               */
                if (y % 4 == 0 || y % 400 == 0) {
                    if (d < 1 || d > 29) {
                        return false;
                    }
                } else if (d < 1 || d > 28) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }
}
