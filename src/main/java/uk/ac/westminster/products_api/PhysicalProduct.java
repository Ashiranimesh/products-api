package uk.ac.westminster.products_api;
//A PhysicalProduct IS-A Product because PhysicalProduct is children/super class of Product class
//Product Has-A ShoppingCart
public class PhysicalProduct extends Product implements Discountable{
    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){}

    public PhysicalProduct(Long id,String name,double price,double weightKg,String dimensions){
        super(id,name,price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }
    public double getWeightKg(){
        return weightKg;
    }
    public String getDimensions(){
        return dimensions;
    }

    @Override
    public String getSummary(){
        return "Physical:"+getName()+"Dimesions:"+getDimensions()+"Weight:"+getWeightKg();
    }

   private double discountedPrice;

    @Override
    public void applyDiscount(double rate){
        double capped = Math.min(rate, 0.20);
        discountedPrice = getPrice() * (1 - capped);

    }

    @Override
    public double getDiscountedPrice(){return discountedPrice;

    }

}
