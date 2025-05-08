package ch_31_collection.member;

import lombok.*;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@AllArgsConstructor
public class MemberDTO implements Comparable<MemberDTO> {
    private int memberId;
    private String memberName;

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 \"" + memberId + "\" 입니다.";
    }


    @Override
    public int compareTo(@NotNull MemberDTO other) {
        /*
            비교하는 두 값 중 this 값이 더 크면 양수를 반환하여 오름차순으로 정렬.
            메서드를 호출하는 객체가 인자로넘어온 객체보다 작을 경우 음수를 리턴하고,
            크기가 동일하다면 0, 클 경우에는 양수를 리턴.
        */
//        return this.memberId - other.memberId; //ex) 1003 - 1001 양수 -> memberId가 정수이기 때문에 오름차순 ASC 정렬.
        return (this.memberId - other.memberId) * -1; // DESC 정렬
    }


    //set 에서 memberId가 같으면 중복으로 판단하려면 hashCode와 equals 메서드 재정의
    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof MemberDTO memberDTO)) return false;
        return memberId == memberDTO.memberId;
    }

    @Override
    public int hashCode() {
        return memberId;
    }
}
