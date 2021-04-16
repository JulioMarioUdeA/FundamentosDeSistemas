package com.app;

import com.demo.Cliente;
import com.demo.Vendedor;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSOnPrueba {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor();
        v1.setNombre("Juan");
        v1.setApellido("Perez");
        v1.setEdad(10);
        Cliente c1 = new Cliente();
        c1.setNombre("HIVYMAR");
        c1.setDireccion("Victor Emilio Estrada 204");
        c1.setTelefono("5020800");
        Cliente c2 = new Cliente();
        c2.setNombre("PROMESA");
        c2.setDireccion("Via. Daule KM 5.5");
        c2.setTelefono("5013604");
        Cliente c3 = new Cliente();
        c3.setNombre("ARISTOCRATICO");
        c3.setDireccion("calle 18 23 - 32 Fontibon");
        c3.setTelefono("5013344");
        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

        Vendedor v2 = new Vendedor();
        v2.setNombre("Sancho");
        v2.setApellido("Panza");
        v2.setEdad(45);
        Cliente c12 = new Cliente();
        c12.setNombre("ORLANDINO");
        c12.setDireccion("Plaza sezamo 23 - 4");
        c12.setTelefono("5320800");
        Cliente c22 = new Cliente();
        c22.setNombre("JULIO");
        c22.setDireccion("cra 6 16 - 32");
        c22.setTelefono("5014024");
        Cliente c32 = new Cliente();
        c32.setNombre("ARISTOBULO");
        c32.setDireccion("calle niga gta - v");
        c32.setTelefono("4013344");
        List<Cliente> clientes2 = new ArrayList<Cliente>();
        clientes2.add(c12);
        clientes2.add(c22);
        clientes2.add(c32);

        Vendedor v3 = new Vendedor();
        v3.setNombre("Speddy");
        v3.setApellido("Gonzalez");
        v3.setEdad(46);
        Cliente c13 = new Cliente();
        c13.setNombre("TONY");
        c13.setDireccion("Torre Stark avenida Stark");
        c13.setTelefono("3020800");
        Cliente c23 = new Cliente();
        c23.setNombre("CLARK");
        c23.setDireccion("Palacio de cristal barrio Waves");
        c23.setTelefono("3013604");
        Cliente c33 = new Cliente();
        c33.setNombre("BILBO");
        c33.setDireccion("Bolson cerrado - comarca 12");
        c33.setTelefono("3013344");
        List<Cliente> clientes3 = new ArrayList<Cliente>();
        clientes3.add(c13);
        clientes3.add(c23);
        clientes3.add(c33);

        //CREAMOS EL OBJETO JSON
        JSONObject objVendedor = new JSONObject(v1);
        JSONObject objVendedor2 = new JSONObject(v2);
        JSONObject objVendedor3 = new JSONObject(v3);

        JSONArray objClientes = new JSONArray();
        JSONArray objClientes2 = new JSONArray();
        JSONArray objClientes3 = new JSONArray();


        try {
            for (Cliente cliente : clientes) {
                JSONObject objCliente = new JSONObject();
                objCliente.put("nombre", cliente.getNombre());
                objCliente.put("direccion", cliente.getDireccion());
                objCliente.put("telefono", cliente.getTelefono());
                objClientes.put(objCliente);
            }
            JSONObject objVendedorClientes = new JSONObject();
            objVendedorClientes.put("vendedor", objVendedor);
            objVendedorClientes.put("clientes", objClientes);
            //System.out.println(objVendedorClientes.toString(4));

            for (Cliente cliente : clientes2) {
                JSONObject objCliente = new JSONObject();
                objCliente.put("nombre", cliente.getNombre());
                objCliente.put("direccion", cliente.getDireccion());
                objCliente.put("telefono", cliente.getTelefono());
                objClientes2.put(objCliente);
            }
            JSONObject objVendedorClientes2 = new JSONObject();
            objVendedorClientes2.put("vendedor", objVendedor2);
            objVendedorClientes2.put("clientes", objClientes2);
            //System.out.println(objVendedorClientes.toString(4));

            for (Cliente cliente : clientes3) {
                JSONObject objCliente = new JSONObject();
                objCliente.put("nombre", cliente.getNombre());
                objCliente.put("direccion", cliente.getDireccion());
                objCliente.put("telefono", cliente.getTelefono());
                objClientes3.put(objCliente);
            }
            JSONObject objVendedorClientes3 = new JSONObject();
            objVendedorClientes3.put("vendedor", objVendedor3);
            objVendedorClientes3.put("clientes", objClientes3);
            //System.out.println(objVendedorClientes.toString(4));

            JSONArray objVendedores = new JSONArray();
            objVendedores.put(objVendedorClientes);
            objVendedores.put(objVendedorClientes2);
            objVendedores.put(objVendedorClientes3);
            JSONObject objListaVendedores = new JSONObject();
            objListaVendedores.put("vendedores",objVendedores);
            System.out.println(objListaVendedores.toString(4));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
