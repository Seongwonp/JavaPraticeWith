package ch_31_collection_ex.ex_12_hashset;

import lombok.*;
import java.util.*;

@Getter
@AllArgsConstructor
public class Member {
    private String id;
    private String name;


    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Member member)) return false;

        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return id + ':' + name;
    }
}
