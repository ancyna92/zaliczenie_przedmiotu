package org.vistula.basket;

import org.junit.Test;

public class BasketItemTest {

@Test
    public void testName  () {
        BasketItem chleb = new BasketItem();
        chleb.setName("Chleb");
        assert chleb.getName() == "Chleb" ;

        BasketItem chips = new BasketItem();
        chips.setName("Chips");
        assert chips.getName () == "Chips" ;

        BasketItem mleko = new BasketItem();
        mleko.setName("Mleko");
        assert mleko.getName () == "Mleko" ;

        BasketItem maka = new BasketItem();
        maka.setName("Maka");
        assert maka.getName () == "Maka" ;
}
@Test
    public void price () {
    BasketItem maka = new BasketItem();
    maka.setPrice(0);
    assert maka.getPrice () == 0;
}
@Test
    public void AgeRestricted (){
    BasketItem mleko = new BasketItem();
    mleko.setAgeRestrictedItem(10);
    assert mleko.getAgeRestrictedItem() == 10;
}

}
