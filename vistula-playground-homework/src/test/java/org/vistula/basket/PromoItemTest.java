package org.vistula.basket;

import org.junit.Test;

public class PromoItemTest {

@Test
   public void promoTest () {
    PromoItem maka = new PromoItem();
    maka.setPrice(10);
    maka.setPercentageDiscount(50);
    assert maka.getPrice() == 5;
}
@Test
    public void promoTest2 (){
    PromoItem grzyb = new PromoItem();
    grzyb.setPrice(30);
    grzyb.setPercentageDiscount(0);
    assert grzyb.getPrice() == 30 ;
}
@Test
    public void promoTest3 () {
    PromoItem wino = new PromoItem();
    wino.setPrice(50);
    wino.setPercentageDiscount(150);
    assert wino.getPrice() == -25;
}





}

