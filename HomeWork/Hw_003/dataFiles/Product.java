package HomeWork.Hw_003.dataFiles;

public class Product {
    private String productName;
    private String productManufacturerCountry;
    private Integer productWeight;
    private Integer productPrice;
    private Integer productSort;

    @Override
    public String toString() {
        return "Product [productName=" + productName + ", productManufacturerCountry=" + productManufacturerCountry
                + ", productWeight=" + productWeight
                + ", productPrice=" + productPrice + ", productSort=" + productSort + "]";
    }

    public String getproductName() {
        return productName;
    }

    public void setproductName(String productName) {
        this.productName = productName;
    }

    public String getproductManufacturerCountry() {
        return productManufacturerCountry;
    }

    public void setproductManufacturerCountry(String productManufacturerCountry) {
        this.productManufacturerCountry = productManufacturerCountry;
    }

    public Integer getproductWeight() {
        return productWeight;
    }

    public void setproductWeight(Integer productWeight) {
        this.productWeight = productWeight;
    }

    public Integer getproductPrice() {
        return productPrice;
    }

    public void setproductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getproductSort() {
        return productSort;
    }

    public void setproductSort(Integer productSort) {
        this.productSort = productSort;
    }

    public Product(String productName, String productManufacturerCountry, Integer productWeight, Integer productPrice,
            Integer productSort) {
        this.productName = productName;
        this.productManufacturerCountry = productManufacturerCountry;
        this.productWeight = productWeight;
        this.productPrice = productPrice;
        this.productSort = productSort;
    }

}
