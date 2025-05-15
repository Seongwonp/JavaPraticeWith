package ch_31_collection.t_ch_31_collection_ex.ex_02;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {
    private String userId;
    private String name;
    private int age;
    private String job;

    @Override
    public String toString() {
        return "ID: " + userId + " / Name: " + name + " / Age: " + age + " / Job: " + job;
    }
}
