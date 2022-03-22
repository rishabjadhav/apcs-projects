import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SudokuRunner {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Which puzzle would you like to do?");
		int choice = console.nextInt();
		Sudoku puzzle = new Sudoku(library(choice));
		System.out.println(puzzle);
		while (puzzle.isSolved() == false) {
			puzzle.solve();
		}
		System.out.println(puzzle);
		
		
	}
	
	public static int[][] library (int a) {
		if (a == 1) {
			
			int[][] puzzle1 =  {{0,0,4,0,6,9,0,7,0},
								{0,8,9,3,0,0,0,0,6},
								{0,2,0,0,0,0,3,0,0},
								{0,1,0,0,9,0,4,5,7},
								{5,0,0,7,2,8,0,0,1},
								{3,9,7,0,5,0,0,8,0},
								{0,0,1,0,0,0,0,9,0},
								{8,0,0,0,0,1,7,6,0},
								{0,7,0,4,8,0,2,0,0}}; 
			
			return puzzle1;
			
		}
		
		if (a == 2) {
			
			int[][] puzzle2 =  {{0,0,0,0,0,0,8,0,1},
								{0,0,6,0,9,2,3,0,0},
								{0,0,9,1,8,7,0,6,0},
								{0,5,1,0,0,3,0,7,6},
								{0,6,4,0,0,0,9,5,0},
								{9,2,0,7,0,0,4,1,0},
								{0,9,0,6,1,4,7,0,0},
								{0,0,5,2,7,9,1,0,0},
								{4,0,7,0,0,0,0,0,0}}; 

			return puzzle2;
			
		}
		
		
		if (a == 3) {
			int [][] puzzle3 = {{0,0,4,0,0,9,0,7,6},
								{8,1,0,6,3,5,0,2,9},
								{9,6,2,1,0,0,0,0,0},
								{0,0,0,0,7,0,0,1,0},
								{6,0,0,0,0,0,0,0,8},
								{0,2,0,0,8,0,0,0,0},
								{0,0,0,0,0,8,3,4,7},
								{1,7,0,4,6,3,0,5,2},
								{4,5,0,7,0,0,8,0,0}};
			return puzzle3;
		}
		
		if (a == 4) {
			int [][] puzzle4 = {
					{0,7,9,0,0,3,6,0,0},
					{8,0,5,6,2,7,1,0,0},
					{6,4,0,9,5,0,0,0,0},
					{0,2,8,7,0,0,0,0,0},
					{4,0,0,2,0,5,0,0,7},
					{0,0,0,0,0,4,2,9,0},
					{0,0,0,0,8,6,0,2,1},
					{0,0,6,1,7,2,9,0,4},
					{0,0,2,3,0,0,5,8,0}
					};
			return puzzle4;

		}
		
		if (a == 5) {
			int [][] puzzle5 = {{0, 3, 0, 0, 8, 6, 5, 2, 0},
								{8, 1, 0, 0, 0, 0, 7, 0, 0},
								{0, 2, 5, 0, 7, 0, 0, 0, 8},
								{0, 0, 7, 0, 1, 0, 0, 5, 3},
								{0, 0, 9, 7, 0, 3, 4, 0, 0},
								{4, 8, 0, 0, 6, 0, 2, 0, 0},
								{6, 0, 0, 0, 4, 0, 3, 9, 0},
								{0, 0, 8, 0, 0, 0, 0, 4, 2},
								{0, 4, 2, 9, 5, 0, 0, 6, 0}};
			return puzzle5;

		}
		
		
		else {
			return null;
		}
	}


}
