
/* Edward Rodriguez
 * Date: 7/26/21
 * 
 * Weekly Coding Challenge:
 * Problem 1: Find the Contiguous Subarray 
 * with Sum to a Given Value in an array.
 * Given an array of positive integer and given value X, 
 * find Contiguous sub array whose sum is equal to X. 
 * 
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class ContigousSubArraySum {

	public static void main(String[] args) {
		Integer arr[] = { 14, 12, 70, 15, 99, 65, 21, 90 };
		int x = 97;

		Integer[] subArray = findSubArray(arr, x);
		for (int i = 0; i < subArray.length; i++) {
			System.out.print(subArray[i] + " ");
		}
	}

	public static int sum(int previousSum, int newElement) {
		return previousSum + newElement;
	}

	public static Integer[] findSubArray(Integer[] arr, int x) {
		int tempSum = 0;
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (tempSum == x) {
				return list.toArray(Integer[]::new);
			} else if (tempSum > x) {
				tempSum -= list.get(0);
				list.remove(0); // remove left bound
				i--; // iterate again w/out old left bound
			} else {
				list.add(arr[i]); // add new right bound
				tempSum = sum(tempSum, arr[i]);
			}
		}
		return list.toArray(Integer[]::new);
	}

}