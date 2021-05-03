/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torres_tp6;

import torres_tp6.Entidades.Cliente;
import torres_tp6.Entidades.Directorio;

/**
 *
 * @author Jannete
 */
public class Torres_tp6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente a=new Cliente( "Juan", "Lopez", "San Luis", "Mitre 222", 34699832L);
        Cliente b=new Cliente( "Pepe", "Paez", "San Luis", "Sucre 123", 33256789L);
        Cliente c=new Cliente( "Ana", "Soloa", "San Luis", "Colon 263", 37213234L);
        
        Directorio dir=new Directorio();
        
        dir.agregarCliente(415677L,a);
        dir.agregarCliente(415677L,a);
        dir.agregarCliente(441267L,b);
        dir.agregarCliente(427831L,c);
        
        Cliente aa=dir.buscarCliente(415677L);
        System.out.println(aa.getNombre());
        dir.buscarTelefono("Paez");
        dir.buscarClientes("San Luis");
        dir.borrarCliente(37213234L);
        
    }
    
}
