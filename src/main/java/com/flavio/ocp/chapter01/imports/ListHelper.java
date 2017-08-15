package com.flavio.ocp.chapter01.imports;

import static java.util.Collections.sort;
//import static java.util.Collections.*;

import java.util.ArrayList;
import java.util.List;
//import java.util.*;


public class ListHelper {

  public List<String> copyAndSortList(List<String> original) {
    List<String> list = new ArrayList<String>(original);
    sort(list);
    return list;
  }
}
