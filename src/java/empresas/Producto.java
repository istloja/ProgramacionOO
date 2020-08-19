/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresas;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
    , @NamedQuery(name = "Producto.findByPunidad", query = "SELECT p FROM Producto p WHERE p.punidad = :punidad")
    , @NamedQuery(name = "Producto.findByDescripcion", query = "SELECT p FROM Producto p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Producto.findByDimension", query = "SELECT p FROM Producto p WHERE p.dimension = :dimension")
    , @NamedQuery(name = "Producto.findByDni", query = "SELECT p FROM Producto p WHERE p.dni = :dni")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 20)
    @Column(name = "P_unidad")
    private String punidad;
    @Size(max = 20)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 20)
    @Column(name = "dimension")
    private String dimension;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "dni")
    private Integer dni;

    public Producto() {
    }

    public Producto(Integer dni) {
        this.dni = dni;
    }

    public String getPunidad() {
        return punidad;
    }

    public void setPunidad(String punidad) {
        this.punidad = punidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dni != null ? dni.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.dni == null && other.dni != null) || (this.dni != null && !this.dni.equals(other.dni))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "empresas.Producto[ dni=" + dni + " ]";
    }
    
}
