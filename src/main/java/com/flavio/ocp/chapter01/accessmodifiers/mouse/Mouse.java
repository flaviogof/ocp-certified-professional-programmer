package com.flavio.ocp.chapter01.accessmodifiers.mouse;

import com.flavio.ocp.chapter01.accessmodifiers.cat.BigCat;

public class Mouse {

  public static void main(String[] args) {
    BigCat cat = new BigCat();
    System.out.println(cat.name);
    //System.out.println(cat.hasFur); protected
    //System.out.println(cat.hasPaws); default
    //System.out.println(cat.id); private
  }

}
