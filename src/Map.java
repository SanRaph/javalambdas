import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map {
    public static void main(String[] args) {
        //TODO: create a map
        HashMap<Integer, String> map = new HashMap();
        //TODO: put things in map
        map.put(1, "Janey");
        map.put(2, "Teney");
        map.put(3, "Azeez");
        //TODO: convert to set for traversing

        Set set = map.entrySet();

        //TODO: loop thru
        Iterator iterator = set.iterator();

        while(iterator.hasNext()){
           //TODO: converting back to Map.Entry so we can get key and values separately
            java.util.Map.Entry entry = (java.util.Map.Entry) iterator.next();

//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append(entry.getKey());
//            stringBuilder.append("=>");
//            stringBuilder.append(entry.getValue());

           System.out.println(entry.getKey() + " " +"=>" + " " + " " + entry.getValue());
        }
    }
}
