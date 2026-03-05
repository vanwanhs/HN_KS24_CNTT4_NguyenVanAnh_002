import java.util.*;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        if(text.trim().isEmpty()){
            System.out.println("Looi : chuoi khong duoc de trong");
            return;
        }
        text= text.toLowerCase();
        text =text.replace("."," ").replace("," ," ");
        String[] words = text.split("\\s+");
        Map<Integer, Set<String>> map = new TreeMap<>();
        for(String word : words){
            int length = word.length();
            if(!map.containsKey(length)){
                map.put(length, new HashSet<>());
            }
            map.get(length).add(word);

        }
        System.out.println("Phaan loaij theo do dai");
        for(Map.Entry<Integer,Set<String> > entry: map.entrySet()){
            System.out.println("_"+entry.getKey() + "kys tuwj "+ entry.getValue());
        }
    }
}
