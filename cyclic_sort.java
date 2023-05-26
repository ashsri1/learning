import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int [] arr={20,15,31,2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void cyclic(int[] arr){
        int i=0;
        while (i<arr.length){
            int correctind= arr[i]-1;
            if(arr[i]!=arr[correctind]){
                swap(arr,i,correctind);

            }else {
                i++;
            }
        }

    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;


    }
}
