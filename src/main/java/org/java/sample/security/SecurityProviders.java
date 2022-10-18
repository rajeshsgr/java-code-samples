package org.java.sample.security;

import java.security.Provider;
import java.security.Security;
import java.util.Enumeration;


// This class print out all security providers on your JRE
public class SecurityProviders {
  public static void main(String[] args) throws Exception {
    try {
      Provider p[] = Security.getProviders();
      for (int i = 0; i < p.length; i++) {
          System.out.println(p[i]);
          for (Enumeration e = p[i].keys(); e.hasMoreElements();)
              System.out.println("\t" + e.nextElement());
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}