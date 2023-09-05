package CS4_Exercise_2;
public class Main{
    public static void main(String[] args){
        Roommate emman = new Roommate("Emmanuel Arizabal", 120, true);
        Roommate abram = new Roommate("Abram Sillano", 12, false);
        Roommate dave = new Roommate("Dave Laforteza", 57, false);

        Song limbo = new Song("Limbo", "Keshi", 212);
        Song bubbleTea = new Song("bubble tea", "Zamir, Marc Indigo", 168);
        
        Singer edSheeran = new Singer("Ed Sheeran", 50, 10000.00, limbo);
        Singer danielPadilla = new Singer("Daniel Padilla", 10, 1000.00, bubbleTea);
        
        edSheeran.performForAudience(20, danielPadilla);
        edSheeran.changeFavSong(bubbleTea);

        System.out.println(Singer.getTotalPerformances());
        System.out.println(edSheeran.getEarnings());
        System.out.println(danielPadilla.getEarnings());
        System.out.println("My roommates are " + emman.fullName + ", " + dave.fullName + ", and " + abram.fullName);
    }
}
