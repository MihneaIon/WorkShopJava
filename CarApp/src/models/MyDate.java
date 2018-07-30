package models;

import java.time.Year;

public class MyDate {

    private String yourDAte;

    public MyDate()
    {
        
    }

    public MyDate(String yourDAte) {
        String[] parts;
        parts=yourDAte.split("-");
        if((Integer.parseInt(parts[0])>0 || Integer.parseInt(parts[0])<32) && (Integer.parseInt(parts[1])>0 || Integer.parseInt(parts[1])<13)
                && (Integer.parseInt(parts[2])>1900) || (Integer.parseInt(parts[2])<Integer.parseInt(Year.now()+"")))
        {
           this.yourDAte = yourDAte;
        }
        else
        {
            this.yourDAte="Wrong";
        }

    }

    public String getYourDAte() {
        return yourDAte;
    }

    public void setYourDAte(String yourDAte) {
        this.yourDAte = yourDAte;
    }
}
