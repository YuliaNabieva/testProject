package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class subdivision {
    private Long id;
    private String nameSubdivision;
    private String contactsSubdivision;
    private Long supervisorSubdivision;
}
