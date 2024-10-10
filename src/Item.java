public class Item {
    private String item;
    private String itemDescription;


    public Item(){

    }

    public Item(String item, String itemBeskrivelse) {
        this.item = item;
        this.itemDescription = itemBeskrivelse;
    }


    public String getItem() {
        return item;
    }

    public String getItemDescription() {
        return itemDescription;
    }


    @Override
    public String toString() {
        return item + " " + itemDescription;
    }
}
