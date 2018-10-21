import java.util.Arrays;

public class Exercices {
	public static void main(String [] args)
	{
		// first exercices //
		/*int[] arrays = new int[] {5, 3, 3, 5};
	
		for(int i=0; i<arrays.length; i++)
		{
			System.out.println(arrays[i]);
			
		}
		System.out.println(avarage(arrays)); */
	
			
		// second exercices //
		/*String[] arrays = new String[] {"Hello", "World"};
		String element = "Hello";
		System.out.println(containsElement(arrays, element));*/
		
		// third exercices //
		/*int[] arrays = new int[] {0, 1, 2, 3, 4};
		int element = 2;
		System.out.println(containsElement(arrays, element)); */
		
		// fourth exercices //
		String[] first = new String[] {"Hello", "Goodmorning"};
		String[] second = new String[] {"Hello", "Goodmorning", "Buona note"};
		System.out.println(Arrays.toString(findCommonElements(first, second)));
		
	}
	
	// Calculate the avarage of numbers in array //
	public static double avarage(int[] arrays)
	{
		double resultat = 0;
		for(int i=0; i<arrays.length; i++)
		{
			resultat = resultat + arrays[i];
		}
		return resultat/(arrays.length);
		
	}
	
	// Find a element in the array //
	public static boolean containsElement(String[] arrays, String element)
	{
		for(int i=0; i<arrays.length; i++)
		{
			if(arrays[i] == element)
			{
				return true;
			}
		}
		return false;
		
	}
	
	// Return position of a number in array //
	public static int containsElement(int[] arrays, int element)
	{
		int pos;
		
		for(int i=0; i<arrays.length; i++)
		{
			if(arrays[i] == element)
			{
				pos = i;
				return pos;
			}
			
		}
		return -1; 
	}
	
	// Find common elements of two arrays //
	public static String[] findCommonElements(String[] first, String[] second)
	{
		String[] result = new String [] {" "};
		
		for(int i=0; i<first.length; i++)
		{
			for(int j=0; j<second.length; j++)
			{
				if(first[i] == second[i])
				{
					result[i] = second[i];
					
				}
			}
		}
		
		/*if(first.length >= second.length)
		{
			for(int i=0; i<first.length; i++)
			{
				if(first[i] == second[i])
				{
					result[i] = first[i];
				}
			}
		}
		else
		{
			for(int j=0; j<second.length; j++)
			{
				if(second[j] == first[j])
				{
					result[j] = second[j];
				}
			}
		}*/
		
		return result;
		
	}

}
