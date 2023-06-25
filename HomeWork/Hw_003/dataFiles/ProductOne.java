package HomeWork.Hw_003.dataFiles;

public class ProductOne {
    private String productName;
    private Integer productPrice;
    private Integer productSort;

    public ProductOne(String productName, Integer productPrice, Integer productSort) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productSort = productSort;
    }

    @Override
    public String toString() {
        return "ProductOne [productName=" + productName + ", productPrice=" + productPrice + ", productSort="
                + productSort + "]";
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductSort() {
        return productSort;
    }

    public void setProductSort(Integer productSort) {
        this.productSort = productSort;
    }
}
