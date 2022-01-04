/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ti.umy.Praktikum.JavaKelasB;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import kelas service ke kelas controller
import service.projectService;
/**
 *
 * @author fiezi
 */
@Controller
public class fileController {
    //jika inisialisasi di dalam method, hanya bisa di akses oleh method  itu
    //method lain harus buat inisialisasi di dalam method lain
    //dibuat inisialisasi diluar method, jika digunakan beberapa kali method.
    projectService serv = new projectService();
    
    @RequestMapping("/hello")
    @ResponseBody
    
    public String getGreeting()
    {
        //menambahkan inisialisasi dari kelas projectService
        return "Hello World!!!";
    }
    
    
    @RequestMapping("/viewUtility")
    @ResponseBody

    public ArrayList<String> getDataUtil()
    {
        //langsung panggil kelas.nama method
        return serv.tabel();
    }


//fungsi controller : mengatur kemana
//tapi proses di dalamnya, diatur oleh service
//Menampilkan


    @RequestMapping("/tampilkandata")
    public String tampil(Model kurir)
    //Mode berfungsi sebagai kurir.
    //Ketika ingin mengirimkan data, harus ada pengirimnya
    // Model akan mengirimkan, isinya ada di dalam method, tujuannya adalah bagian return        
    
    {
        
    //Jika kurir, harus beri tahu paket apa yang akan dikirimkan
    //contohnya mengambil method service
    // Cara
    // 1. Inisiliasi array list baru
        ArrayList<String> paket = new ArrayList();
        
        //Inisialisasi nama paket
        paket = serv.tabel();
        
        //proses pengiriman
        //kurir akan meminta
        //isi paket dari projectService
        kurir.addAttribute("alatmakan", paket); //mengirim data yang ada di array list //nama th each sama.
        
        //cara mengambil paket yang sudah dikirim?
        
        //jika panggil tampil data, maka panggil nama file html
        return "viewData"; //dalam tanda petik adalah nama filenya.
        
    }
}