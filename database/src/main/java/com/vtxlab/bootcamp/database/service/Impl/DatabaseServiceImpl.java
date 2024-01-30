package com.vtxlab.bootcamp.database.service.Impl;

import org.springframework.stereotype.Service;
import com.vtxlab.bootcamp.database.model.Database;
import com.vtxlab.bootcamp.database.service.DatabaseService;

@Service
public class DatabaseServiceImpl implements DatabaseService{
  
  @Override
  public String getName(int index){
    return Database.getString(index);
  }

  @Override
  public void setName(int index, String name){
    Database.setString(index,name);
  }


}
