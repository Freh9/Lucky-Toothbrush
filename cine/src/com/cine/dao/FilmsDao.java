package com.cine.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.cine.model.FilmsModel;


public enum FilmsDao {
        instance;

        private Map<String, FilmsModel> contentProvider = new HashMap<String, FilmsModel>();

        private FilmsDao() {
        	
        	FilmsModel todo = new FilmsModel("La cité de la peur", "Humour", "1994", "Les nuls");
        	todo.setId("1");
            contentProvider.put("1", todo);
            FilmsModel todos = new FilmsModel("Gladiator", "Péplum", "2000", "Ridley Scott");
            todos.setId("2");
            contentProvider.put("2", todos);

        }
        public Map<String, FilmsModel> getModel(){
                return contentProvider;
        }
        
        public FilmsModel getFilmById(String id){
        	
        	FilmsModel result = null;
        	
        	if (contentProvider.containsKey(id)) {
        		result = (FilmsModel) contentProvider.get(id);
        	}
        	return result;
        }
        public List<FilmsModel> getFilmByYear(String year){
        	
        	List<FilmsModel> result = new ArrayList<FilmsModel>();
        	
        	for(FilmsModel film : contentProvider.values()){
        			
        		if (film.getYear().equals(year)) {
        			result.add(film);
        		}	
        	}
        	return result;
        }

}
