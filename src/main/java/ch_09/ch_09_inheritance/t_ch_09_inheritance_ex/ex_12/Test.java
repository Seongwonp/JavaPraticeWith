package ch_09.ch_09_inheritance.t_ch_09_inheritance_ex.ex_12;

public class Test {
    /*
    # 문제: 제품과 재고 관리 시스템

* 모든 멤버 변수는 private 접근 제한자를 사용하세요.

1. Product 클래스를 작성하세요.

이 클래스는 다음과 같은 속성을 가져야 합니다:
- name (문자열): 제품의 이름
- productId (정수): 제품의 고유 식별자
- price (실수): 제품의 가격

Product 클래스에는 다음과 같은 메서드가 있어야 합니다:
- Product 생성자: 이름, 고유 식별자, 가격을 매개변수로 받아 초기화합니다.
- calculatePrice() 메서드: 제품의 기본 가격을 반환합니다.

2. DiscountProduct 클래스를 작성하세요.
이 클래스는 Product 클래스를 상속받아야 합니다.

DiscountProduct 클래스는 다음과 같은 추가 속성을 가져야 합니다:
- discountRate (실수): 할인율 (0.0 ~ 1.0 사이의 값)

DiscountProduct 클래스에는 다음과 같은 메서드가 있어야 합니다:
- DiscountProduct 생성자: 이름, 고유 식별자, 가격, 할인율을 매개변수로 받아 초기화합니다.
- calculatePrice() 메서드: 할인율을 적용한 가격을 계산하여 반환합니다. (오버라이딩)

3. SeasonalProduct 클래스를 작성하세요.
이 클래스는 DiscountProduct 클래스를 상속받아야 합니다.

SeasonalProduct 클래스는 다음과 같은 추가 속성을 가져야 합니다:
- season (문자열): 시즌 (예: "여름", "겨울")
- seasonalDiscountRate (실수): 시즌 추가 할인율

SeasonalProduct 클래스에는 다음과 같은 메서드가 있어야 합니다:
- SeasonalProduct 생성자: 이름, 고유 식별자, 가격, 할인율, 시즌, 시즌 추가 할인율을 매개변수로 받아 초기화합니다.
- calculatePrice() 메서드: 기본 할인과 시즌 할인을 모두 적용한 가격을 계산하여 반환합니다. (오버라이딩)

4. Main 클래스에서 다음과 같은 작업을 수행하세요:
- DiscountProduct 객체와 SeasonalProduct 객체를 각각 생성하고, 각 제품의 최종 가격을 출력하세요.
- (오버라이딩된 calculatePrice() 메서드 활용)

이 문제를 해결하기 위해 Product, DiscountProduct, SeasonalProduct 클래스를 작성하고,
메서드 오버라이딩을 통해 가격을 계산하고 출력하세요.
그리고 Main 클래스에서 객체를 생성하여 최종 가격을 확인하세요.
     */


    public static void main(String[] args) {
        DiscountProduct discountProduct = new DiscountProduct("스킨",1001,10000,0.1);
        SeasonalProduct seasonalProduct = new SeasonalProduct("썬크림",1002,20000,0.1,
                "여름",0.2);

        System.out.println(discountProduct.calculatePrice());
        System.out.println(seasonalProduct.calculatePrice());
    }

}
