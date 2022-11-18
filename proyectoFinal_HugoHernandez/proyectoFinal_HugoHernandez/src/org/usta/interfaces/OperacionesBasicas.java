
package org.usta.interfaces;

import java.util.List;

public interface OperacionesBasicas<T> {
    
    public Boolean agregar(T miObjeto);
    
    public List<T> consultar(String orden);
    
    public  Boolean eliminar(T miObjeto);
    
    public  Boolean actualizar(T miObjeto);
    
    public  T  buscar(Integer llavePrimaria);
    
    public Integer cantidadFilas();
    
}
