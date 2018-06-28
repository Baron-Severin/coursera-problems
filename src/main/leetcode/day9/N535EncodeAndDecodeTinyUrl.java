package leetcode.day9;

import java.util.ArrayList;
import java.util.List;

public class N535EncodeAndDecodeTinyUrl {

  private final List<String> urls = new ArrayList<>();
  private final String base = "http://tinyurl.com/";

  // Encodes a URL to a shortened URL.
  public String encode(String longUrl) {
    if (!urls.contains(longUrl)) {
      urls.add(longUrl);
    }
    return base + urls.indexOf(longUrl);
  }

  // Decodes a shortened URL to its original URL.
  public String decode(String shortUrl) {
    try {
      final String code = shortUrl.substring(base.length());
      return urls.get(Integer.parseInt(code));
    } catch (Exception e) {
      return "";
    }
  }

}
