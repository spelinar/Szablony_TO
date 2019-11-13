/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;


public class singleton {
    private static volatile singleton instance;
    private singleton() {
    
}
    public static singleton getInstance(){
        if(instance == null)
            synchronized (singleton.class){
                if(instance ==null)
                    instance = new singleton();
            }
        return instance;
            }
    }
