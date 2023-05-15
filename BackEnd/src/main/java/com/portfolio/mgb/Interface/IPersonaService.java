package com.portfolio.mgb.Interface;

import com.portfolio.mgb.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    /*traer una lista de personas*/ 
    public List<Persona> getPersona();
    
    // guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    

    // Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    // Buscar uina persona por ID
    public Persona findPersona(Long id);
    
}
