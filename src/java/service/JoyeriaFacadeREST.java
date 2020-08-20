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
import modelo.Joyeria;

/**
 *
 * @author Anthony Mendieta
 */
@Stateless
@Path("modelo.joyeria")
public class JoyeriaFacadeREST extends AbstractFacade<Joyeria> {

    @PersistenceContext(unitName = "ejemploPU")
    private EntityManager em;

    public JoyeriaFacadeREST() {
        super(Joyeria.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Joyeria entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Joyeria entity) {
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
    public Joyeria find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Joyeria> findAll() {
        return super.findAll();
    }
     @POST
    @Path ("crete")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_JSON})
    public String create (@FormParam("idJoyeria")int idJoyeria ,@FormParam("NombreJoyaria")StringNombreJoyaria,@FormParam("Ubicacion")String Ubicacion,
    @FromParam("Direccion")String Direccion, @FormParam("Telefono")String Telefono, @FormParam("dimensionlocal") String dimensionlocal){
    
    Joyeria joyeria = new Joyeria(idJoyeria, Ubicacion,Direccion, Telefono,dimencionlocal);
    return "Datos ingresados correctamete";     
}
    @POST
    @Path ("editar")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_JSON})
    public String Editar ((@FormParam("idJoyeria")int idJoyeria ,@FormParam("NombreJoyaria")StringNombreJoyaria,@FormParam("Ubicacion")String Ubicacion,
    @FromParam("Direccion")String Direccion, @FormParam("Telefono")String Telefono, @FormParam("dimensionlocal") String dimensionlocal){
    
    Joyeria j = super.find(idJoyeria);
    j.setidJoyeria(idJoyeria);
    j.setNombreJoyaria(NombreJoyaria);
    j.setUbicacion(Ubicacion);
    j.setDireccion(Direccion);
    j.setTelefono(Telefono);
    j.setTelefono(Telefono);
    j.setdimensionlocal(dimensionlocal);
    super.edit(j); 
    return "datos editados correctamente";   
} 
            @POST
    @Path ("delete")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_JSON})
    public String Eliminar(@FormParam("idJoyeria")int id_cliente){
         Joyeria j = super.find(id_cliente);
        if(j == null){
            return ("datos no eliminados")
        }else{
            super.remove(c);
            return ("Datos eliminados")
        }
    }

    
    
    @GET
    
    @Path("{from}/{to}")
    
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
   
    public List<Joyeria> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
