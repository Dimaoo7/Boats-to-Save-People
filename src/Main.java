import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums1 = new int[]{0};
        int m = 0;
        int[] nums2 = new int[]{1};
        int n = 1;

        merge(nums1, m, nums2, n);

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
                int i = m - 1;
                int j = n - 1;
                int k = m + n - 1;

                while (i >= 0 && j >= 0) {
                    if (nums1[i] > nums2[j]) {
                        nums1[k] = nums1[i];
                        i--;
                    } else {
                        nums1[k] = nums2[j];
                        j--;
                    }
                    k--;
                }

                while (i >= 0) {
                    nums1[k] = nums1[i];
                    i--;
                    k--;
                }

                while (j >= 0) {
                    nums1[k] = nums2[j];
                    j--;
                    k--;
                }
            }

//    public static int[] withoutZeros(int[] nums, int length) {
//        int[] res = new int[length];
//        if (nums.length != length && length != 0) {
//            System.arraycopy(nums, 0, res, 0, length);
//            return res;
//        }
//        return nums;
//    }
//         public static int findMax(int[] score) {
//             int maxScore = 0;
//             for (int s : score) {
//                 if (s > maxScore) {
//                     maxScore = s;
//                 }
//             }
//             return maxScore;
//         }

//         public static String[] findRelativeRanks(int[] score) {
//             int N = score.length;


//             int M = findMax(score);
//             int[] scoreToIndex = new int[M + 1];
//             for (int i = 0; i < N; i++) {
//                 scoreToIndex[score[i]] = i + 1;
//             }

//             final String[] MEDALS = {"Gold Medal", "Silver Medal", "Bronze Medal"};

//             String[] rank = new String[N];
//             int place = 1;
//             for (int i = M; i >= 0; i--) {
//                 if (scoreToIndex[i] != 0) {
//                     int originalIndex = scoreToIndex[i] - 1;
//                     if (place < 4) {
//                         rank[originalIndex] = MEDALS[place - 1];
//                     } else {
//                         rank[originalIndex] = String.valueOf(place);
//                     }
//                     place++;
//                 }
//             }
//             return rank;
//         }
//     }


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

