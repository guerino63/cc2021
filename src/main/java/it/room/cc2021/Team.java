package it.room.cc2021;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

    static List<Team> list = new ArrayList<>();
    
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

    /**
     *
     */
    public static void init(){
        list.add(new Team(0, "Napoli", 0.5f, "Bagni", "Ferlaino", "Napoli"));
        list.add(new Team(1, "Juventus", 0.5f, "Mago Zurlì", "Agnelli", "Torino"));
    }
    
    @Override
    public String toString() {
        return String.format("Team[%03d] - \tName:%-30s, City:%-30s",id, name,city);
    }
    
    
    public static void main(String[] args) {
        Team.init();
        
        list.sort(new Comparator<Team>() {
            @Override
            public int compare(Team o1, Team o2) {
                return (o1.name.compareTo(o2.name));
            }
        });
        
        for(Team t : list){
            System.out.println(t);
        }
    }
}
