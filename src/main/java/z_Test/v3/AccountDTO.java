package z_Test.v3;

import lombok.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {
    private String accountId;
    private String ownerName;
    private int balance;
    private LocalDateTime createdAt;
}

