public class firstpro {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int target = 2;
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(i);
                if (arr[i] == target) {
                    System.out.println("found");
                    found = true;
                    break;
                }

            }
            if (!found) {
                System.out.println("not found");
            }
        }
    }



