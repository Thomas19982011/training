package training;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int x,y,temp;
		Scanner Input=new Scanner(System.in);
		System.out.println("Enter Swap Numbers here");
		x=Input.nextInt();//get the input o x from console
		y=Input.nextInt();//get the input o y from console
		temp=x;///assign the x value n temp
		x=y;//here assign value of y value to x
		y=temp;///here assign temp value to y
		System.out.println("after swapping " +x+y);



	}

}
