package Chapter1Fundamentals.BasicProgrammingModel;

public class Ex11 {
	
	public static void main(String[] args) {
		boolean [] [] myArray = new boolean [] [] { {true,false,false} , 
			{false,true,true}};
		for(int i = 0; i<myArray.length; i++)
			for(int j = 0 ; j<myArray[i].length; j++) 
				if(myArray[i][j]) System.out.print("*");
				else System.out.print(" ");
	}}
