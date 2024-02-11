package com.vtxlab.bootcamp.infra;

public enum Scheme {
  
  HTTPS,HTTP;

  public String toLowerCase(){
    return this.name().toLowerCase(); // https, http
  }
  
}
