
package mall;

public class Ordered extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public Integer getStock() {
        return qty;
    }

    public void setStock(Integer qty) {
        this.qty = qty;
    }
}
