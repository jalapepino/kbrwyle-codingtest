import java.util.*;

public class JavaCollections {

	public static void main(String[] args) {
		
		//DEFINE THE FOLLOWING 2 COLLECTIONS
		
		//defines and shuffles "list1", containing integers 1 through 10 in randomised order
		List<Integer> list1 = new ArrayList<>();
		for (int i=1; i<=10; i++)
		{
		    list1.add(i);
		}
		Collections.shuffle(list1);
		
		//defines and shuffles "list2", containing integers 6 through 15 in randomised order
		List<Integer> list2 = new ArrayList<>();
		for (int i=6; i<=15; i++)
		{
		    list2.add(i);
		}
		Collections.shuffle(list2);
		
		//print both collections
		System.out.print("list1: ");
		for(Integer i : list1){
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.print("list2: ");
		for(Integer i : list2){
			System.out.print(i + " ");
		}
		System.out.println();
		
		//print size of both collections
		System.out.println("Size of list1: " + list1.size());
		System.out.println("Size of list2: " + list2.size());
		System.out.println();
		
		
		//COMBINE THE ABOVE TWO COLLECTIONS
		
		
		//combine the above two collections, while checking for duplicates
		List<Integer> list3 = new ArrayList<>();
		for(Integer i : list1){
			list3.add(i);
		}
		for(Integer i : list2){
			if(!list3.contains(i)){
				list3.add(i);
			}
		}
		
		//sort the collection "list3"
		Collections.sort(list3);
		
		//remove the middle entry
		list3.remove(list3.get(list3.size()/2));
		
		//print the collection in reverse order
		System.out.print("list3 in reverse order: ");
		for(int i=list3.size()-1; i>=0; i--){
			System.out.print(list3.get(i) + " ");
		}
		System.out.println();
		
		//print the size of "list3"
		System.out.println("Size of list3: " + list3.size());
		System.out.println();
		
		
		//DEFINE A COLLECTION THAT CONTAINS A KEY/VALUE PAIR
		
		
		Map<String, Integer> hash1 = new HashMap<String, Integer>();
		
		//add 5 key/value pairs to the collection
		hash1.put("Chicopee", 55298);
		hash1.put("Ludlow", 21103);
		hash1.put("Agawam", 28438);
		hash1.put("Turners Falls", 4470);
		hash1.put("Pittsfield", 44057);
		
		//add a duplicate key/value pair
		hash1.put("Ludlow", 21103);
		
		//check for duplicate key and print
		if(hash1.containsKey("Ludlow")){
			System.out.println(hash1.get("Ludlow"));
		}
		
		//print the key/value pairs
		for(String town : hash1.keySet()){
			
			System.out.println(town + ": " + hash1.get(town));
			
		}
		
		//print the size of the collection
		System.out.println("Size of hash1: " + hash1.size());
		

		//The HashMap collection type was chosen specifically because it is ideal for key/value pairs of data such as this.

	}

}

