/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seahub.trabajofinaltorneo.logica;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author tinov
 */
@Entity
public class Torneo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idTorneo")
    private Integer idTorneo;
    @Basic(optional = false)
    @Lob
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "pisos")
    private int pisos;
    @Basic(optional = false)
    @Column(name = "pisosTotales")
    private int pisosTotales;
    @Basic(optional = false)
    @Column(name = "vigente")
    private boolean vigente;
    @Basic(optional = false)
    @Column(name = "inscripcionVigente")
    private boolean inscripcionVigente;
    @JoinColumn(name = "idAdministrador", referencedColumnName = "idAdministrador")
    @ManyToOne(optional = false)
    private Administrador idAdministrador;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTorneo")
    private Collection<ParticipanteTorneo> participanteTorneoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTorneo")
    private Collection<Etapa> etapaCollection;

    public Torneo() {
    }

    public Torneo(Integer idTorneo) {
        this.idTorneo = idTorneo;
    }

    public Torneo(Integer idTorneo, String nombre, int pisos, int pisosTotales, boolean vigente , boolean inscripcionVigente) {
        this.idTorneo = idTorneo;
        this.nombre = nombre;
        this.pisos = pisos;
        this.pisosTotales = pisosTotales;
        this.vigente = vigente;
        this.inscripcionVigente = inscripcionVigente;
    }

    public Integer getIdTorneo() {
        return idTorneo;
    }

    public void setIdTorneo(Integer idTorneo) {
        this.idTorneo = idTorneo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getPisosTotales() {
        return pisosTotales;
    }

    public void setPisosTotales(int pisosTotales) {
        this.pisosTotales = pisosTotales;
    }

    public boolean getVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }
    
    public boolean getInscripcionVigente(){
        return inscripcionVigente;
    }
    
    public void setInscripcionVigente(boolean inscripcionVigente){
        this.inscripcionVigente = inscripcionVigente;
    }

    public Administrador getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Administrador idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public Collection<ParticipanteTorneo> getParticipanteTorneoCollection() {
        return participanteTorneoCollection;
    }

    public void setParticipanteTorneoCollection(Collection<ParticipanteTorneo> participanteTorneoCollection) {
        this.participanteTorneoCollection = participanteTorneoCollection;
    }

    public Collection<Etapa> getEtapaCollection() {
        return etapaCollection;
    }

    public void setEtapaCollection(Collection<Etapa> etapaCollection) {
        this.etapaCollection = etapaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTorneo != null ? idTorneo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Torneo)) {
            return false;
        }
        Torneo other = (Torneo) object;
        if ((this.idTorneo == null && other.idTorneo != null) || (this.idTorneo != null && !this.idTorneo.equals(other.idTorneo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "seahub.tournament.logica.Torneo[ idTorneo=" + idTorneo + " ]";
    }
    
}
