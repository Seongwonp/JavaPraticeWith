package ch_31_collection_ex.ex_03;

import lombok.*;
@Getter
@AllArgsConstructor
public class ProductDTO {
    private String productId;
    private String name;
    private int price;
    private int quantity;

    public int getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "상품ID: " + productId + " / 이름: " + name + " / 가격: " + price + "원 / 재고: " + quantity + "개";
    }
}
