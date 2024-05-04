import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] people = new int[]{3,5,3,4};
        int limit = 5;
        System.out.println(numRescueBoats(people,limit));
    }

    public static int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        Arrays.sort(people);
        int i=0,j=people.length-1;
        while(i<=j){
            if((people[j]+people[i])<=limit){
                i++;
            }
            j--;
            boats++;
        }
        return boats;
    }
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

