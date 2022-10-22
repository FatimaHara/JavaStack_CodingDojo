import java.util.Set;
import java.util.HashMap;
public class HashMapTest{
    public static void main(String[] args) {
        HashMap<String, String> trackList  = new HashMap<String, String>();
            trackList.put("FirstSong","lall lall lall lall");
            trackList.put("SecoundSong","ha ha ha ha");
            trackList.put("ThirdSong","lallallallal");
            trackList.put("FourthSong","hlahlahlahla");
            trackList.remove("SecoundSong");

            Set<String> keys = trackList.keySet();

                for(String key : keys) {
                    System.out.println(trackList.get(key));
                }
        }

}