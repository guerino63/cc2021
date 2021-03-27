package it.room.cc2021;

/**
 *
 * @author ma
 */
public class StudioClassi {

    
    public void init(){
        Team TNapoli = new Team();
        
        System.out.println(TNapoli.toString());
        
        TNapoli.id = 1;
        TNapoli.name = "Napoli";
        TNapoli.city = "Napoli";
        
        Team TJuve = new Team(2, "Juventus", 0f, "", "Agnello", "Torino");
        
        System.out.println(TNapoli.toString());
        System.out.println(TJuve.toString());
    }
}
