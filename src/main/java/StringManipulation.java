import com.google.common.base.CharMatcher;
import org.apache.commons.lang3.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulation {
    public static void main(String[] args) {
        String s = "My Name is Piyal";
        String str[] = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            str[i] = str[i] + str[i].length();
        }
        System.out.println(Arrays.toString(str));
    }
}

class StringManipulation1 {
    public static void main(String[] args) {
        String s = "Mamabharat";
        s = s.toLowerCase();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
//        char strArray[] = s.toCharArray();
        for (char c : s.toCharArray()) {
//            if(hm.containsKey(c)){
//                hm.put(c,hm.get(c)+1);
//            }else {
//                hm.put(c,1);
//            }
            Integer i = hm.containsKey(c) ? hm.put(c, hm.get(c) + 1) : hm.put(c, 1);
        }
        System.out.println(s + ":" + hm);
    }
}
class OccuranceOfString{
    public static void main(String[] args) {
        String s = "Mamabharat";
        s=s.toLowerCase();
        HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
        for (char c : s.toCharArray() ) {
            hm.merge(c,1,Integer::sum);
        }
        System.out.println(hm);
    }
}
//Using Java Streams
class OccuranceOfString1{
    public static void main(String[] args) {
        String s="Mahabharat";
        s=s.toLowerCase();
        long count = s.chars().filter(ch -> ch == 'a').count();
        System.out.println(count);
    }
}
//Using Regular expressions
class OccuranceOfString2{
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[^a]*a");
        Matcher m= p.matcher("Mahabharat");
        int count=0;
        while (m.find()){
            count++;
        }
        System.out.println(count);
    }
}
//Using Guava
class OccuranceOfString3{
    public static void main(String[] args) {
        int i = CharMatcher.is('a').countIn("Mahabharat");
        System.out.println(i);
    }
}
//Using Spring
class OccuranceOfString4{
    public static void main(String[] args) {
        int i = StringUtils.countMatches("Mahabharat", "a");
        System.out.println(i);

    }
}
//Using Regular Expression
class RegularExpression{
    public static void main(String[] args) {
        String s="%J23a@!&*vA";
        String s1 = s.replaceAll("[^a-zA-Z]", "");
        System.out.println(s1);
        String s2 = s.replaceAll("[^0-9]", "");
        System.out.println(s2);
        String s3 = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s3);
        String s4 = s.replaceAll("[!^a-zA-Z0-9]", "");
        System.out.println(s4);
    }
}