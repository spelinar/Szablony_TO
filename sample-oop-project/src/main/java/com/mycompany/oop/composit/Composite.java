/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.composit;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author 4
 */
public class Composite extends Component {

  private List<Component> children = new ArrayList<Component>();

  public void operation() {

    for (Component component : children) {
      component.operation();
    }
  }

  public void add(Component component) {
    children.add(component);
  }

  public void remove(Component component) {
    children.remove(component);
  }

  public Component getChild(int index) {
    return children.get(index);
  }
    
}
