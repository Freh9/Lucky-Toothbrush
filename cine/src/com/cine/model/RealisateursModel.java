package com.cine.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RealisateursModel {
	
        private String firstname;
        private String lastname;
        private String dob;

        public RealisateursModel(){

        }
        public RealisateursModel (String firstname, String lastname, String dob){
                this.firstname = firstname;
                this.lastname = lastname;
                this.dob = dob;
        }
        public String getFirstname() {
                return firstname;
        }
        public void setFirstname(String firstname) {
                this.firstname = firstname;
        }
        public String getLastname() {
                return lastname;
        }
        public void setLastname(String lastname) {
                this.lastname = lastname;
        }
        public String getDob() {
                return dob;
        }
        public void setDob(String dob) {
                this.dob = dob;
        }


}