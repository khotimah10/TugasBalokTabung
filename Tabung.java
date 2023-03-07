/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbaloktabung;

/**
 *
 * @author ASUS
 */
public class Tabung extends Lingkaran {
    @Override
    public double VolTabung(double r, double t){
        double voltabung ;
        voltabung = luasLing(r) * t;
        return voltabung;
    }
}