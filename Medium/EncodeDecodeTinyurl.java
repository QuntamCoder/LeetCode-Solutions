package Medium;

import java.util.HashMap;
import java.util.UUID;
class Codec {
   HashMap<String,String> map=new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String tinyurl="https://tiny.com"+UUID.randomUUID().toString();
        map.put(tinyurl, longUrl);
        return tinyurl  ;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
        }
}

// Your Codec object will be instantiated and called as such:

public class EncodeDecodeTinyurl {
    
    public static void main(String[] args) {
        Codec codec = new Codec();
       String str= codec.decode(codec.encode("https://leetcode.com/problems/design-tinyurl"));
       System.out.println(str);
    }
}
