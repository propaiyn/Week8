package examples.collections;

import java.util.ArrayList;

public class MusicRunner {

    public static void main(String[] args) {
    
    ArrayList<MusicTrack> tracks = new ArrayList<>();

    tracks.add(new MusicTrack("Peach dream", "lucki", 23232, "fw3"));
    tracks.add(new MusicTrack("Of course you wont", "lucki", 2323, "fw3"));

    for(MusicTrack i : tracks) {
        System.out.println(i.toString());
    
    }
}}