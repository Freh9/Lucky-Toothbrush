package com.cine.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cine.dao.RealisateursDao;
import com.cine.model.RealisateursModel;

@Path("/realisateurs")
public class RealisateursController {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<RealisateursModel> getFilmsBrowser() {
        List<RealisateursModel> todos = new ArrayList<RealisateursModel>();
        todos.addAll(RealisateursDao.instance.getModel().values());
        return todos;
	}
}