package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class assignment {
    private Long id;
    private String subject;
    private Long authorOfAssigment;
    private Long performersOfAssigment;
    private Date deadline;
    private String controlSign;
    private String executionSign;
    private String textOfAssigment;

}
