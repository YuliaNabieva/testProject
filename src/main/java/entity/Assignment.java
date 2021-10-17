package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "ssignment")
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subject")
    private String subject;

    @Column(name = "deadline")
    private Date deadline;

    @Column(name = "controlSign")
    private String controlSign;

    @Column(name = "executionSign")
    private String executionSign;

    @Column(name = "textOfAssigment")
    private String textOfAssigment;

    @OneToOne(cascade = CascadeType.ALL)
    private Long authorOfAssigment;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "employee",
            joinColumns = @JoinColumn(name = "employeeId"),
            inverseJoinColumns = @JoinColumn(name = "assignmentId")
    )
    private Long performersOfAssigment;

    private Set<Employee> employees;

    public Assignment() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getControlSign() {
        return controlSign;
    }

    public void setControlSign(String controlSign) {
        this.controlSign = controlSign;
    }

    public String getExecutionSign() {
        return executionSign;
    }

    public void setExecutionSign(String executionSign) {
        this.executionSign = executionSign;
    }

    public String getTextOfAssigment() {
        return textOfAssigment;
    }

    public void setTextOfAssigment(String textOfAssigment) {
        this.textOfAssigment = textOfAssigment;
    }

    public Long getAuthorOfAssigment() {
        return authorOfAssigment;
    }

    public void setAuthorOfAssigment(Long authorOfAssigment) {
        this.authorOfAssigment = authorOfAssigment;
    }

    public Long getPerformersOfAssigment() {
        return performersOfAssigment;
    }

    public void setPerformersOfAssigment(Long performersOfAssigment) {
        this.performersOfAssigment = performersOfAssigment;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", deadline=" + deadline +
                ", controlSign='" + controlSign + '\'' +
                ", executionSign='" + executionSign + '\'' +
                ", textOfAssigment='" + textOfAssigment + '\'' +
                ", authorOfAssigment=" + authorOfAssigment +
                ", performersOfAssigment=" + performersOfAssigment +
                '}';
    }
}
