public class Codec {

    private String BASE_URL = "http://tinyurl.com/";
    HashMap<String, String> encoded = new HashMap<>();
    HashMap<String, String> decoded = new HashMap<>();
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String decodedUrl = BASE_URL + (encoded.size() + 1);
        encoded.put(longUrl, decodedUrl);
        decoded.put(decodedUrl, longUrl);
        
        return encoded.get(longUrl);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return decoded.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));