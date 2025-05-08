package ch_31_collection_ex.ex_11_hashset;

import lombok.*;

@Getter
@AllArgsConstructor
public class Student {
    private int studentId;
    private String name;

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return studentId;
    }
}
