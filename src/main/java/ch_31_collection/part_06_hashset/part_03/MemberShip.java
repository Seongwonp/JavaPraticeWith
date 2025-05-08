package ch_31_collection.part_06_hashset.part_03;

import lombok.*;

import java.util.Objects;

@Data
@AllArgsConstructor
public class MemberShip {
    private String memberId;
    private String name;

    /*
        HashSet은 객체를 저장하기 전에
        1)먼저 객체의 hashCode() 메소드를 호출해서 해시코드를 얻어내고,
        이미 저장되어 있는 객체드르이 해시코드와 비교
     */

    @Override
    public int hashCode() {
        //memberId 값이 같으면 동일한 hashcode 반환
        return memberId.hashCode(); // String의 hashCode() 이용
    }

    @Override
    public final boolean equals(Object o) {
        //memberId 값이 같으면 true 리턴
        if(o instanceof MemberShip) { //동일한 타입의 객체인지 확인
            MemberShip memberShip = (MemberShip) o; //다운캐스팅
            return memberShip.memberId.equals(this.memberId);
        } else{
            return false; //같은 타입의 객체가 아닌 경우
        }
/*
        // 간략화 시킨버전
        if (!(o instanceof MemberShip that)) return false;
        return Objects.equals(memberId, that.memberId);
*/
    }
}
