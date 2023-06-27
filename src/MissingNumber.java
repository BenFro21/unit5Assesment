import java.util.Arrays;

public class MissingNumber {

    //step1 O(n)
    // example uses a Set i do not
    public static int missingNumber(int[] numbers, int maxNum){
        int expectedSum = (maxNum * (maxNum + 1)) / 2 ; // sum of the numbers from 1 to maxNum
        int actualSum = 0;

        for(int num : numbers){
            actualSum += num; // sum of the given numbers
        }

        if(expectedSum == actualSum){
            return  0; // no missing number
        }
        return expectedSum - actualSum;
    }


    //step2 O(1)
    //very similar to the solution
    public static int missingNumber2(int[] numbers, int maxNum){
        Arrays.sort(numbers); // sort the array in asec order

        for(int i=0; i < numbers.length; i++){
            if(numbers[i] != i + 1){
                return i + 1; // found the missing number
            }
        }
        return 0; // if there is no missing number
    }

    // step3 O(n) runtime and O(1) runspace
    // i did not use "stream" I will have to look into it
    public static int missingNumber3(int[] numbers, int maxNum){
        int expectedSum = (maxNum * (maxNum + 1)) /2; // Sum of numbers from 1 to maxNum
        int actualSum = 0;

        for(int num : numbers){
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
