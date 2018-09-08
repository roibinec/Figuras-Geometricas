/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author Roibin
 */
public class Rectangulo {
    private int punto1;
    private int punto2;
    private int punto3;
    private int punto4;
    
    public Rectangulo(){
        
    }

    public Rectangulo(int punto1, int punto2, int punto3, int punto4) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
    }

    public int getPunto1() {
        return punto1;
    }

    public int getPunto2() {
        return punto2;
    }

    public int getPunto3() {
        return punto3;
    }

    public int getPunto4() {
        return punto4;
    }

    public void setPunto1(int punto1) {
        this.punto1 = punto1;
    }

    public void setPunto2(int punto2) {
        this.punto2 = punto2;
    }

    public void setPunto3(int punto3) {
        this.punto3 = punto3;
    }

    public void setPunto4(int punto4) {
        this.punto4 = punto4;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "punto1=" + punto1 + ", punto2=" + punto2 + ", punto3=" + punto3 + ", punto4=" + punto4 + '}';
    }
    
    
    
    
}
