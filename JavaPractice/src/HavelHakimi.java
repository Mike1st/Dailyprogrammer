//Challenge #378

import java.util.*;

public class HavelHakimi {

	//TestMethod
//	public static void main(String[] args) {
//		int[] test = {4,6,1,0,0,9,2,0,3,6};
//		int[] newTest = warmup1(test);
//		newTest = warmup2(newTest);
//		for(int i = 0; i < newTest.length; i++) {
//			System.out.print(newTest[i]);
//		}
//		
//		System.out.println(warmup3(0, newTest));
//		newTest = warmup4(6,newTest);
//		
//		for(int i = 0; i < newTest.length; i++) {
//			System.out.print(newTest[i]);
//		}
//	}
	
	public static void main(String[] args) {
		int[] answer = {5, 3, 0, 2, 6, 2, 0, 7, 2, 5};
		System.out.println(hh(answer));
		ArrayList<Integer> temp = new ArrayList<Integer>();
		System.out.println(temp.size());
	}
	
	//This is the actual Havel-Hakimi Algorithm Method
	public static boolean hh(int[] answer) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int n;
		for(int i = 0; i < answer.length; i++) {
			temp.add(answer[i]);
		}
		for(int j = 0; j < temp.size(); j++) {
			if(temp.get(j) == 0)
				temp.remove(j);
		}
		
		if(temp.size() == 0) {
			return true;
		}
			Collections.sort(temp, Collections.reverseOrder());
			n = temp.get(0);
			temp.remove(0);
			System.out.print(n + " " + temp.size() + " ");
			if(n > temp.size()) {
				return false;
			}
			for(int k = 0; k < n; k++) {
				temp.set(k, temp.get(k) - 1);
			}
			int[] newAnswer = new int[temp.size()];;
			for(int l = 0; l < temp.size(); l++) {
				newAnswer[l] = temp.get(l);
			}
		return hh(newAnswer);
		
	}
	
	
	//This eliminates all zeros in an array
	public static int[] warmup1(int[] answer){
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] != 0)
				temp.add(answer[i]);
		}
		int[] newSequence = new int[temp.size()];
		for(int i = 0; i < temp.size(); i++) {
			newSequence[i] = temp.get(i);
		}
		return newSequence;
	}
	
	
	//This reorders the array in a descending sequence
	public static int[] warmup2(int[] answer) {
		for(int i = 0; i < answer.length; i++) {
			for(int j = 0; j < answer.length; j++) {
				if(answer[i] < answer[j]) {
				int temp = 0;
				temp = answer[i];
				answer[i] = answer[j];
				answer[j] = temp;
				}
			}
		}
		return answer;
	}
	
	//This compares the length of array to a number
	public static boolean warmup3(int length, int[] answer) {
		if(length > answer.length)
			return true;
		else
			return false;
	}
	
	//This subtracts 1 from each of the first N answers in the sequence
	public static int[] warmup4(int amount, int[] answer) {
		for(int i = 0; i < amount; i++) {
			answer[i] = answer[i] - 1;
		}
		return answer;
	}
}
