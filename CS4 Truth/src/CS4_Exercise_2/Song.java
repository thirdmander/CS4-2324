package CS4_Exercise_2;

public class Song {
    private String songTitle;
    private String songArtist;
    private int songLength; // in seconds

    //getter and setter methods
    public String getSongTitle() {
        return songTitle;
    }
    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }
    public String getSongArtist() {
        return songArtist;
    }
    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }
    public int getSongLength() {
        return songLength;
    }
    public void setSongLength(int songLength) {
        this.songLength = songLength;
    }

    //constructor method
    public Song(String songTitle, String songArtist, int songLength) {
        this.songTitle = songTitle;
        this.songArtist = songArtist;
        this.songLength = songLength;
    }
}
