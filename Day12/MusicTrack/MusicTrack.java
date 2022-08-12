package examples.collections;

public class MusicTrack {

    private String album;
    private String artist;
    private long id;
    private String title;
    
    public MusicTrack(String album, String artist, long id, String title) {
        this.album = album;
        this.artist = artist;
        this.id = id;
        this.title = title;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "MusicTrack{" +
                "album='" + album + '\'' +
                ", artist='" + artist + '\'' +
                ", id=" + id +
                ", title='" + title ;
    }
    
}
