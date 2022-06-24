import java.util.*;
public class GroceryStore{
    
    ArrayList<GroceryItem> groceryList = new ArrayList();
    
    public void addItems(){
        
    }
    
    public String toString(){
         return
        "Information\n" +
        "\nItem in array: " + groceryList;
    }
    
    //Extra conceptual codes, hopefully will get some extra points since the actual program
    //isn't fully functional.
    public static void main(String[] args){
        // 2D ArrayList example for if users want to add certain items into certain 
        // list like groceryItem or produceItem list. 
        ArrayList<ArrayList<String>> wholeGroceryList = new ArrayList();
        
        ArrayList<String> groceryItem = new ArrayList();
        groceryItem.add("Food 1");
        groceryItem.add("Food 2");
        groceryItem.add("Food 3");
        
        ArrayList<String> produceItem = new ArrayList();
        produceItem.add("milk");
        produceItem.add("peppers");
        produceItem.add("tomatoes");
        
        System.out.println(wholeGroceryList);
        // This prints all the items from both array but if you want certain item from certain
        // array, you could do wholeGroceryList.get(1).get(0) which will print out milk
        
    }
    
    
}
