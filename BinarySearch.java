package BinarySearch;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinarySerach {
	public static void main(String[] args) {
		List<Integer> l= Arrays.asList(1,2,3,4,5);
		Scanner s=new Scanner(System.in); 
		String searchWord = s.nextLine();
		int searchValue = Integer.parseInt(searchWord);
		Boolean matchNotFound=true;
		int low=0;
		int high = l.size();
		while(matchNotFound) {
			if(high <= low) {
				break;
			}
			int mid = low + (high-low)/2;
			if(l.get(mid) > searchValue) {
				high=mid-1;
			}else if(l.get(mid) < searchValue){
				low=mid+1;
			}else {
				matchNotFound=false;
			}

		}
		if(matchNotFound) {
			System.out.println("not found");
		}else {
			System.out.println("found");
		}
	}
}
