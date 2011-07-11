/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author endy
 */
@ManagedBean
@RequestScoped
public class Kontak {

    public String simpan(){
        System.out.println("Menyimpan data kontak");
        return "list?faces-redirect=true";
    }
    
    /** Creates a new instance of Kontak */
    public Kontak() {
    }
}
