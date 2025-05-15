package ch_31_collection.part_10_collections.part_01_Sort.ex;

import lombok.*;
import org.jetbrains.annotations.NotNull;

@AllArgsConstructor
public class Student implements Comparable<Student>{
    private Integer number;
    private String name;

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return this.number.compareTo(o.number);
    }
}
