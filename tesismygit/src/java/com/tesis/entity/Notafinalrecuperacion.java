/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tesis.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mario Jurado
 */
@Entity
@Table(name = "notafinalrecuperacion", catalog = "prueba", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notafinalrecuperacion.findAll", query = "SELECT n FROM Notafinalrecuperacion n"),
    @NamedQuery(name = "Notafinalrecuperacion.findByNotafinalrecuperacionId", query = "SELECT n FROM Notafinalrecuperacion n WHERE n.notafinalrecuperacionId = :notafinalrecuperacionId"),
    @NamedQuery(name = "Notafinalrecuperacion.findByValor", query = "SELECT n FROM Notafinalrecuperacion n WHERE n.valor = :valor"),
    @NamedQuery(name = "Notafinalrecuperacion.findByFechamodificacion", query = "SELECT n FROM Notafinalrecuperacion n WHERE n.fechamodificacion = :fechamodificacion"),
    @NamedQuery(name = "Notafinalrecuperacion.findByObservaciones", query = "SELECT n FROM Notafinalrecuperacion n WHERE n.observaciones = :observaciones")})
public class Notafinalrecuperacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "notafinalrecuperacion_id", nullable = false)
    private Integer notafinalrecuperacionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor", nullable = false)
    private int valor;
    @Column(name = "fechamodificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechamodificacion;
    @Size(max = 2147483647)
    @Column(name = "observaciones", length = 2147483647)
    private String observaciones;
    @JoinColumn(name = "profesor_id", referencedColumnName = "profesor_id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Profesor profesorId;
    @JoinColumn(name = "estudiante_id", referencedColumnName = "estudiante_id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Estudiante estudianteId;
    @JoinColumn(name = "asignaturaciclo_id", referencedColumnName = "asignaturaciclo_id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Asignaturaciclo asignaturacicloId;

    public Notafinalrecuperacion() {
    }

    public Notafinalrecuperacion(Integer notafinalrecuperacionId) {
        this.notafinalrecuperacionId = notafinalrecuperacionId;
    }

    public Notafinalrecuperacion(Integer notafinalrecuperacionId, int valor) {
        this.notafinalrecuperacionId = notafinalrecuperacionId;
        this.valor = valor;
    }

    public Integer getNotafinalrecuperacionId() {
        return notafinalrecuperacionId;
    }

    public void setNotafinalrecuperacionId(Integer notafinalrecuperacionId) {
        this.notafinalrecuperacionId = notafinalrecuperacionId;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Date getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(Date fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Profesor getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(Profesor profesorId) {
        this.profesorId = profesorId;
    }

    public Estudiante getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Estudiante estudianteId) {
        this.estudianteId = estudianteId;
    }

    public Asignaturaciclo getAsignaturacicloId() {
        return asignaturacicloId;
    }

    public void setAsignaturacicloId(Asignaturaciclo asignaturacicloId) {
        this.asignaturacicloId = asignaturacicloId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notafinalrecuperacionId != null ? notafinalrecuperacionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notafinalrecuperacion)) {
            return false;
        }
        Notafinalrecuperacion other = (Notafinalrecuperacion) object;
        if ((this.notafinalrecuperacionId == null && other.notafinalrecuperacionId != null) || (this.notafinalrecuperacionId != null && !this.notafinalrecuperacionId.equals(other.notafinalrecuperacionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tesis.entity.Notafinalrecuperacion[ notafinalrecuperacionId=" + notafinalrecuperacionId + " ]";
    }
    
}
