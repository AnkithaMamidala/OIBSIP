package GuessingNumber;

import javax.swing.*;

public class guessingNumber {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int computerNumber=(int)(Math.random()*100+1);
			int userAnswer=0;
			System.out.println("the correct guessing number would be: "+computerNumber);
			int count=1;
			while(userAnswer!=computerNumber) {
				String response=JOptionPane.showInputDialog(null,"enter a guess between 1 and 100","guessing game",3);
				userAnswer=Integer.parseInt(response);
				JOptionPane.showMessageDialog(null," ",determineGuess(userAnswer,computerNumber,count), count);
			}
	}
	public static String determineGuess(int userAnswer,int computerNumber,int count) {
		if(userAnswer<=0 || userAnswer>100) 
			return "Your Guess is Invalid";
		else if(userAnswer == computerNumber)
			return "correct guess! \n Total guesses: "+count;
		else if(userAnswer > computerNumber)
			return "your guess is too high \n try number: "+count;
		
		else if(userAnswer < computerNumber)	
			return "your is too low ,try again \n try number: "+count;
		else
			return "your guess is incorrect try again \n try number: "+count;
		
		
			
			
		
	}
	

}
