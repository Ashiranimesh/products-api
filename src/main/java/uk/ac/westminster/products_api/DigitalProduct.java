package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable {
    private String downloadUrl;
    private double fileSizeMB;

    public DigitalProduct() {
    }

    public DigitalProduct(Long id, String name, double price, String downloadUrl, double fileSizeMB){
    super(id,name,price);
    this.downloadUrl = downloadUrl;
    this.fileSizeMB = fileSizeMB;
}

@Override
public String getSummary(){
    return "Digital: " + getName() + " | Download: " + downloadUrl;}

public String getDownloadUrl(){return downloadUrl;}

public double getFileSizeMB(){return fileSizeMB;}

    private double discountedPrice;

    @Override
    public void applyDiscount(double rate) {
        discountedPrice=getPrice() * (1 -rate);
    }

    @Override
    public double getDiscountedPrice(){ return discountedPrice;}
}
