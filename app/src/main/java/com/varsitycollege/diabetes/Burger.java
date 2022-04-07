package com.varsitycollege.diabetes;

import android.graphics.drawable.Drawable;

public class Burger {

    public static Burger burgerInstance = null;

    String burger_Name = "";
    String burger_price = "";
    int burgerImageRes;
    boolean isLettuce = false;
    boolean isCheese = false;
    boolean isTomato = false;

    public boolean isLettuce() {
        return isLettuce;
    }

    public void setLettuce(boolean lettuce) {
        isLettuce = lettuce;
    }

    public boolean isCheese() {
        return isCheese;
    }

    public void setCheese(boolean cheese) {
        isCheese = cheese;
    }

    public boolean isTomato() {
        return isTomato;
    }

    public void setTomato(boolean tomato) {
        isTomato = tomato;
    }

    public int getBurgerImageRes() {
        return burgerImageRes;
    }

    public void setBurgerImageRes(int burgerImageRes) {
        this.burgerImageRes = burgerImageRes;
    }

    public String getBurger_Name() {
        return burger_Name;
    }

    public void setBurger_Name(String burger_Name) {
        this.burger_Name = burger_Name;
    }

    public String getBurger_price() {
        return burger_price;
    }

    public void setBurger_price(String burger_price) {
        this.burger_price = burger_price;
    }

    public static Burger getInstance()
    {
        if (burgerInstance == null)
            burgerInstance = new Burger();

        return burgerInstance;
    }
}
