package com.cine.dao;

import java.util.HashMap;
import java.util.Map;

import com.cine.model.RealisateursModel;


public enum RealisateursDao {
        instance;

        private Map<String, RealisateursModel> contentProvider = new HashMap<>();

        private RealisateursDao() {
        	
        	RealisateursModel todo = new RealisateursModel("Ridley", "Scott", "	30 novembre 1937");
            contentProvider.put("1", todo);

        }
        public Map<String, RealisateursModel> getModel(){
                return contentProvider;
        }

}

