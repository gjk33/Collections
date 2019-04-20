package Maps;

public class Person implements Comparable<Person> {
    public String name;
    public int IDNumber;

    public Person(String name, int IDNumber){
        this.name = name;
        this.IDNumber = IDNumber;
    }


    @Override
    public int compareTo(Person o) {
        return  this.name.compareToIgnoreCase(o.name);
    }

    public String toString(){
        return "Name - " + name + " ID - " + IDNumber;
    }
}
