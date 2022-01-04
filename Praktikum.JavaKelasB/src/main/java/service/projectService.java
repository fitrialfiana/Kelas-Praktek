/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;

/**
 *
 * @author fiezi
 */
public class projectService {
    //jika string biasa bisa dengan script ini
    public String name = "Prasetya";
    
    public ArrayList<String> tabel()
    {
        //inisalisasi array list baru, 
        //dimana itu yang akan diambil saat mengakses array list
        ArrayList<String> data = new ArrayList<>();
        
        //Menambah data
        data.add("Gelas");
        data.add("Sendok");
        data.add("Piring");
        data.add("Meja");
        data.add("Kursi");
        data.add("Lemari");
        
        return data;
  
    }
    
}
