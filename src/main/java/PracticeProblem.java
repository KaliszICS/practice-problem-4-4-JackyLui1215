/**
	* File: Lesson 4.4 - Boolean functions with loops
	* Author: Jacky Lui
	* Date Last Modified: April 13, 2023
	*/
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean hasCapital(String word) {
			if (word.toLowerCase() == word) {
				return false;
			}
        return true;
		}

	public static boolean isPrime(int number) {
		if (number == 1 ) {
				return false;
			}
		for (int i = 2; i < number; i++) {
			if (number % i == 0){
				return false;
			}
		}
		return true;
	}


}
