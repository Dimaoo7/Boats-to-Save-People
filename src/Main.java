import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] score = new int[]{5,4,3,2,1};

        System.out.println(Arrays.toString(findRelativeRanks(score)));

    }


    public static String[] findRelativeRanks(int[] score) {


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

