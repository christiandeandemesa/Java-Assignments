import java.util.*;
public class SongList {
    public static void main(String[] args) {

        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Believer", "Believer. Believer!");
        trackList.put("Boondocks", "You get a line, I'll get a pole...");
        trackList.put("Cake by the Ocean", "I keep on hoping we'll eat cake by the ocean!");
        trackList.put("Tricky", "...rock around...");

        String popTitle = trackList.get("Cake by the Ocean");
        System.out.println(popTitle);

        Set<String> keys = trackList.keySet();
        for(String key: keys) {
            System.out.printf("%s: %s\n", key, trackList.get(key));
        }

    }
}