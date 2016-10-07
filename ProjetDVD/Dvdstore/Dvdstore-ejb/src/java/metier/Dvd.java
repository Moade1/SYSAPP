/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import javax.ejb.Stateless;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author khlifim
 */
@Stateless
public class Dvd implements DvdLocal {
          @Id  //code clé primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long code;
        private double Prix;
	private int quantiteEnStock;

    public Dvd (){}
                
    public Dvd(double Prix, int quantiteEnStock) {
        this.Prix = Prix;
        this.quantiteEnStock = quantiteEnStock;
    }         
        
    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }

    public void setQuantiteEnStock(int quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }
	
   
        
        
}
