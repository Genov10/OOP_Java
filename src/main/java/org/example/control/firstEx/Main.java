package org.example.control.firstEx;

import org.example.control.firstEx.Costumer;
import org.example.control.firstEx.Product;

public class Main {
    public static void main(String[] args) {
        Costumer costumer = new Costumer("Genov Olexandr Dmitrovich", "Odesa, Garshina 5A", "4441114438873322", 1200);
        Product book = new Product("Book", 700);
        Product pillow = new Product("Pillow", 1500);
        costumer.show();
        costumer.buy(book);
        costumer.buy(pillow);
        costumer.show();
    }
}
