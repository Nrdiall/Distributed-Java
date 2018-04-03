/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.dj.week10.model;

import edu.wctc.dj.week10.data.AddressDAO;
import edu.wctc.dj.week10.data.NameDAO;
import java.util.List;

/**
 *
 * @author L117student
 */
public class NameService {
    public Name getName(String id){
        return null;
    }
    
    public List<Name> getAllNames()throws Exception{
        NameDAO nameDao = new NameDAO();
        List<Name> nameList = nameDao.getNames();
        if(nameList!=null){
            AddressDAO addressDao = new AddressDAO();
            for(Name name : nameList){
                name.setAddress(addressDao.getAddress(name));
            }
        }
        return nameList;
    }
    
    public List<Name> findNames(String search){
        return null;
    }
}
