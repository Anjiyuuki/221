
public abstract class GroceryItem implements Comparable
{
    // instance variable
    protected String name;
    protected int price;
        
    public void GroceryItem(String name){
        setName(name);
    }
    
    //getter/setter methods
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setPrice(int p){
        this.price = p;
    }
    public int getPrice(){
        return price;
    }
    
    public abstract void printItemInfo();
    
    //toString
    public String toString(){
        return
        "Information\n" +
        "\nName: " + name +
        "\npPrice: "+ price ;
        
    }
    
    
}
