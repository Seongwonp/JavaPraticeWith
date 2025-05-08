package ch_31_collection.part_08_hashmap.part_02;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class Student {
    private int sno; //학번
    private String name; //이름

    //학번과 이름이 같다면 동일한 키로 인식
    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;

        return sno == student.sno && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = sno;
        result = 31 * result + Objects.hashCode(name);
        return result;
    }



}
