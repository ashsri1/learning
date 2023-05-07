public class strpermutation {
    public static void permutation(String str,String ans){
        if(str.length()==0){
            System.out.print(ans +" ");
            return;
        }
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            String str2=str.substring(0, i) +
                    str.substring(i + 1);
            permutation(str2,ans+ch);

        }
    }

    public static void main(String[] args) {
        String s="abc";
        permutation(s," ");
    }
}
