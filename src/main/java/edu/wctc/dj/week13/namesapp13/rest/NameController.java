/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.dj.week13.namesapp13.rest;

import edu.wctc.dj.week13.namesapp13.model.Name;
import edu.wctc.dj.week13.namesapp13.service.NameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author L117student
 */
@RestController
public class NameController {
    
    @Autowired
    private NameService nameService;
    
    @RequestMapping(method = POST, path = "/name")
    public Name createName(@RequestBody Name name){
        return nameService.createName(name);
    }
    
        @RequestMapping(method = PUT, path = "/name")
    public Name updateName(@RequestBody Name name){
        return nameService.createName(name);
    }
    
    @RequestMapping(method = GET, path = "/name")
    public List<Name> getNameList()throws Exception{
        return nameService.getAllNames();
    }
    
    @RequestMapping(method = GET, path = "/name/{id}")
    public Name getName(@PathVariable String id){
        Name name = nameService.getName(id);
        return name;
    }
    
    @RequestMapping(method = DELETE, path = "/name/{id}")
    public void deleteName(@PathVariable String id){
        nameService.deleteName(id);
    }
   
}
