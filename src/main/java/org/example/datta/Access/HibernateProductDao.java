package org.example.datta.Access;

import org.example.entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product){
        // sadece db erişim kodları buraya yazılır...
        System.out.println("Hibernate ile veritabnına bağlandı");
    }
}