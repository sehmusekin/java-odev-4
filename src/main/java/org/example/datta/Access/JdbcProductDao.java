package org.example.datta.Access;

import org.example.entities.Product;

public class JdbcProductDao  {
    public void add(Product product){
        // sadece db erişim kodları buraya yazılır...
        System.out.println("jdbc ile veritabnına bağlandı");
    }
}