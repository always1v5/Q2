package quiz2;

import java.util.Scanner;

public class quiz2 {
	Scanner Tuition = new Scanner(System.in);
	Scanner rate = new Scanner(System.in);
	int[] aList = new int[8];
	double newTuition = Tuition.nextFloat();
	double newrate = rate.nextFloat();
	double sumTuition = 0;{

	for (int x:aList){
		if (x/2 == 0){
			sumTuition = sumTuition + newTuition;
			newTuition = newTuition + newTuition * newrate;
		}
		
	System.out.println("Your total tuition will be" + sumTuition);
	}
}
}
