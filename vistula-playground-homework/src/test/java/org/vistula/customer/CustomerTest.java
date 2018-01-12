package org.vistula.customer;

import org.junit.Test;
import org.vistula.basket.BasketItem;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {

    @Test
    public void alco() {
        Customer ania = new Customer();
        ania.setAge(17);
        assert ania.isAdult() == false;
    }

    @Test
    public void alcoAge (){
        Customer ala = new Customer();
        ala.setAge(18);
        assert ala.isAdult() == true;
    }
    @Test
    public void alcoAge2(){
        Customer ania = new Customer ();
        ania.setAge(19);
        assert ania.isAdult() == true;
    }
    @Test
    public void koszyk () {
        Customer Jan = new Customer();
        Jan.setFirstName("Jan");
        Jan.setLastName("Kowlaski");
        Jan.setAge(7);

        BasketItem Maka = new BasketItem();
        Maka.setName("Maka");
        Maka.setPrice(5);
        Maka.setAgeRestrictedItem(10);

        BasketItem Mleko = new BasketItem();
        Mleko.setName("Mleko");
        Mleko.setPrice(10);
        Mleko.setAgeRestrictedItem(10);

        BasketItem Chleb = new BasketItem();
        Chleb.setName("Chleb");
        Chleb.setPrice(15);
        Chleb.setAgeRestrictedItem(7);

        BasketItem Chips = new BasketItem();
        Chips.setName("Chips");
        Chips.setPrice(8);
        Chips.setAgeRestrictedItem(5);


        Jan.addToBasket(Maka);
        Jan.addToBasket(Mleko);
        Jan.addToBasket(Chleb);
        Jan.addToBasket(Chips);
    }
    @Test
    public void basketValueTest () {
        Customer Jan = new Customer();
        Jan.setFirstName("Jan");
        Jan.setLastName("Kowlaski");
        Jan.setAge(7);

        BasketItem Chleb = new BasketItem();
        Chleb.setName("Chleb");
        Chleb.setPrice(15);

        BasketItem Chips = new BasketItem();
        Chips.setName("Chips");
        Chips.setPrice(8);

        Jan.addToBasket(Chleb);
        Jan.addToBasket(Chips);

        Jan.getBasketValue();
        System.out.println(Jan.getBasketValue());
    }
    @Test
    public void printNamesTest () {
        Customer Jan = new Customer();
        Jan.setFirstName("Jan");

        BasketItem Maka = new BasketItem();
        Maka.setName("Maka");

        BasketItem Mleko = new BasketItem();
        Mleko.setName("Mleko");

        BasketItem Chleb = new BasketItem();
        Chleb.setName("Chleb");

        BasketItem Chips = new BasketItem();
        Chips.setName("Chips");

        Jan.addToBasket(Maka);
        Jan.addToBasket(Mleko);
        Jan.addToBasket(Chleb);
        Jan.addToBasket(Chips);

        Jan.printItemNames();

    }
    @Test
    public void removeItemsTest () {
        Customer Jan = new Customer();
        Jan.setFirstName("Jan");

        BasketItem Maka = new BasketItem();
        Maka.setName("Maka");

        BasketItem Mleko = new BasketItem();
        Mleko.setName("Mleko");

        BasketItem Chleb = new BasketItem();
        Chleb.setName("Chleb");

        BasketItem Chips = new BasketItem();
        Chips.setName("Chips");

        Jan.addToBasket(Maka);
        Jan.addToBasket(Mleko);
        Jan.addToBasket(Chleb);
        Jan.addToBasket(Chips);

        Jan.removeFromTheBasket(Chleb);
        Jan.removeFromTheBasket(Maka);
        Jan.printItemNames();

    }
    @Test
    public void ageRestricted1 (){
        Customer Jan = new Customer();
        Jan.setFirstName("Jan");
        Jan.setAge(7);

        BasketItem Maka = new BasketItem();
        Maka.setName("Maka");
        Maka.setAgeRestrictedItem(10);

        BasketItem Mleko = new BasketItem();
        Mleko.setName("Mleko");
        Mleko.setAgeRestrictedItem(10);

        Jan.addToBasket(Maka);
        Jan.addToBasket(Mleko);
    }
    @Test
    public void ageRestricted2 (){
        Customer Jan = new Customer();
        Jan.setFirstName("Jan");
        Jan.setAge(10);

        BasketItem Maka = new BasketItem();
        Maka.setName("Maka");
        Maka.setAgeRestrictedItem(10);

        BasketItem Mleko = new BasketItem();
        Mleko.setName("Mleko");
        Mleko.setAgeRestrictedItem(10);

        Jan.addToBasket(Maka);
        Jan.addToBasket(Mleko);
    }
    @Test
    public void ageRestricted3 (){
        Customer Jan = new Customer();
        Jan.setFirstName("Jan");
        Jan.setAge(11);

        BasketItem Maka = new BasketItem();
        Maka.setName("Maka");
        Maka.setAgeRestrictedItem(10);

        BasketItem Mleko = new BasketItem();
        Mleko.setName("Mleko");
        Mleko.setAgeRestrictedItem(10);

        Jan.addToBasket(Maka);
        Jan.addToBasket(Mleko);
    }
}