package by.htp.module5.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Dragon implements Serializable {

    private static final long serialVersionUID = 2L;

    private List<Treasure> treasures;

    {
        treasures = new ArrayList<Treasure>();
    }

    public Dragon() {

    }

    public List<Treasure> getTreasures(){
        return treasures;
    }

    public void setTreasures(List <Treasure> treasures){

        this.treasures = treasures;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dragon dragon = (Dragon) obj;

        if (!dragon.treasures.equals(treasures))
            return false;
        return true;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + ((treasures == null) ? 0 : treasures.hashCode());
        return result;
    }

    @Override
    public String toString() {

        return "Treasures: " + treasures.toString();
    }


    
}
