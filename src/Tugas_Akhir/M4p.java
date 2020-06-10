/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Akhir;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "m4p", catalog = "project_m4p", schema = "")
@NamedQueries({
    @NamedQuery(name = "M4p.findAll", query = "SELECT m FROM M4p m"),
    @NamedQuery(name = "M4p.findByHari", query = "SELECT m FROM M4p m WHERE m.hari = :hari"),
    @NamedQuery(name = "M4p.findByJamMasuk", query = "SELECT m FROM M4p m WHERE m.jamMasuk = :jamMasuk"),
    @NamedQuery(name = "M4p.findByPelajaran", query = "SELECT m FROM M4p m WHERE m.pelajaran = :pelajaran"),
    @NamedQuery(name = "M4p.findByRuangan", query = "SELECT m FROM M4p m WHERE m.ruangan = :ruangan"),
    @NamedQuery(name = "M4p.findByKelas", query = "SELECT m FROM M4p m WHERE m.kelas = :kelas")})
public class M4p implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Hari")
    private String hari;
    @Basic(optional = false)
    @Column(name = "Jam_Masuk")
    private String jamMasuk;
    @Id
    @Basic(optional = false)
    @Column(name = "Pelajaran")
    private String pelajaran;
    @Basic(optional = false)
    @Column(name = "Ruangan")
    private String ruangan;
    @Basic(optional = false)
    @Column(name = "Kelas")
    private String kelas;

    public M4p() {
    }

    public M4p(String pelajaran) {
        this.pelajaran = pelajaran;
    }

    public M4p(String pelajaran, String hari, String jamMasuk, String ruangan, String kelas) {
        this.pelajaran = pelajaran;
        this.hari = hari;
        this.jamMasuk = jamMasuk;
        this.ruangan = ruangan;
        this.kelas = kelas;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        String oldHari = this.hari;
        this.hari = hari;
        changeSupport.firePropertyChange("hari", oldHari, hari);
    }

    public String getJamMasuk() {
        return jamMasuk;
    }

    public void setJamMasuk(String jamMasuk) {
        String oldJamMasuk = this.jamMasuk;
        this.jamMasuk = jamMasuk;
        changeSupport.firePropertyChange("jamMasuk", oldJamMasuk, jamMasuk);
    }

    public String getPelajaran() {
        return pelajaran;
    }

    public void setPelajaran(String pelajaran) {
        String oldPelajaran = this.pelajaran;
        this.pelajaran = pelajaran;
        changeSupport.firePropertyChange("pelajaran", oldPelajaran, pelajaran);
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        String oldRuangan = this.ruangan;
        this.ruangan = ruangan;
        changeSupport.firePropertyChange("ruangan", oldRuangan, ruangan);
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        String oldKelas = this.kelas;
        this.kelas = kelas;
        changeSupport.firePropertyChange("kelas", oldKelas, kelas);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pelajaran != null ? pelajaran.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof M4p)) {
            return false;
        }
        M4p other = (M4p) object;
        if ((this.pelajaran == null && other.pelajaran != null) || (this.pelajaran != null && !this.pelajaran.equals(other.pelajaran))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tugas_Akhir.M4p[ pelajaran=" + pelajaran + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
