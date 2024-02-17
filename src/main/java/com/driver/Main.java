package com.driver;

public class Main {
  public static class A{
      public String meth(){
          return "Iam in classA";
      }
  }
  public static class B extends A{
      public String meth(){
          return "Method is overridden in Extendend class B";
      }
  }

    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj.meth());
    }
}