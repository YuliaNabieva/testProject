package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Organization {
    private Long idOrganization;
    private String nameOrg;
    private String fizAdressOrg;
    private String urAdressOrg;
    private Long supervisorOrg;
}
