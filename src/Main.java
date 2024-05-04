
public class Main {

    public static void main(String[] args) {
        int[] people = new int[]{3,5,3,4};
        int limit = 5;
        int boats = 0;

    }
    public static int[] sortEd(int[] people) {
        boolean isSorted;
        do {
            isSorted = true;
            int temp;
            for (int i = 1; i < people.length; i++) {
                if (people[i -1] > people[i]) {
                    temp = people[i - 1];
                    people[i - 1] = people[i];
                    people[i] = temp;
                    isSorted = false;
                }

            }

        }
        while (isSorted);

        return people;
    }
}



