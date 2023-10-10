package CS4_Exercise_5;
import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList<>();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    this.name = name;
    earnings = 0.0;
    itemList = new ArrayList<>();
    storeList.add(Store.this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    if (index >= itemList.size()){
      System.out.printf("Thare are only %d items in the store %n", itemList.size());
    } else{
    earnings += itemList.get(index).getCost();
    System.out.printf("You have bought %s, for a total of %f %n", itemList.get(index).getName(), itemList.get(index).getCost());
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    boolean found = false;
    for (Item i : itemList){
      if (i.getName() == name){
        earnings += i.getCost();
        System.out.printf("You have bought %s, for a total of %f %n", i.getName(), i.getCost());
        found = true;
      }
    }
    if (!found){
      System.out.println("The store does not sell this item.");
    }
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    boolean found = false;
    for (Item j : itemList){
      if (j.getName() == i.getName()){
        earnings += j.getCost();
        System.out.printf("You have bought %s, for a total of %f %n", j.getName(), j.getCost());
        found = true;
      }
    }
    if (!found){
      System.out.println("The store does not sell this item.");
    }
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.printf("The store sells these %s items: %n", type);
    for(Item i : itemList){
      if(type.equals(i.getType())){
        System.out.println(i.getName());
        }
      }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    System.out.printf("The store sells these items lower than %f: %n", maxCost);
    for(Item i : itemList){
      if(i.getCost() <= maxCost){
        System.out.println(i.getName());
      }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    System.out.printf("The store sells these items higher than %f: %n", minCost);
    for(Item i : itemList){
      if(i.getCost() >= minCost){
        System.out.println(i.getName());
      }
    }
    
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for(Store i : storeList){
      System.out.printf("The store %s earned a total of %f %n", i.getName(), i.getEarnings()); 
    }
  }
}
