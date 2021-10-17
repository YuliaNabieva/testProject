package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subdivision")
public class Subdivision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSubdivision;

    @Column(name = "nameSubdivision")
    private String nameSubdivision;

    @Column(name = "contactsSubdivision")
    private String contactsSubdivision;

    @OneToOne(cascade = CascadeType.ALL)
    private Long supervisorSubdivision;

    public Subdivision() {

    }

    public Long getIdSubdivision() {
        return idSubdivision;
    }

    public void setIdSubdivision(Long idSubdivision) {
        this.idSubdivision = idSubdivision;
    }

    public String getNameSubdivision() {
        return nameSubdivision;
    }

    public void setNameSubdivision(String nameSubdivision) {
        this.nameSubdivision = nameSubdivision;
    }

    public String getContactsSubdivision() {
        return contactsSubdivision;
    }

    public void setContactsSubdivision(String contactsSubdivision) {
        this.contactsSubdivision = contactsSubdivision;
    }

    public Long getSupervisorSubdivision() {
        return supervisorSubdivision;
    }

    public void setSupervisorSubdivision(Long supervisorSubdivision) {
        this.supervisorSubdivision = supervisorSubdivision;
    }

    @Override
    public String toString() {
        return "Subdivision{" +
                "idSubdivision=" + idSubdivision +
                ", nameSubdivision='" + nameSubdivision + '\'' +
                ", contactsSubdivision='" + contactsSubdivision + '\'' +
                ", supervisorSubdivision=" + supervisorSubdivision +
                '}';
    }
}
