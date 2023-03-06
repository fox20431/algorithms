import java.util.Scanner;
import java.util.Stack;

public class HJ70 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            sc.nextLine();
        }
        int count = 0;
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        Stack<Integer> s = new Stack<>();
        for(int j=0;j<chars.length;j++){
            if(chars[j]=='('){
                continue;
            }else if(chars[j]==')'){
                int x = s.pop();
                int y = s.pop();
                int z = s.pop();
                int m = s.pop();
                count += x*y*m;
                s.push(m);
                s.push(x);
            }else{
                s.push(arr[chars[j]-65][0]);
                s.push(arr[chars[j]-65][1]);
            }
        }
        System.out.println(count);
    }
}
