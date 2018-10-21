import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class Listes {
	public static void main(String [] args)
	{
		
		// First exercices //
		/*List <String> first = new LinkedList<>();
		List <String> second = new LinkedList<>();
		
		first = Arrays.asList(new String[] {"Toto" , "Titi"});
		second = Arrays.asList(new String[] {"Toto", "Titi"});
		
		System.out.println(deepEquals(first, second)); */
		
		// Second exercice //
		List <Integer> first = new LinkedList<>();
		List <Integer> second = new LinkedList<>();
		
		first = Arrays.asList(new Integer[] {1 , 15});
		second = Arrays.asList(new Integer[] {2, 17 , 19});
		
		System.out.println(joinLists(first, second));
		
	}
	public static boolean deepEquals(List<String> first, List<String> second)
	{
		if(first.size() != second.size())
		{
			return false;
		}
		
		for(int i=0; i < first.size(); i++)
		{
			if(!first.get(i).equals(second.get(i)))
			{
				return false;
			}
		}
		return true;
		
	}
	
	public static List<Integer> joinLists(List<Integer> first, List<Integer> second)
	{
		LinkedList <Integer> join = new LinkedList<>();
		int maxSize = Math.max(first.size(), second.size());
		
		for(int i=0; i < maxSize; i++)
		{
			if(i < first.size())
			{
				join.add(first.get(i));
			}
			if(i < second.size())
			{
				join.add(second.get(i));
			}
			
		}
	
		
		return join;
		
	}

}
