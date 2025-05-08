package ch_31_collection.part_02_vector;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BoardDTO {
    private String  subject;
    private String  content;
    private String writer;
}
