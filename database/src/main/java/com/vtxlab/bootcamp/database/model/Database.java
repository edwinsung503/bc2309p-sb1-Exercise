package com.vtxlab.bootcamp.database.model;

public class Database {
  
  private static final int dbLength = 100;
  private static String [] strings = new String[dbLength];

  static {
    strings[0]="edwin";
  }

  public static String getString(int index){
    if (index < 0 || index > dbLength - 1 ){
      throw new IllegalArgumentException();
    }
    return strings[index];
  }

  public static String setString(int index, String name){
    if (index < 0 || index > dbLength - 1 ){
      throw new IllegalArgumentException();
    }
    return strings[index] = name;
  }
}
