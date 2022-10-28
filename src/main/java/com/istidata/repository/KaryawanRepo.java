package com.istidata.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.istidata.entity.Karyawan;

public interface KaryawanRepo extends CrudRepository<Karyawan, Long> {
    
    List<Karyawan> findByNama_lengkapContains(String nama_lengkap);
}
