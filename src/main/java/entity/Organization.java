package entity;

import lombok.Builder;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Builder
@Entity
@Table(name = "organization")
public class Organization implements Serializable {

    private static final long serialVersionUID = 1796556740932985128L;

    @Id
    private Long idOrganization;

    @Column(name = "nameOrg")
    private String nameOrg;

    @Column(name = "fizAdressOrg")
    private String fizAdressOrg;

    @Column(name = "urAdressOrg")
    private String urAdressOrg;

    @OneToOne(cascade = CascadeType.ALL)
    private Long supervisorOrg;

    public Organization() {

    }

    public Long getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(Long idOrganization) {
        this.idOrganization = idOrganization;
    }

    public String getNameOrg() {
        return nameOrg;
    }

    public void setNameOrg(String nameOrg) {
        this.nameOrg = nameOrg;
    }

    public String getFizAdressOrg() {
        return fizAdressOrg;
    }

    public void setFizAdressOrg(String fizAdressOrg) {
        this.fizAdressOrg = fizAdressOrg;
    }

    public String getUrAdressOrg() {
        return urAdressOrg;
    }

    public void setUrAdressOrg(String urAdressOrg) {
        this.urAdressOrg = urAdressOrg;
    }

    public Long getSupervisorOrg() {
        return supervisorOrg;
    }

    public void setSupervisorOrg(Long supervisorOrg) {
        this.supervisorOrg = supervisorOrg;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "idOrganization=" + idOrganization +
                ", nameOrg='" + nameOrg + '\'' +
                ", fizAdressOrg='" + fizAdressOrg + '\'' +
                ", urAdressOrg='" + urAdressOrg + '\'' +
                ", supervisorOrg=" + supervisorOrg +
                '}';
    }
}
