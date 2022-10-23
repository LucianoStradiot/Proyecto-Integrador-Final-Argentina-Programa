/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.portfolio.ls.Service;

import com.portfolio.ls.Entity.Acercade;
import com.portfolio.ls.Repository.RAcercade;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service    
@Transactional
public class SAcercade {
    @Autowired
    RAcercade rAcercade;
    
    public List<Acercade> list(){
        return rAcercade.findAll();
    }
    
    public Optional<Acercade> getOne(int id){
        return rAcercade.findById(id);
    }
    
    public void save(Acercade acercade){
        rAcercade.save(acercade);
    }
    
    public void delete(int id){
        rAcercade.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rAcercade.existsById(id);
    }
    
}
