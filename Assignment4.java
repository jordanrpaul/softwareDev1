public class Assignment4 {
    public static void main(String[] args) {

        //given array
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};

        System.out.println("Duplicate Numbers:");

        //go through each number in the array
        for (int i = 0; i < myArray.length; i++) {

            int count = 0;
            boolean duplicateAlreadyFound = false;

            //check the numbers before this one to see if I already counted it
            for (int j = 0; j < i; j++) {

                if (myArray[i] == myArray[j]) {
                    duplicateAlreadyFound = true;
                }
            }

            //if I havent counted this number yet, count how many times it appears
            if (duplicateAlreadyFound == false) {

                for (int j = 0; j < myArray.length; j++) {

                    if (myArray[i] == myArray[j]) {
                        count++;
                    }
                }

                //only print numbers that show up more than once
                if (count > 1) {
                    System.out.println(myArray[i] + " appears " + count + " times");
                }
            }
        }

        //What I learned:
        //I learned how to use loops to go through an array and compare the numbers.
        //I also learned how to count duplicates without using an array utility.
    }
}