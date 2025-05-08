package ch_31_collection_ex.ex_13_treeset;

import lombok.*;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
public class Member implements Comparable<Member> {
    private String id;
    private String name;

    @Override
    public String toString() {
        return id + ':' + name;
    }

    @Override
    public int compareTo(@NotNull Member o) {
        if(this.id.equals(o.id)){ return 0; }
        return this.name.compareTo(o.name);
    }
}
