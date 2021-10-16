package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class employee {
    private Long id;
    private String lastName;
    private String firstName;
    private String patronymicName;
    private String job;
}
