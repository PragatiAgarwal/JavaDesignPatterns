package strategypattern;

public class Item {

    private String itemCode;
    private int price;

    public Item(String itemCode, int cost){
        this.itemCode=itemCode;
        this.price=cost;
    }

    public String getitemCode() {
        return itemCode;
    }

    public int getPrice() {
        return price;
    }

}
