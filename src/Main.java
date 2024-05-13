import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;

        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));


    }


    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        return null;
    }

//    public static int numRescueBoats(int[] people, int limit) {
//        int boats = 0;
//        Arrays.sort(people);
//        int i=0,j=people.length-1;
//        while(i<=j){
//            if((people[j]+people[i])<=limit){
//                i++;
//            }
//            j--;
//            boats++;
//        }
//        return boats;
//    }
//    public static int[] sortEd(int[] people) {
//        boolean isSorted;
//        do {
//            isSorted = true;
//            int temp;
//            for (int i = 1; i < people.length; i++) {
//                if (people[i -1] > people[i]) {
//                    temp = people[i - 1];
//                    people[i - 1] = people[i];
//                    people[i] = temp;
//                    isSorted = false;
//                }
//
//            }
//
//        }
//        while (isSorted);
//
//        return people;
//    }
}

//

