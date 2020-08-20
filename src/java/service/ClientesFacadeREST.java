/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import modelo.Clientes;

/**
 *
 * @author Anthony Mendieta
 */
@Stateless
@Path("modelo.clientes")
public class ClientesFacadeREST extends AbstractFacade<Clientes> {

    @PersistenceContext(unitName = "ejemploPU")
    private EntityManager em;

    public ClientesFacadeREST() {
        super(Clientes.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Clientes entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Clientes entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Clientes find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Clientes> findAll() {
        return super.findAll();
    }
    @POST
    @Path ("crete")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_JSON})
    public String create (@FormParam("id_cliente")int id_cliente,@FormParam("Nombre")String Nombre,@FormParam("Direccion")String Direccion,
            @FromParam("Correo")String Correo, @FormParam("Ciudad")String Ciudad, @FormParam("Joyeria Preferencia") int Joyeria Preferencia,
            @FromParam("Telefono")String Telefono, @FromParam("Edad")int Edad){
    
    Cliente cliente = new Cliente(id_cliente, Nombre,Direccion, Correo,Ciudad, Joyeria Preferencia, Telefono, Edad);
    return "Datos ingresados correctamete";     
}
    @POST
    @Path ("editar")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_JSON})
    public String Editar (@FormParam("id_cliente")int id_cliente,@FormParam("Nombre")String Nombre,@FormParam("Direccion")String Direccion,
            @FromParam("Correo")String Correo, @FormParam("Ciudad")String Ciudad, @FormParam("Joyeria Preferencia") int Joyeria Preferencia,
            @FromParam("Telefono")String Telefono, @FromParam("Edad")int Edad){
    
    Cliente c = super.find(id_cliente);
    c.setNombre(Nombre);
    c.setDireccion(Direccion);
    c.setCorreo(Correo);
    c.setCiudad(Ciudad);
    c.setJoyeriaPreferencia(JoyeriaPreferencia);
    c.setTelefono(Telefono);
    c.setEdad(Edad);
    super.edit(c);
    return "datos editados correctamente";   
} 
            @POST
    @Path ("delete")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_JSON})
    public String Eliminar(@FormParam("id_cliente")int id_cliente){
        Cliente c = super.find(id_cliente);
        if(c == null){
            return ("datos no eliminados")
        }else{
            super.remove(c);
            return ("Datos eliminados")
        }
    }
    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Clientes> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
