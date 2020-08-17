package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String Age;
		Age = JOptionPane.showInputDialog("Enter your age!");
		int AgeInt;
		AgeInt = Integer.parseInt(Age);
		if (AgeInt < 18) {
			JOptionPane.showMessageDialog(null, "NOBODY CARES ABOUT WHAT YOU THINK");
		}
		else {
			JOptionPane.showInputDialog("Who should the next president be?");
		}
		}
	}


