/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion3;

/**
 *
 * @author ALEJANDRO
 */
public class Logica {
    
    private double valor1;
    private double valor2;
    
    private JTextField txtValor1;
    private JTextField txtValor2;
    
    public Logica(JTextField txtValor1,JTextField txtValor2){
        this.txtValor1 = txtValor1;
        this.txtValor2 = txtValor2;
    }
    private void convertir (){
        this.valor1 = getNumeroDesdeTextField(txtValor1);
        this.valor2 = getNumeroDesdeTextField(txtValor2);
}
    }
    public double restar(){
    return valor1 - valor2;
    }
    
    public double sumar(){
    convertir ();
    return valor1 + valor2;
    }
    
    public double multiplicar(){
    convertir ();
    return valor1 * valor2;
    }
    
    public double dividir(){
    convertir ();
    return valor1 / valor2;
    }
    
     private double getNumero(String s){
       return Double.parseDouble(s);
    }
    
    private double getNumeroDesdeTextField(JTextField text){
            String valor1 = text.getText();
            return getNumero(valor1);
    
    }
}
