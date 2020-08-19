/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresas;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e")
    , @NamedQuery(name = "Empresa.findByPiso", query = "SELECT e FROM Empresa e WHERE e.piso = :piso")
    , @NamedQuery(name = "Empresa.findByCalle", query = "SELECT e FROM Empresa e WHERE e.calle = :calle")
    , @NamedQuery(name = "Empresa.findByCodPostal", query = "SELECT e FROM Empresa e WHERE e.codPostal = :codPostal")})
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 20)
    @Column(name = "piso")
    private String piso;
    @Size(max = 20)
    @Column(name = "calle")
    private String calle;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cod_postal")
    private String codPostal;
    @OneToMany(mappedBy = "direccion")
    private Collection<Tienda> tiendaCollection;

    public Empresa() {
    }

    public Empresa(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    @XmlTransient
    public Collection<Tienda> getTiendaCollection() {
        return tiendaCollection;
    }

    public void setTiendaCollection(Collection<Tienda> tiendaCollection) {
        this.tiendaCollection = tiendaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPostal != null ? codPostal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.codPostal == null && other.codPostal != null) || (this.codPostal != null && !this.codPostal.equals(other.codPostal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "empresas.Empresa[ codPostal=" + codPostal + " ]";
    }
    
}
