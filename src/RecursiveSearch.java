



//Part 3 step 3 O(n) runtime complexity
public class RecursiveSearch {
    public static int recursiveSearch(String item, String[] items, int index) {
        if (index >= items.length) {
            return -1; // Item not found
        } else if (items[index].equals(item)) {
            return index; // Item found
        } else {
            return recursiveSearch(item, items, index + 1); // Recursive call with incremented index
        }
    }
}
