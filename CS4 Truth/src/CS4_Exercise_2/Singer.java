package CS4_Exercise_2;

public class Singer{
    String artistName;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public void performForAudience(int noOfPeople){
    //increases noOfPerformances by 1 and earnings by 100 for each person
        noOfPerformances += 1;
        earnings += 100 * noOfPeople;
    }
    public void changeFavSong(Song newSong){
    //changes favoriteSong
        this.favoriteSong = newSong;
    }

    public Singer(String artistName, int noOfPerformances, double earnings, Song favoriteSong){
        this.artistName = artistName;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
    }
}

