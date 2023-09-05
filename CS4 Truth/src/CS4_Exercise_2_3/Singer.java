package CS4_Exercise_2_3;

public class Singer{
    private String artistName;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances;

    //getter and setter methods
    public String getArtistName() {
        return artistName;
    }
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
    public int getNoOfPerformances() {
        return noOfPerformances;
    }
    public void setNoOfPerformances(int noOfPerformances) {
        this.noOfPerformances = noOfPerformances;
    }
    public double getEarnings() {
        return earnings;
    }
    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
    public Song getFavoriteSong() {
        return favoriteSong;
    }
    public void setFavoriteSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
    public static int getTotalPerformances() {
        return totalPerformances;
    }
    public static void setTotalPerformances(int totalPerformances) {
        Singer.totalPerformances = totalPerformances;
    }

    //public methods 
    //increases noOfPerformances and totalPerformances by 1 and earnings by 100 for each person
    public void performForAudience(int noOfPeople){
        noOfPerformances += 1;
        totalPerformances += 1;
        earnings += 100 * noOfPeople;
    }

    /* increases noOfPerformances for each singer and totalPeformances by 1, 
       adds earnings for each singer by 50 (100 split for both) for each person
       increases totalPerformances by 2, assuming that a performance counts for both*/
    public void performForAudience(int noOfPeople, Singer collabSinger) {
        noOfPerformances += 1;
        collabSinger.noOfPerformances += 1;
        earnings += 50 * noOfPeople;
        collabSinger.earnings += 50 * noOfPeople;
        totalPerformances += 2;
    }

    public void changeFavSong(Song newSong){
    //changes the singers favoriteSong 
        this.favoriteSong = newSong;
    }

    //constructor method
    public Singer(String artistName, int noOfPerformances, double earnings, Song favoriteSong){
        this.artistName = artistName;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
        Singer.totalPerformances += noOfPerformances;
    }
}

