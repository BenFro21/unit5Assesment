// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //step1 O(n)
//        int[] numbers = {2, 1, 4, 3, 6, 5, 7, 10, 9};
//        int maxNum = 10;
//        int result = MissingNumber.missingNumber(numbers, maxNum);
//        System.out.println(result); // Output: 8

        //step2 O(1)
//        int[] numbers = {2, 1, 4, 3, 6, 5, 7, 10, 9};
//        int maxNum = 10;
//        int result = MissingNumber.missingNumber2(numbers, maxNum);
//        System.out.println(result); // Output: 8

        //step3  O(n) runtime and O(1) runspace
//        int[] numbers = {2, 1, 4, 3, 6, 5, 7, 10, 9};
//        int maxNum = 10;
//        int result = MissingNumber.missingNumber3(numbers, maxNum);
//        System.out.println(result); // Output: 8


        //Part 2 step 1
//        String test1 = "((()))";  // Balanced parentheses
//        String test2 = "((())";   // Unbalanced parentheses
//
//        System.out.println("Test 1: " + Balanced.isBalanced(test1));  // Output: true
//        System.out.println("Test 2: " + Balanced.isBalanced(test2));  // Output: false

        // part 2 step 2
//        String test1 = "({[]})";       // Balanced brackets
//        String test2 = "({[})";        // Unbalanced brackets
//        String test3 = "{[}]";         // Unbalanced brackets
//        String test4 = "({[]}){}[]<>"; // Balanced brackets
//
//        System.out.println("Test 1: " + Balanced.isBalanced2(test1));  // Output: true
//        System.out.println("Test 2: " + Balanced.isBalanced2(test2));  // Output: false
//        System.out.println("Test 3: " + Balanced.isBalanced2(test3));  // Output: false
//        System.out.println("Test 4: " + Balanced.isBalanced2(test4));  // Output: true

//        Part 2 step 3
            // I could not figure this one out
//
//        // Part 3 step 1 I keep getting 7 -> 7 -> 7 -> null and am not sure why
//        // Create the first linked list: 3 -> 2 -> 1
//        ListNode l1 = new ListNode(3);
//        l1.next = new ListNode(2);
//        l1.next.next = new ListNode(1);
//
//        // Create the second linked list: 4 -> 5 -> 6
//        ListNode l2 = new ListNode(4);
//        l2.next = new ListNode(5);
//        l2.next.next = new ListNode(6);
//
//        LinkedListSum solution = new LinkedListSum();
//        ListNode result = solution.addTwoNumbers(l1, l2);
//
//        // Print the result: 9 -> 7 -> 5
//        while (result != null) {
//            System.out.print(result.val + " -> ");
//            result = result.next;
//        }
//        System.out.println("null");

        //Part 3 step 2
//
//        Insertion Sort:
//                Best Case: The input array is already sorted. In this case, Insertion Sort has a runtime efficiency of O(n), where n is the number of elements in the array.
//
//                Worst Case: The input array is sorted in reverse order. In this case, Insertion Sort has a runtime efficiency of O(n^2).
//
//                Average Case: Insertion Sort has an average runtime efficiency of O(n^2). It performs well for small-sized arrays or partially sorted arrays.
//
//       Quick Sort:
//                Best Case: The pivot chosen is the median element, and it divides the array into two equal-sized subarrays. In this case, Quick Sort has a runtime efficiency of O(n log n).
//
//                Worst Case: The input array is already sorted or sorted in reverse order, and the pivot chosen is either the smallest or largest element. In this case, Quick Sort has a worst-case runtime efficiency of O(n^2).
//
//                Average Case: Quick Sort has an average runtime efficiency of O(n log n). It performs well on average and is widely used in practice.
//
//        Merge Sort:
//                Best Case: There is no specific best-case scenario for Merge Sort. It always performs with a runtime efficiency of O(n log n), regardless of the input order or array content.
//
//                Worst Case: Merge Sort has a worst-case runtime efficiency of O(n log n). It performs consistently well even for large-sized arrays and is not affected by the input order.
//
//                Average Case: Merge Sort has an average runtime efficiency of O(n log n). It consistently maintains this efficiency, making it a reliable choice for sorting.

        //Part 3 step 3 O(n) runtime complexity

        String[] items = {"hey", "there", "you"};
        String itemToSearch = "hey";
        int index = RecursiveSearch.recursiveSearch(itemToSearch, items, 0);
        System.out.println("Index of '" + itemToSearch + "': " + index);

        String itemNotInList = "porcupine";
        int indexNotInList = RecursiveSearch.recursiveSearch(itemNotInList, items, 0);
        System.out.println("Index of '" + itemNotInList + "': " + indexNotInList);
    }
}