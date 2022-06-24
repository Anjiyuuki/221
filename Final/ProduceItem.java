public abstract class ProduceItem extends GroceryItem implements Comparable{
    private String sellByDate;
    
    public void ProduceItem(String name, String date, int price){
        this.sellByDate = date;
        super.price = price;
        super.name = name;
    }
    
    public void setSellByDate(String date){
        this.sellByDate = date;
    }
    public String getSellByDate(){
        return sellByDate;
    }
    
    public boolean equals(Object other)
    {
        if (!(other instanceof ProduceItem))
            return false;
        ProduceItem obj = (ProduceItem) other;
        return super.equals(obj) &&
               (this.sellByDate.equals(obj.sellByDate));
    }    
    
    public String toString(){
        return
        "Information\n" +
        "\nSell by date: " + sellByDate;
    }
    
    
}
