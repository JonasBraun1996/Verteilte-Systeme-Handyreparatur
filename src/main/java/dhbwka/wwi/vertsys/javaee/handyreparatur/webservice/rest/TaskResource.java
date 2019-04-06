/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbwka.wwi.vertsys.javaee.handyreparatur.webservice.rest;

import dhbwka.wwi.vertsys.javaee.handyreparatur.tasks.ejb.TaskBean;
import dhbwka.wwi.vertsys.javaee.handyreparatur.common.ejb.UserBean;
import dhbwka.wwi.vertsys.javaee.handyreparatur.tasks.jpa.Task;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.DELETE;
import javax.validation.Valid;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.PUT;


/**
 *
 * @author m.ihly
 */

    @Path("Tasks")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)

public class TaskResource {
    @EJB
    private TaskBean taskBean;

    @EJB
    UserBean userBean;

    //Alle Aufträge die vom aktuellen Nutzer angelegt wurden
    @GET
    public List<Task> findAllByUser(){
        List<Task> list = this.taskBean.findAllByUser(this.userBean.getCurrentUser());
        for(Task task : list){
            task.setOwner(null);
        }
        return list;
    }

    @POST
    public Task saveNewTask(@Valid Task task) {
        return this.taskBean.saveNew(task);
    }
    
    //Auftrag mit der angegbenen ID 
    @GET
    @Path("{id}")
    public Task task(@PathParam("id") long id) {
        return this.taskBean.findById(id);
    }
    
    @PUT
    @Path("{id}")
    public Task updateTask(@PathParam("id") long id, @Valid Task task) {
        task.setId(id);
        return this.taskBean.update(task);
    }

    @DELETE
    @Path("{id}")
    public Task deleteTask(@PathParam("id") long id) {
        Task task = this.taskBean.findById(id);

        if (task != null) {
            this.taskBean.delete(task);
        }

        return task;
    }
}

