package com.cine.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FilmsModel {
	
        private String id;
		private String title;
        private String genre;
        private String year;
        private String realisateur;

        public FilmsModel(){

        }
        public FilmsModel (String title, String genre, String year, String realisateur){
                this.title = title;
                this.genre = genre;
                this.year = year;
                this.realisateur = realisateur;
        }
        public String getTitle() {
                return title;
        }
        public void setTitle(String title) {
                this.title = title;
        }
        public String getYear() {
                return year;
        }
        public void setYear(String year) {
                this.year = year;
        }
        public String getGenre() {
                return genre;
        }
        public void setGenre(String genre) {
                this.genre = genre;
        }
        public String getRealisateur() {
            return realisateur;
	    }
	    public void setRealisateur(String realisateur) {
	            this.realisateur = realisateur;
	    }
	    public String getId() {
            	return id;
	    }
	    public void setId(String id) {
	            this.id = id;
	    }


}