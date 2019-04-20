package Generics;

import Generics.Vehicle;

public class Bus extends Vehicle implements Motorized {

    int busNo;
    String company;

    public Bus(int topSpeed, String name, int busNo, String company){
        super(topSpeed,name);
        this.busNo = busNo;
        this.company = company;
    }

    /**
     * @return the busNo
     */
    public int getBusNo() {
        return busNo;
    }

    /**
     * @param busNo the busNo to set
     */
    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }
    

    @Override
    public String toString() {
        return "BUS " + super.toString() + " " + busNo + " " + company;
    }

    @Override
    public int returnMPG() {
        return 0;
    }
}