package com.flavio.ocp.chapter01.overloadingandoverriding;

public class BobcatKitten extends Bobcat {

  @Override
  public void findDen() { }

  public void findDen(boolean b) { }

  public int findden() throws Exception { return 0; }
}
