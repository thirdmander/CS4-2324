package CS4_Exercise_2;

public class Singer{
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public void performForAudience(int noOfPeople){
    //increases noOfPerformances by 1 and earnings by 100 for each person (e.g. 5 people results in 500 increase)
        noOfPerformances += 1;
        earnings += 100 * noOfPeople;
    }
    public void changeFavSong(Song newSong){
    //changes favoriteSong
        favoriteSong = newSong;
    }

    public Singer(String artistName, int performancesCount, double totalEarnings, Song songFavorite){
        name = artistName;
        noOfPerformances = performancesCount;
        earnings = totalEarnings;
        favoriteSong = songFavorite;
    }
}

