package CS4_Exercise_2_3;
public class Main{
    public static void main(String[] args){
        //creating new instances of roommates
        Roommate emman = new Roommate("Emmanuel Arizabal", 120, true);
        Roommate abram = new Roommate("Abram Sillano", 12, false);
        Roommate dave = new Roommate("Dave Laforteza", 57, false);

        //creating new instances of songs
        Song limbo = new Song("Limbo", "Keshi", 212);
        Song bubbleTea = new Song("bubble tea", "Zamir, Marc Indigo", 168);
        
        //creating new instances of singers
        Singer edSheeran = new Singer("Ed Sheeran", 50, 10000.00, limbo);
        Singer danielPadilla = new Singer("Daniel Padilla", 10, 1000.00, bubbleTea);
        
        edSheeran.performForAudience(12, danielPadilla);
        edSheeran.changeFavSong(bubbleTea);

        //testing output of methods
        System.out.println(Singer.getTotalPerformances());
        System.out.println(edSheeran.getEarnings());
        System.out.println(danielPadilla.getEarnings());
        System.out.println(edSheeran.getNoOfPerformances());
        System.out.println(danielPadilla.getFavoriteSong().getSongTitle());

        dave.setMessagesCount(143);
        System.out.println(dave.getMessagesCount());

        System.out.println("My roommates are " + emman.getFullName() + ", " + dave.getFullName() + ", and " + abram.getFullName());
    }
}
