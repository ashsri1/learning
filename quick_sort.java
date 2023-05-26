import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {

        int[]arr={60,17,6,51,38,86};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quick(int[] arr,int low,int high){
        if(low >= high){
            return;
        }
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];

        while (s<=e){
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        quick(arr,low,e);
        quick(arr,s,high);
    }
}
