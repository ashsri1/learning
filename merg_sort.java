import java.util.Arrays;

public class merg_sort {
    public static void main(String[] args) {
        int[] arr={68,59,23,9,71,41};
        arr=merge(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void merge(int [] arr ,int start,int end){
        if(end-start==1){
            return ;
        }
        int mid=(start+end)/2;
        merge(arr,start,mid));
        merge(arr,mid,end);

        return mergesort(left,right);
    }

    private static int[] mergesort(int[] first, int[] second) {
        int mix[]=new int[first.length+second.length];

        int i=0;
        int j=0;
        int k=0;

        while (i< first.length && j< second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;

            }
            else {
                mix[k]=second[j];
                j++;

            }
            k++;
        }
        while (i< first.length){
            mix[k]=first[i];
            i++;
            k++;


        }
        while (j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
