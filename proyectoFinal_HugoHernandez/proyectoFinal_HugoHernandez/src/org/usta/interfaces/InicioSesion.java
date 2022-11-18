
package org.usta.interfaces;




public interface InicioSesion<T> {
    
    
    public Boolean verificar(T miObjeto);
    
    public T buscarPorCorreo(String elCorreo);
    
    
    
}
