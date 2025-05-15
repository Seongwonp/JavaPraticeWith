package ch_31_collection.part_09_treemap.part_01;

import lombok.*;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
public class Student implements Comparable<Student> {
    private Integer sno;
    private String name;

    @Override
    public int compareTo(@NotNull Student o) {
        return sno.compareTo(o.sno);
    }
}
