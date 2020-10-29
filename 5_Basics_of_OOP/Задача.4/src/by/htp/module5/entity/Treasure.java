package by.htp.module5.entity;

import java.io.Serializable;

public class Treasure implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nameTreasure;
    private int costTreasure;

    public Treasure(){

    }

    public Treasure(String nameTreasure, int costTreasure) {
        this.nameTreasure = nameTreasure;
        this.costTreasure = costTreasure;
    }

    public void setNameTreasure(String nameTreasure){

        this.nameTreasure = nameTreasure;
    }

    public void setCostTreasure(int costTreasure){

        this.costTreasure = costTreasure;
    }
    public String getNameTreasure() {

        return nameTreasure;
    }

    public int getCostTreasure() {

        return costTreasure;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Treasure treasure = (Treasure) obj;
        if (nameTreasure == null) {
            if (treasure.nameTreasure != null)
                return false;
        } else if (!nameTreasure.equals(treasure.nameTreasure))
            return false;
        if (costTreasure != treasure.costTreasure)
            return false;
        return true;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + ((nameTreasure == null) ? 0 : nameTreasure.hashCode());
        result = prime * result + costTreasure;
        return result;
    }

    @Override
    public String toString() {

        return "nameTreasure: " + nameTreasure + " costTreasure: " + costTreasure;
    }
}
