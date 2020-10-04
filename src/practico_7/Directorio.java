
package practico_7;

import java.util.*;

public class Directorio {
    
    Map<Long,Cliente> cliente=new TreeMap<>();
    
    public void agregarCliente(Long tel,Cliente c){
    cliente.put(tel, c);
     }
    
    public Cliente buscarCliente(long tel){
    if(cliente.containsKey(tel)){return cliente.get(tel);}
    else return null;
    }
    
    public Set<Long> buscarTelefono(String ap){
    HashSet<Long> telefonos=new HashSet<>();

    for(Long tel : cliente.keySet()){
   Cliente c=cliente.get(tel);
   if(c.getApellido().equals(ap)){
   telefonos.add(tel);
   }
   }
    return telefonos;
    
    
    }
    
    public List<Cliente> buscarClientes(String ciudad){
    ArrayList<Cliente> cli=new ArrayList<>();
   
    for(Long c : cliente.keySet()){
    Cliente ciu=cliente.get(c);
            if(ciu.getCiudad().equals(ciudad)){
            cli.add(ciu);
           }
        
    }
            
    return cli;
    
    }
    
    public void borrarCliente(long documento){
        
     /*for(Map.Entry<Long,Cliente> entry : cliente.entrySet()){
       Cliente c=entry.getValue();
      long clave=entry.getKey();
      
      if( c.getDni() == documento){
        cliente.remove(clave);
        break;
        }
            
      }*/
     Set<Long> claves=cliente.keySet();
     Iterator<Long> it=claves.iterator();
        long c=0;
        while(it.hasNext()){
        c=it.next();
        
            if(cliente.get(c).getDni()==documento){
            cliente.remove(c);
             }
         
         }
      
      
      
        }
       
       
        
    
    
}
