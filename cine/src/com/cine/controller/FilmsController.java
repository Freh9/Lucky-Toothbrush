package com.cine.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.cine.dao.FilmsDao;
import com.cine.model.FilmsModel;



@Path("/films")
public class FilmsController {
	
	@Context
    UriInfo uriInfo;
    @Context
    Request request;
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<FilmsModel> getFilmsBrowser() {
        List<FilmsModel> todos = new ArrayList<FilmsModel>();
        todos.addAll(FilmsDao.instance.getModel().values());
        return todos;
	}
	
	@GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_XML)
    public FilmsModel getFilmById(@PathParam("id") String id) {
		System.out.println("vardebug: id: " + id);
		 return FilmsDao.instance.getFilmById(id);
    }
	
	@GET
    @Path("{year}")
    @Produces(MediaType.APPLICATION_XML)
    public List<FilmsModel> getFilmByYear(@PathParam("year") String year) {
		 return FilmsDao.instance.getFilmByYear(year);
    }
}

