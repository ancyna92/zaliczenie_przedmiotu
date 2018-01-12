package org.vistula.customer;

import org.vistula.basket.BasketItem;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String firstName;
    private String lastName;
    private int age;
    private List<BasketItem> basket;
    public boolean isAdult;

    public Customer()
    {
        basket = new ArrayList<BasketItem>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<BasketItem> getBasket() {
        return basket;
    }

    public void setBasket(List<BasketItem> basket) {
        this.basket = basket;
    }

    public boolean isAdult () {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public float getBasketValue (){
        float basketValue = 0;
        for (BasketItem basketItem: basket) {
          basketValue = basketValue + basketItem.getPrice(); }
        return basketValue;
    }
    public void addToBasket(BasketItem item) {
    if (age >= item.isAgeRestrictedItem() )
        basket.add(item);
    }

    public void printItemNames () {
        for (BasketItem basketItem : basket)
        {
            System.out.println(basketItem.getName() + ": " + basketItem.getPrice());

        }
    }
    public void removeFromTheBasket (BasketItem item) {
        basket.remove(item);
    }

}
