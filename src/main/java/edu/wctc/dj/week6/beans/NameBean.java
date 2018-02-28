package edu.wctc.dj.week6.beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.wctc.dj.week6.model.Name;
import edu.wctc.dj.week6.model.NameService;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author L117student
 */
@Named(value = "nameBean")
@SessionScoped
public class NameBean implements Serializable {

    private final NameService nameService = new NameService();
    private Name name;
    private List<Name> nameList;

    public NameBean() {
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public List<Name> getNameList() {
        return nameList;
    }

    public void setNameList(List<Name> nameList) {
        this.nameList = nameList;
    }

}
