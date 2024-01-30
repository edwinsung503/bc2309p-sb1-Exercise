package com.vtxlab.bootcamp.database.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface DatabaseController {

  @GetMapping(value = "/db/idx/{idx}")
  String getName(@PathVariable(name="idx") int indext);

  
  @GetMapping(value = "/db/idx/{idx}/name/{name}")
  void setName(@PathVariable(name = "idx") int index,
              @PathVariable(name="name") String name);
}
