import java.util.Arrays;
import java.util.HashMap;

public class addstr {
    public static void main(String[] args) {
        String [] str1 = {"ab","de","cd","a","eg"};
        String target1= "abcd";

        System.out.println(Arrays.toString(addstr.indecis(str1, target1)));

    }

    public static int[] indecis(String [] str, String target) {
        HashMap<String,Integer> index=new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            String str1 = str[i];
            index.put(str1, i);
        }

        for (int j = 0; j < str.length; j++) {
            String str2=str[j];
            String temp=target.substring(str2.length());
            if(index.containsKey(temp)){
                int tar=index.get(temp);
                if( target.startsWith(str2)){
                    return new int[]{j,tar};
                }



            }
        }


        return new int[0];
    }
}

