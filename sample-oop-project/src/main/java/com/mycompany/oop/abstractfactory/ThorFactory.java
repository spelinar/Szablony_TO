/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.abstractfactory;

/**
 *
 * @author 4
 */
public class ThorFactory implements HeroFactory{
    @Override
    public Weapon getWeapon() {
        return new Hammer();
    }
 
    @Override
    public SuperPower getSuperPower() {
        return new Immortal();
    }
}
