package org.vistula.basket;

public class BasketItem {

    private String name;
    private float price;
    int ageRestrictedItem;

    public BasketItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int isAgeRestrictedItem() {
        return ageRestrictedItem;
    }

    public void setAgeRestrictedItem(int ageRestrictedItem) {
        this.ageRestrictedItem = ageRestrictedItem;
    }

    public int getAgeRestrictedItem (){return ageRestrictedItem; }


}
