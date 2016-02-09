/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author molayodecker
 */
public class Driver3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int arraySize = 0;
       int count = 0;
       int arrayAdd = 0;
     Scanner stdin = new Scanner(System.in);
     System.out.print("Enter number of test scores:");
     arraySize = stdin.nextInt();
     int[] arrayTestValues = new int[arraySize];
        do {            
            System.out.print("Enter test score " +(count+1)+":");
            arrayAdd = stdin.nextInt();
            arrayTestValues[count] = arrayAdd;
            count++;
        } while (count < arrayTestValues.length);
        
        TestScores1 testScores = new TestScores1(arrayTestValues);
        try {
            System.out.println(testScores.getScore());
        } catch (InvalidTestScore e) {
            System.out.print("Invalid test score.");
        }
         
    }
      
}



class TestScores1{
    
    private int[] testScore;
    
    public TestScores1(int[] testScore)
    		
    {
         this.testScore = testScore;
    }
    
    public void setScore(int[] testScore){
        this.testScore = testScore;
    }
    
    public boolean getBoolean(){
    	boolean mybool = false;
        for (int i : testScore) {
		  if(i < 0 || i > 100 ){
			 mybool = true;
			}		
		}
        return mybool;
    }
    
    public double getScore() throws InvalidTestScore{
        double Average = 0.0;
        double sum = 0.0;
        for (int i = 0; i < testScore.length; i++) {
         sum +=testScore[i];
         Average = sum/testScore.length;
        }
        if(getBoolean() == true)
        throw new InvalidTestScore("Invalid test score.");
        else  
        return Average;
   }
}


class InvalidTestScore extends Exception  {

    public InvalidTestScore(String message) {
    	super(message);
    }
    
}



