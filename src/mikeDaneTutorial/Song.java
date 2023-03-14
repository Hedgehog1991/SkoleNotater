package mikeDaneTutorial;

public class Song {
    private String title;
    private String artist;
    private int length;
    private static int songsCount = 0;

    public Song(String title, String artist, int length){
        this.title = title;
        this.artist = artist;
        this.length = length;
        songsCount++;
        System.out.println("songs count: " + songsCount); //add every time the constructor is called
    }

/*Static attributes are going the be the same shared attribute across all
objects. Originating from its spesified class.
non-static = 2 dogs probably nearby.
static = 2 dogs on equally long leashes connected to the same pole. Or
has the same owner. (dogs share the same static pole)
Static does not mean fixed value, it means shared value.
 */
    public int getSongsCount(){
        return songsCount;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
}
