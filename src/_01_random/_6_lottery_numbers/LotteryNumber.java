package _01_random._6_lottery_numbers;

import javax.swing.JOptionPane;

import java.util.Random;

public class LotteryNumber {
	public static void main(String[] args) {
		Random ran = new Random () ;
		int RandomNumber = ran.nextInt(6);
		int RandomNumber2 = ran.nextInt(6);
		int RandomNumber3 = ran.nextInt(6);
		int RandomNumber4 = ran.nextInt(6);
		int RandomNumber5 = ran.nextInt(6);
		int RandomNumber6 = ran.nextInt(6);
		JOptionPane.showMessageDialog(null, RandomNumber + RandomNuber2 + RandomNumber3 + RandomNumber5 + RandomNumber6, "Lottery Ticket", 1);
		
	}
}
