/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex22;

/**
 *
 * @author Vinh Xo
 */
public abstract class Stringed extends Instrument{
     abstract void play();
    String what(){
        return "anywhere";
    }
    abstract void adjust();
}
