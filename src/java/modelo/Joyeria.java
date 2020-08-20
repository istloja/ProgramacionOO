/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
 * @author Anthony Mendieta
 */
@Entity
@Table(name = "joyeria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joyeria.findAll", query = "SELECT j FROM Joyeria j")
    , @NamedQuery(name = "Joyeria.findByIdJoyeria", query = "SELECT j FROM Joyeria j WHERE j.idJoyeria = :idJoyeria")
    , @NamedQuery(name = "Joyeria.findByNombreJoyaria", query = "SELECT j FROM Joyeria j WHERE j.nombreJoyaria = :nombreJoyaria")
    , @NamedQuery(name = "Joyeria.findByUbicacion", query = "SELECT j FROM Joyeria j WHERE j.ubicacion = :ubicacion")
    , @NamedQuery(name = "Joyeria.findByDireccion", query = "SELECT j FROM Joyeria j WHERE j.direccion = :direccion")
    , @NamedQuery(name = "Joyeria.findByTelefono", query = "SELECT j FROM Joyeria j WHERE j.telefono = :telefono")
    , @NamedQuery(name = "Joyeria.findByNombreencargado", query = "SELECT j FROM Joyeria j WHERE j.nombreencargado = :nombreencargado")
    , @NamedQuery(name = "Joyeria.findByDimensionlocal", query = "SELECT j FROM Joyeria j WHERE j.dimensionlocal = :dimensionlocal")})
public class Joyeria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idJoyeria")
    private Integer idJoyeria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NombreJoyaria")
    private String nombreJoyaria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Ubicacion")
    private String ubicacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Telefono")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nombreencargado")
    private String nombreencargado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "dimensionlocal")
    private String dimensionlocal;

    public Joyeria() {
    }

    public Joyeria(Integer idJoyeria) {
        this.idJoyeria = idJoyeria;
    }

    public Joyeria(Integer idJoyeria, String nombreJoyaria, String ubicacion, String direccion, String telefono, String nombreencargado, String dimensionlocal) {
        this.idJoyeria = idJoyeria;
        this.nombreJoyaria = nombreJoyaria;
        this.ubicacion = ubicacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombreencargado = nombreencargado;
        this.dimensionlocal = dimensionlocal;
    }

    public Integer getIdJoyeria() {
        return idJoyeria;
    }

    public void setIdJoyeria(Integer idJoyeria) {
        this.idJoyeria = idJoyeria;
    }

    public String getNombreJoyaria() {
        return nombreJoyaria;
    }

    public void setNombreJoyaria(String nombreJoyaria) {
        this.nombreJoyaria = nombreJoyaria;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreencargado() {
        return nombreencargado;
    }

    public void setNombreencargado(String nombreencargado) {
        this.nombreencargado = nombreencargado;
    }

    public String getDimensionlocal() {
        return dimensionlocal;
    }

    public void setDimensionlocal(String dimensionlocal) {
        this.dimensionlocal = dimensionlocal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJoyeria != null ? idJoyeria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joyeria)) {
            return false;
        }
        Joyeria other = (Joyeria) object;
        if ((this.idJoyeria == null && other.idJoyeria != null) || (this.idJoyeria != null && !this.idJoyeria.equals(other.idJoyeria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Joyeria[ idJoyeria=" + idJoyeria + " ]";
    }
    
}
