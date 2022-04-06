package ss18_String_Regex.ThucHanh;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.InflaterInputStream;

public class CrawlSongExample {
       public static void main(String[] args) {
        try {
            URL url= new URL("https://www.nhaccuatui.com/bai-hat/duyen-ta-troi-lay-anh-khoa-cover.73Aut9bi6Vw2.html");
            Scanner scanner= new Scanner(new InflaterInputStream(url.openStream()));
            scanner.useDelimiter("\\Z");
            String context=scanner.next();
            scanner.close();
            context=context.replaceAll("\\n+","");
            //regex
            Pattern pattern= Pattern.compile("name_song\">(.*?)</a>");
            Matcher matcher= pattern.matcher(context);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
