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
public class Kalkulator {

    private Integer num1; 
    private Integer num2;
    private Integer hasil = 0;

    public Integer getHasil() {
        return hasil;
    }

    public void setHasil(Integer hasil) {
        this.hasil = hasil;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }
    
    
    
    /** Creates a new instance of Kalkulator */
    public Kalkulator() {
    }
    
        
    public void hitung(){
        hasil = num1 + num2;
    }

}
