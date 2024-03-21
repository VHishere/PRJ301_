/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vh69
 */
public class cart {
    private int accountID;
    private int productID;
    private int amount;
    private String size;
    public cart() {
    }

    public cart(int accountID, int productID, int amount, String size) {
        this.accountID = accountID;
        this.productID = productID;
        this.amount = amount;
        this.size=size;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "cart{" + "accountID=" + accountID + ", productID=" + productID + ", amount=" + amount + ", size=" + size + '}';
    }
    
}
