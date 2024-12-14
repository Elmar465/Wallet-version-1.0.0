package model;

import java.util.ArrayList;
import java.util.List;

public class Wallet {


    private Integer cash;
    private Integer credit;
    private List<String> categories;

    //Getter
    public Integer getCash(){
        return cash;
    }

    //Setter
    public void setCash(Integer cash){
        this.cash = cash;
    }

    //Getter
    public Integer getCredit(){
        return credit;
    }

    //Stter
    public void setCredit(Integer credit){
        this.credit = credit;
    }

    // Getter
    public List<String> getCategories(){
        return categories;
    }

    //Setter
    public void setCategories(List<String> categories) {
        this.categories =  categories;
    }

    public static List<String> getCategorie(List<String> categories){
        categories = new ArrayList<>();
        categories.add("1.Groceries");
        categories.add("2.Bar Cafe");
        categories.add("3.Financial Expenses");
        categories.add("Exit");
        categories.forEach(System.out::println);
        return categories;
    }
}
