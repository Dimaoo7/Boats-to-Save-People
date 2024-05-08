import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] score = new int[]{10,3,8,9,4};

        System.out.println(Arrays.toString(findRelativeRanks(score)));

    }

        public static int findMax(int[] score) {
            int maxScore = 0;
            for (int s : score) {
                if (s > maxScore) {
                    maxScore = s;
                }
            }
            return maxScore;
        }

        public static String[] findRelativeRanks(int[] score) {
            int N = score.length;


            int M = findMax(score);
            int[] scoreToIndex = new int[M + 1];
            for (int i = 0; i < N; i++) {
                scoreToIndex[score[i]] = i + 1;
            }

            final String[] MEDALS = {"Gold Medal", "Silver Medal", "Bronze Medal"};

            String[] rank = new String[N];
            int place = 1;
            for (int i = M; i >= 0; i--) {
                if (scoreToIndex[i] != 0) {
                    int originalIndex = scoreToIndex[i] - 1;
                    if (place < 4) {
                        rank[originalIndex] = MEDALS[place - 1];
                    } else {
                        rank[originalIndex] = String.valueOf(place);
                    }
                    place++;
                }
            }
            return rank;
        }
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
//}

