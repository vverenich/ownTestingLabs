package testing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {
	public static int binarySearchFunc(ArrayList<Integer> array, int x, int low, int high) {
		while(low<=high) {
			int mid = (low+high)/2;
			if(x==array.get(mid)) {
				return mid;
			}
			else if(x>array.get(mid)){
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		System.out.println("Enter elemnts of an array or \"exit\" to finish entering: ");
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()) {
			String buffer = in.nextLine();
            if(buffer.equals("exit")) {
            	if(array.size()>1) {
            		break;
            	}
            	continue;
            }
            array.add(Integer.parseInt(buffer));
		}
		Collections.sort(array);
		
		System.out.println("Enter key: ");
		int key;
		key = in.nextInt();
		int J = binarySearchFunc(array, key,0, array.size()-1);
		boolean Result = false;
		if(J!=-1) {
			Result = true;
		}
		
		System.out.println("Results: ");
		System.out.println("Result = " + Result + ", J = "+ J );

	}

}
