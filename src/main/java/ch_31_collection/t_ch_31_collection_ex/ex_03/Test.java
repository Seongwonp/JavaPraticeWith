package ch_31_collection.t_ch_31_collection_ex.ex_03;
/*
        1.	ProductDTO 클래스를 생성한다. 이 클래스는 다음 필드를 가진다:
    •	String productId
    •	String name
    •	int price
    •	int quantity
    2.	Main 클래스에서 Scanner를 이용해 사용자로부터 상품 3개의 정보를 입력받는다.
    3.	입력받은 각 상품 정보를 ProductDTO 객체로 생성하고, ArrayList<ProductDTO>에 저장한다.
    4.	입력이 끝난 후, 저장된 상품 목록을 다음 형식으로 출력한다
    [1] 상품ID: p001 / 이름: 키보드 / 가격: 30000원 / 재고: 10개
    [2] 상품ID: p002 / 이름: 마우스 / 가격: 15000원 / 재고: 20개
    ...
    5. 총 재고 금액(가격 × 수량) 출력하기
    [1] 상품ID: p001 / 이름: 키보드 / 가격: 30000원 / 재고: 5개
    [2] 상품ID: p002 / 이름: 마우스 / 가격: 15000원 / 재고: 10개
    [3] 상품ID: p003 / 이름: 모니터 / 가격: 100000원 / 재고: 2개

    총 재고 금액: 365000원
 */

import java.util.*;

public class Test {
    private static final int MAX = 3;

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력하세요.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ProductDTO> list = new ArrayList<>();
        String productId, productName;
        int productPrice, productQuantity;
        int sum = 0;

        for (int i = 1; i <= MAX; i++) {
            System.out.println("-> Enter product #" + i);
            System.out.print("Input product ID: ");
            productId = scanner.nextLine();
            System.out.print("Input product name: ");
            productName = scanner.nextLine();

            //int 예외처리
            productPrice = readInt(scanner, "Input product price: ");
            productQuantity = readInt(scanner, "Input quantity: ");

            list.add(new ProductDTO(productId, productName, productPrice, productQuantity));
        }

        System.out.println("------------ List ------------");
        for (int i = 0; i < list.size(); i++) {
            ProductDTO product = list.get(i);
            sum += product.getTotalPrice();
            System.out.println("[" + (i + 1) + "] " + product);
        }

        System.out.println("\n총 재고 금액: " + sum + "원");
    }
}
