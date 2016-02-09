////////////////////////////////////////////////////////////////////
/////  DefGen												   /////
/////  For use in the 2016 FRC game: FIRST Stronghold		   /////
/////  Coded by Stew Esho of team 4940: KnightVision Robotics  ///// 
/////  github.com/KnightVision4940							   /////
////////////////////////////////////////////////////////////////////
package frc4940.robots.s2016.DefGen;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		///////////////////////
		//  INITIALIZATIONS  //
		///////////////////////
		Random rng = new Random();		//allows for generation of random numbers
		rng.setSeed(System.nanoTime()); //seeds the RNG
		int[] defOrder = new int[4];	//Stores the order of the categories
		for (int i = 0; i < defOrder.length; i++)
			defOrder[i] = i + 1;
		
		//Shuffles the order
		for (int i = 3; i > 0; i--){
			//Generates a second index number to be swapped
			int j = rng.nextInt(i+1);
			//Swaps defOrder[j] and defOrder[i]
			int k = defOrder[j];
			defOrder[j] = defOrder[i];
			defOrder[i] = k;
		}
		
		//First position is ALWAYS a Low Bar
		System.out.println("Low Bar");
		
		for(int i = 0; i < defOrder.length; i++){
			switch(defOrder[i]){
			case 1:
				//Selects Category A Defense
				if (rng.nextBoolean())
					System.out.println("Portcullis");
				else
					System.out.println("Cheval de Frise");
				break;
			case 2:
				//Selects Category A Defense
				if (rng.nextBoolean())
					System.out.println("Moat");
				else
					System.out.println("Ramparts");
				break;
			case 3:
				//Selects Category A Defense
				if (rng.nextBoolean())
					System.out.println("Drawbridge");
				else
					System.out.println("Sally Port");
				break;
			case 4:
				//Selects Category A Defense
				if (rng.nextBoolean())
					System.out.println("Rock Wall");
				else
					System.out.println("Rough Terrain");
				break;
			}
		}
	}
}
