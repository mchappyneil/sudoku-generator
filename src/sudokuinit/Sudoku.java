package sudokuinit;
import java.lang.*;

public class Sudoku {
	int[] matrix[]; 
	int colrow; // number of columns and rows
	int rootCR; // square root of colrow
	int K; // number of "unfilled" squares
	
	Sudoku(int colrow, int unfill) {
		this.colrow = colrow;
		this.K = unfill;
		
		Double rcrd = Math.sqrt(colrow);
		this.rootCR = rcrd.intValue();
		
		matrix = new int[colrow][colrow];		
	}
	
	public void fillVals() {
		
		// fill diagonal of rootcolrow x rootcolrow matrix
		fillDiag();
		
		fillRemaining(0, rootCR);
		
		// remove K digits randomly
		removeDigits();
	}
	
	void fillDiag() {
		for (int i = 0; i < colrow; i += rootCR) {
			fill(i, i);
		}
	}
	
	// returns false if a given block (3x3 matrix) contains E
	boolean unused(int rowStart, int colStart, int E) {
		for (int i = 0; i < rootCR; i++) {
			for (int j=0; j < rootCR; j++) {
				if (matrix[rowStart+i][colStart+j]==E) {
					return false;
				}
			}
		}
		return true;
	}
	
	// fill in a 3x3 matrix
	void fill(int row, int col) {
		int element;
		for (int i = 0; i < rootCR; i++) {
			for (int j = 0; j < rootCR; j++) {
				do {
					element = rng(colrow);
				}
				while (!unused(row, col, element));
				
				matrix[row+i][col+j] = element;
			}
		}
	}
	
	int rng(int val) {
		return (int) Math.floor((Math.random()*val+1));
	}
	
	boolean checkValid(int i, int j, int element) {
		return (unusedRow(i, element), &&
				unusedCol(j, element), &&
				unusedBlock(i-i%rootCR, j-j%rootCR, element));
	}
	
	boolean unusedRow(int)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}