/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.lapr2check;

import expo.model.CentroExposicoes;
import expo.ui.UtilizadorLoginDialogo;

/**
 *
 * @author Nuno
 */
public class LAPR2CHECK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            CentroExposicoes ce = new CentroExposicoes();
            
            UtilizadorLoginDialogo login = new UtilizadorLoginDialogo(ce);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
