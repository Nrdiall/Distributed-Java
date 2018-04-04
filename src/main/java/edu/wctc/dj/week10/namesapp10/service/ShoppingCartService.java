/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.dj.week10.namesapp10.service;

import edu.wctc.dj.week10.namesapp10.model.ShoppingCart;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author L117student
 */
@Service
@Transactional
public class ShoppingCartService {
    private static final Map<String, ShoppingCart> contents = new HashMap<>();
    public ShoppingCart getContents(String sessionId){
        ShoppingCart cart = contents.computeIfAbsent(sessionId, (String s) -> new ShoppingCart());
        return cart;
    }
    public void update(String sessionId, ShoppingCart cart){
        contents.put(sessionId, cart);
    }
    public void delete(String sessionId){
        contents.remove(sessionId);
    }

}
