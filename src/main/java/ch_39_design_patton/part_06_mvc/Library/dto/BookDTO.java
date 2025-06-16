package ch_39_design_patton.part_06_mvc.Library.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private int bookId;
    private String title;
    private String author;
    private boolean rented;
}
