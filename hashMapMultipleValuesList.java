import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class SingleKeyMultipleValuesUsingList
{
 public static void main(String[] args)
 { 
  // create map to store
  Map<String, List<String>> map = new HashMap<String, List<String>>();
  
               // create list one and store values
  List<String> l1 = new ArrayList<String>();
  l1.add("Apple");
  l1.add("America");
  
               // create list two and store values
  List<String> l2 = new ArrayList<String>();
  l2.add("Bat");
  l2.add("Bangladesh");
  
               // create list three and store values
  List<String> l3 = new ArrayList<String>();
  l3.add("Cat");
  l3.add("China");
  
               // put values into map
  map.put("A", l1);
  map.put("B", l2);
  map.put("C", l3);
  
               // iterate and display values
  System.out.println("Fetching Keys and corresponding MULTIPLE Values n");
  for (Map.Entry<String, List<String>> entry : map.entrySet())
  {
   String key = entry.getKey();
   List<String> values = entry.getValue();
   System.out.println("Key = " + key);
   System.out.println("Values = " + values + "/n");
  }
 }
}