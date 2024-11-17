import java.util.*;

import java.util.ArrayList;

public class Contact {
    private String ID;                                 //Attributes
    private String Name;

    public Contact(String ID, String name) {           //Constructor
        this.ID = ID;
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {this.ID = ID;}

    public String getName() {return Name;}

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {                         //function to display
        return "Contact{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }

}