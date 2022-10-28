package com.istidata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="karyawan")
public class Karyawan {
    
    @Id
    private long nik;
    
    @Column(length=20, nullable = false)
    private String nama_lengkap;

    private String tanggal_lahir;
    private String jenis_kelamin;
    private String alamat;
    private String negara;

    public Karyawan() {

    }


    // public Karyawan(long nik, String nama_lengkap, String tanggal_lahir, String jenis_kelamin, String alamat,
    //         String negara) {
    //     this.nik = nik;
    //     this.nama_lengkap = nama_lengkap;
    //     this.tanggal_lahir = tanggal_lahir;
    //     this.jenis_kelamin = jenis_kelamin;
    //     this.alamat = alamat;
    //     this.negara = negara;
    // }

    public Long getNik() {
        return this.nik;
    }

    public void setNik(Long nik) {
        this.nik = nik;
    }

    public String getNama_lengkap() {
        return this.nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public String getTanggal_lahir() {
        return this.tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getJenis_kelamin() {
        return this.jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNegara() {
        return this.negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

}
