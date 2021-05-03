package torres_tp6.Entidades;

import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import torres_tp6.Entidades.Cliente;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jannete
 */
public class Directorio {
    private TreeMap<Long,Cliente>clientes=new TreeMap<>();

    public Directorio() {
    }
  //que permite registrar un nuevo cliente con su respectivo nro de teléfono. Siendo el nro del teléfono la clave del mismo.         
   public int agregarCliente(Long tel, Cliente c ){
       
       if(clientes.put(tel, c)==null){
           return 1;
       }
       
       
       return 0;
   }
   //que en base al nro de teléfono retorna el Cliente asociado al mismo.
   public Cliente buscarCliente(Long tel) {
       
       
     return clientes.get(tel);
   }  
   public TreeMap<Long,Cliente> buscarClienteDni(Long dni){
       
       TreeMap<Long,Cliente>cli=new TreeMap<>();
       
       Set<Long> claves=clientes.keySet();// Key: seria iter
       
       for(Long key:claves){
           if(clientes.get(key).getDni().equals(dni)){
            cli.put(key, clientes.get(key));   
           }
       }
       return cli;
   }
   
   // que en base a un apellido nos devuelve una lista con los nros de teléfono asociados a dicho apellido. 
   public Set<Long> buscarTelefono(String apellido){
       Set<Long>telefono=new HashSet<>();
       
       Set<Long> claves=clientes.keySet();// Key: seria iter
       
       for(Long key:claves){
           if(clientes.get(key).getApellido().equals(apellido)){
               telefono.add(key);
           }
       }
       
       return telefono;
   }
   //que en base a una ciudad nos devuelve una lista con los Clientes asociados a dicha ciudad. 
   
    public List<Cliente> buscarClientes(String ciudad){

        List<Cliente>listaClientes=new ArrayList<>();//Esta es la lista que vas a devolver al final

        Set<Long>tel=clientes.keySet();//este otro son las keys que vas a usar en el foreach 

        for(Long key:tel){//el foreach
            if(clientes.get(key).getCiudad().equals(ciudad)){
                 listaClientes.add(clientes.get(key));//'get' para obtener el Cliente que corresponde a esa key
           }
       }

        return listaClientes;//devolver los datos requeridos
}
   
   //que en base a un dni elimina el cliente del directorio
   public TreeMap<Long, Cliente> borrarCliente(Long dni){
       
       TreeMap<Long,Cliente> cli = new TreeMap<>();
       
       Set<Long>tel=clientes.keySet();
       
       for(Long key:tel){
           if(clientes.get(key).getDni().equals(dni)){
               cli.put(key, clientes.get(key));//"cli" le estoy asignando el tel y el cliente que tienen el mismo dni que me pasan(lo guardo)
           clientes.remove(cli.firstKey());//ES UNA FORMA DE ACCEDER AL MAP
           }
           
       }
       
        return cli;
   }
}
