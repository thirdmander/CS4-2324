package CS4_Exercise_2;
public class Main{
    public static void main(String[] args){
        Roommate roommateOne = new Roommate("Emmanuel Arizabal", 120, true);
        Roommate roommateTwo = new Roommate("Abram Sillano", 12, false);
        Roommate roommateThree = new Roommate("Dave Laforteza", 57, false);

        Song songOne = new Song("Limbo", "Keshi", 212);
        Song songTwo = new Song("bubble tea", "Zamir, Marc Indigo", 168);
        
        Singer singerOne = new Singer("Ed Sheeran", 50, 10000.00, songOne);

        singerOne.performForAudience(20);
        singerOne.changeFavSong(songTwo);
    }
}
