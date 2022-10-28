package com.istidata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.istidata.dto.SearchFormData;
import com.istidata.entity.Karyawan;
import com.istidata.services.KaryawanService;;

@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    private KaryawanService karyawanService;

    @GetMapping
    public String welcome(Model model) {
        model.addAttribute("searchForm", new SearchFormData());
        model.addAttribute("karyawan", karyawanService.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("karyawan", new Karyawan());
        return "add";
    }

    @PostMapping("/save")
    public String save(Karyawan karyawan, Model model) {
        karyawanService.addKaryawan(karyawan);
        return "redirect:/";
    }

    @GetMapping("/delete/{nik}")
    public String delete(@PathVariable("nik") long nik) {
        karyawanService.deleteByNik(nik);
        return "redirect:/";
    }

    @GetMapping("/edit/{nik}")
    public String edit(@PathVariable("nik") long nik, Model model) {
        model.addAttribute("karyawan", karyawanService.findByNik(nik));
        return "edit";
    }

    @PostMapping("/update")
    public String update(Karyawan karyawan, Model model) {
        karyawanService.updateKaryawan(karyawan);
        return "redirect:/";
    }

    @PostMapping("/search")
    public String search(SearchFormData searchFormData, Model model){
        model.addAttribute("searchForm", searchFormData);
        model.addAttribute("karyawan", karyawanService.findByNama_Lengkap(searchFormData.getKeyword()));
        return "index";
    }

}
