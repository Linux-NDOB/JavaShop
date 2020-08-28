
package Almacen;

import javax.swing.JOptionPane;


public class Instancia {
    
    private int unidades;
    
    private double valorPc;

    public Instancia() {
        unidades = 0;
         valorPc = 0;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getValorPc() {
        return valorPc;
    }

    public void setValorPc(double valorPc) {
        this.valorPc = valorPc;
    }
    
    public void solicitarDatos(){
        
    double aPagar;
    
    double valorDescuento = 0;
  
    
     double neto =0;
    
    unidades = Integer.parseInt(JOptionPane.showInputDialog(null, "porfavor ingrese las unidades a compar"));
    
    valorPc = 800000;
    
    aPagar = unidades*valorPc;
    
    if(unidades <5)
        valorDescuento = ((10*valorPc)/100);
    
    else if(unidades >=5 && unidades <10)
        valorDescuento = (20*valorPc)/100;
    
    else if(unidades >=10 )
        valorDescuento = (40*valorPc)/100;
    
    
    neto = aPagar-valorDescuento;
    
   
    
    JOptionPane.showMessageDialog(null, "lo que debe pagar el clientes es: " + neto);
    
    }
    
    
    
}
