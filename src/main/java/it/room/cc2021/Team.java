package it.room.cc2021;

/**
 *
 * @author ma
 */
public class Team {
    int id;
    String name;
    float powerMatch;
    String trainer;
    String president;
    String city;

    public Team() {
        id=0;
        name="---";
        city="Roma";
    }

    public Team(int id, String name, float powerMatch, String trainer, String president, String city) {
        this.id = id;
        this.name = name;
        this.powerMatch = powerMatch;
        this.trainer = trainer;
        this.president = president;
        this.city = city;
    }

    
    @Override
    public String toString() {
        return "Team["+id+"]\t Name:"+name+", City:"+city;
    }
    
    
    
}
