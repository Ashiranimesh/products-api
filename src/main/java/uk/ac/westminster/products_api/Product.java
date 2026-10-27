package uk.ac.westminster.products_api;

public abstract class Product {
    private Long id;
    private String name;
    private double price;

    public Product() { }

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract String getSummary();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name= name;

    }

    public double getPrice() {
        return price;
    }
    // Tutorial 2: verified getter removal
    //drops the field from JSON

    public void setPrice(double price){
        this.price=price;
    }



}



