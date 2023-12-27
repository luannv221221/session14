package demo.sort;

public class Product {
    private int productCode;
    private String productName;
    private Float price;

    public Product() {
    }

    public Product(int productCode, String productName, Float price) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode=" + productCode +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
