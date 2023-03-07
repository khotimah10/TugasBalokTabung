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
public class Balok extends PersegiPanjang {
    public double VolBalok (double p, double l, double t){
        double volbalok;
        volbalok = luasPersegiPanjang(p,l)*t;
        return volbalok;
    }
}
