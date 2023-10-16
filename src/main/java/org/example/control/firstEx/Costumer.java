package org.example.control.firstEx;

import java.util.Random;
/**
 * Клас, що представляє покупця.
 */
public class Costumer {
    private String name;
    private static int id;
    private String address;
    private String cardNumber;
    private double balance;
    private int boughtProduct;
    /**
     * Конструктор класу Customer.
     *
     * @param name        Ім'я покупця.
     * @param address     Адреса покупця.
     * @param cardNumber  Номер картки покупця.
     * @param balance     Баланс покупця.
     */
    public Costumer(String name, String address, String cardNumber, double balance) {
        this.name = name;
        this.id = generateUniqueId(); //викликликає метод для генерації для id
        this.address = address;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }
    /**
     * Генерує id для  покупця.
     */
    private int generateUniqueId() {
        // Генерувати випадковий ID для покупця
        Random random = new Random();
        int nextId = random.nextInt(1000000000);
        return nextId;
    }
    /**
     * Показує інформацію про покупця.
     */
    public void show() {
        System.out.println(name + " " + id + ": \n" +
                "   address: " + address + " \n" +
                "   cardNumber: " + cardNumber + " \n" +
                "   balance = " + balance + " \n" +
                "   amount of bought product: " + boughtProduct);
    }
    /**
     * Купити продукт.
     *
     * @param product Продукт для покупки.
     */
    public void buy(Product product){
        if ( balance > product.getPrice()) {
            balance =- product.getPrice();
            boughtProduct++;
            System.out.println("Product bought!");
        } else {
            System.out.println("Don`t enough money!" );
        }
    }

    // Додаткові геттери та сеттери
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Costumer.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getBoughtProduct() {
        return boughtProduct;
    }

    public void setBoughtProduct(int boughtProduct) {
        this.boughtProduct = boughtProduct;
    }
}
