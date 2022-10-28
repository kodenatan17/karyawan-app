package com.istidata.services;

import java.util.List; 
import java.util.Optional;

import javax.transaction.Transactional;

import com.istidata.entity.Karyawan;
import com.istidata.repository.KaryawanRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class KaryawanService {
    
    @Autowired
    private KaryawanRepo repo;

    public Iterable<Karyawan> findAll() {
        return repo.findAll();
    }

    public void addKaryawan(Karyawan karyawan) {
        repo.save(karyawan);
    }

    public void deleteByNik(long nik){
        repo.deleteById(nik);
    }

    public Optional<Karyawan> findByNik(long nik){
        return repo.findById(nik);
    }

    public void updateKaryawan(Karyawan karyawan){
        repo.save(karyawan);
    }

    public List<Karyawan> findByNama_Lengkap(String keyword){
        return repo.findByNama_lengkapContains(keyword);
    }
}
