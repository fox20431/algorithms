import java.util.*;

public class HJ10 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        String str=in.next();
        HashSet<Character> hs=new HashSet<Character>();
        for(int i=0;i<str.length();i++)
            hs.add(str.charAt(i));
        System.out.println(hs.size());
    }
}
