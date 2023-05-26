import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr1 = {8,7,2,3,5};
        bubble(arr1);
        System.out.println(Arrays.toString(arr1));

    }

    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            boolean flag=true;
            for (int j = 1; j < arr.length - i ; j++) {  //8 0 3 5
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j ];
                    //System.out.println("Temp is"+" " +temp);
                    arr[j] = arr[j-1];
                    //System.out.println("[j] is" + " "+ arr[j]);
                    arr[j-1] = temp;

                     System.out.println("[j-1] is" +" "+ arr[j-1]);
                     flag=false;
                }

            }
            System.out.println(Arrays.toString(arr));
            if(flag){
                break;
            }
        }

    }
}

