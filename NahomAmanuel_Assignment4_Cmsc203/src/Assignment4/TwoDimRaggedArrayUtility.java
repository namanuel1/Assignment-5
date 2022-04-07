package Assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * @author naman
 *Thi progeam caluculates various of data that is obtained from a txt file
 */
public class TwoDimRaggedArrayUtility {
/**
 * @param data The array need to process average
 * @return average
 * This method brings in the average from the array
 */
public static double getAverage(double[][] data)
{
	double total = 0;
	int size = 0;
	for (int i = 0; i < data.length; i++)
	{
		for (int k = 0; k < data[i].length; k++)
		{
			total += data[i][k];
			size++;
		}
	}
	double average = (total/size);
	return average;
}

/**
 * @param data The array needed to get a particular row total
 * @param row This integer provides the row where they get the row total
 * @return total of row
 */
public static double getRowTotal(double[][] data, int row)
{
	double total = 0;
	for (int i = 0; i < data[row].length; i++)
	{
		total += data[row][i];
	}
	return total;
}
/**
 * @param data This is the array that is processed to get highest
 * @return highest value
 */
public static double getHighestInArray(double[][] data)
{
	double highestValue = data[0][0];
	for (int i = 0; i < data.length; i++)
	{
		for (int k = 0; k < data[i].length; k++)
		{
			if (data[i][k] > highestValue)
			{
				highestValue = data[i][k];
			}
		}
	}
	return highestValue;
}
/**
 * @param data This is the array that is needed for processing
 * @param row the row that needs processing to get highest in row 
 * @return highest value
 */
public static double getHighestInRow(double[][] data, int row)
{
	double highestValue = data[row][0];
	for (int i = 0; i < data[row].length; i++)
	{
		if (data[row][i] > highestValue)
		{
			highestValue = data[row][i];
		}
	}
	return highestValue;
}
/**
 * @param data This is the array that is needed for processing
 * @param col The column that needs processing to get highest in column
 * @return highest value
 */
public static double getHighestInColumn(double[][] data, int col)
{
	double highestValue = data[0][col];
	for (int i = 0; i < data.length; i++)
	{
		if (data[i].length <= col || col < 0) { continue; }
		if (data[i][col] > highestValue)
		{
			highestValue = data[i][col];
		}
	}
	return highestValue;
}
/**
 * @param data This is the array that is needed for processing
 * @param col The column number needed to get column total
 * @return column total
 */
public static double getColumnTotal(double[][] data, int col)
{
	double total = 0;
	for (int i = 0; i < data.length; i++)
	{
		if (data[i].length <= col || col < 0) { continue; }
		total += data[i][col];
	}
	return total;
}
/**
 * @param data This is the array that is needed for processing
 * @param col The column number needed to get highest column index number
 * @return column index number 
 */
public static int getHighestInColumnIndex(double[][] data, int col)
{
	double highestValue = data[0][col];
	int highestIndex = 0;
	for (int i = 0; i < data.length; i++)
	{
		if (data[i].length <= col || col < 0) { continue; }
		if(data[i][col] > highestValue)
		{
			highestValue = data[i][col];
			highestIndex = i;
		}
	}
	return highestIndex;
}
/**
 * @param data This is the array that is needed for processing
 * @param row The row number needed to get highest row index number 
 * @return
 */
public static int getHighestInRowIndex(double[][] data, int row)
{
	double highestValue = data[row][0];
	int highestIndex = 0;
	for (int i = 0; i < data[row].length; i++) 
	{
		if(data[row][i] > highestValue)
		{
			highestValue = data[row][i];
			highestIndex = i;
		}
		
	}
	return highestIndex;
}
/**
 * @param data This is the array that is needed for processing
 * @return lowest value in array
 */
public static double getLowestInArray(double[][] data)
{
	double lowestValue = data[0][0];
	for (int i = 0; i < data.length; i++)
	{
		for (int k = 0; k < data[i].length; k++)
		{
			if(data[i][k] < lowestValue)
			{
				lowestValue = data[i][k];
			}
		}
	}
	return lowestValue;
}

/**
 * @param data This is the array that is needed for processing
 * @param col The colum number needed to get lowest element in column
 * @return
 */
public static double getLowestInColumn(double[][] data, int col)
{
	double lowestValue = data[0][col];
	for (int i = 0; i < data.length; i++)
	{
		if (data[i].length <= col || col < 0) { continue; }
		if(data[i][col] < lowestValue)
		{
			lowestValue = data[i][col];
		}
	}
	return lowestValue;
}

/**
 * @param data This is the array that is needed for processing
 * @param row The row number needed to get index of the lowest number 
 * @return
 */
public static int getLowestInRowIndex(double[][] data, int row)
{
	double lowestValue = data[row][0];
	int lowestIndexValue = 0;
	for (int i = 0; i < data[row].length; i++)
	{
		if(data[row][i] < lowestValue)
		{
			lowestValue = data[row][i];
			lowestIndexValue = i;
		}
	}
	return lowestIndexValue;
}

/**
 * @param data This is the array that is needed for processing
 * @param col The column number needed to get index of lowest number in column
 * @return lowest index
 */
public static int getLowestInColumnIndex(double[][] data, int col)
{
	double lowestValue = data[0][col];
	int lowestIndex = 0;
	for (int i = 0; i < data.length; i++)
	{
		if (data[i].length <= col || col < 0) { continue; }
		if(data[i][col] < lowestValue)
		{
			lowestValue = data[i][col];
			lowestIndex = i;
		}
	}
	return lowestIndex;
}
/**
 * @param data The array needed to get total of array
 * @return total of the array
 */
public static double getTotal(double[][] data)
{
	double total = 0;
	for (int i = 0; i < data.length; i++)
	{
		for (int k = 0; k < data[i].length; k++)
		{
			total += data[i][k];
		}
	}
	return total;
}
/**
 * @param data This is the array that is needed for processing
 * @param row The row needed to process to get lowest in value
 * @return lowest value 
 */
public static double getLowestInRow (double[][] data, int row)
{
	double lowestValue = data[row][0];
	for (int i = 0; i < data[row].length; i++)
	{
		if (data[row][i] < lowestValue)
		{
			lowestValue = data[row][i];
		}
	}
	return lowestValue;
}
/**
 * @param f the file needed to read in the values
 * @return processed array
 * @throws FileNotFoundException
 */
static double[][] readFile(File f) throws FileNotFoundException {
	
	double a[][] = null;
	Scanner scanner1, scanner2;
	int rows = 0;
	int currentRow = 0;
	scanner1 = new Scanner(f);

	
	while (scanner1.hasNextLine()) { rows++; scanner1.nextLine(); }
	scanner1.close();

	
	a = new double[rows][];
	scanner2 = new Scanner(f);


	while (scanner2.hasNextLine()) {
	
		String line = scanner2.nextLine();
		String columns[] = line.trim().split(" ");
		a[currentRow] = new double[columns.length];

	
		for (int i = 0; i < columns.length; i++) {
			a[currentRow][i] = Double.parseDouble(columns[i]);
		}
		currentRow++;
	}


	scanner2.close();

	return a;
}

/**
 * @param a The array needed to translate into external files
 * @param f the file to translate into
 * @throws IOException
 */
static void writeToFile(double[][] a, File f) throws IOException {
	
	FileWriter file = new FileWriter(f);


	for (int r = 0; r < a.length; r++) {
		for (int c = 0; c < a[r].length; c++) {
			file.write(a[r][c] + " ");
		}
		file.write("\n");
	}


	file.close();
}


}
