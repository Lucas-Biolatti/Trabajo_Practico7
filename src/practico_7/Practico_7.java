package practico_7;

public class Practico_7 {

    public static void main(String[] args) {
        //CLIENTES
      Cliente lucas=new Cliente("lucas","biolatti","san luis","uocra",35675927);
      Cliente abc=new Cliente("abc","def","naschel","modulo 6",35000000);
     //DIRECTORIO
      Directorio d=new Directorio();
      //AGREGANDO CLIENTE A DIRECTORIO
      d.agregarCliente(Long.parseLong("2664894715"), lucas);
      d.agregarCliente(Long.parseLong("123456789"), abc);
        
      //BUSCAR TELEFONO
        
      System.out.println("buscarCliente(telefono): "+d.buscarCliente(123456789));
      System.out.println("buscarTelefono(apellido): "+d.buscarTelefono("biolatti"));
      System.out.println("buscarClientes(ciudad): "+d.buscarClientes("san luis"));
      d.borrarCliente(35675927);
      System.out.println(d.cliente);
     System.out.println("buscarCliente(telefono): "+d.buscarCliente(35675927));
    }
}
