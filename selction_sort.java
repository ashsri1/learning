import java.util.Arrays;

public class selction_sort {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};  //{1,2,4,3,5}
        selection(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]<arr[min]){
                    min=j;
                    System.out.println(min);
                }

            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
