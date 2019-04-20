package Maps;

public class Name implements Comparable<Name> {
    public String lastName, firstName;
    public Name(String last, String first) {
        lastName = last; firstName = first;
    }
    public int compareTo(Name other) {
        int lastCheck = this.lastName.compareTo(other.lastName);
        if (lastCheck == 0)
            return this.firstName.compareTo(other.firstName);
        else
            return lastCheck;
    }


    public boolean equals(Name other) {
        return this.lastName.equals(other.lastName) && this.firstName.equals(other.firstName);
    }

    public String toString(){
        return this.firstName + " " + this.lastName;
    }

}