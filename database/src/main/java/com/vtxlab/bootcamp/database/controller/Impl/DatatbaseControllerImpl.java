package com.vtxlab.bootcamp.database.controller.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vtxlab.bootcamp.database.controller.DatabaseController;
import com.vtxlab.bootcamp.database.service.DatabaseService;

@RestController
@RequestMapping(value ="/api/v1")
public class DatatbaseControllerImpl implements DatabaseController{

  @Autowired
  private DatabaseService databaseService;

  public String getName(int index){
    return databaseService.getName(index);
  }

  public void setName(int index, String name){
    databaseService.setName(index, name);
  }
  
  
}
