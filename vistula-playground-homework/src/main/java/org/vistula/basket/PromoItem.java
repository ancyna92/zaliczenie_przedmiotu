package org.vistula.basket;

public class PromoItem extends BasketItem {

    private float percentageDiscount;

    public float getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(float percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    @Override
    public float getPrice() {
        //price = 15, discount=20
        //price-((price*discount)/100)
        float discountedPrice = super.getPrice()-((super.getPrice()*this.percentageDiscount)/100);
        return discountedPrice;
    }
}
