
import java.text.DateFormat;

/**
*
* Clase: Peliculas
*
* versión:0.1
*
* fecha Creación: 15/09/2019
*
* fecha Modificación: 24/02/2020
*
* Autor: Carmen Salgado...
*
* @author Casalg
* 
* @class Expression class is undefined on line 15, column 12 in Templates/Classes/Class.java.
*
* Copyright: CECAR
*
**//**
*
* ESTA CLASE PERMITE...
*
**/

public class Peliculas {
    
 private String object, Ratings; 

  public Peliculas() {
  }

    public String getobject() {
        return object;
    }

    public void setobject(String object) {
        this.object = object;
    }

    public String getCodigo() {
        return Ratings;
    }

    public void setCodigo(String Ratings) {
        this.Ratings = Ratings;
    }
    //RESULTADOS DEL JSON//
     public class Object{
     
      private String title, year, rated, genre, director, actors, awards,language,country;
      private DateFormat released, runtime;

        public Object(String title, String year, String rated, String genre, String director, String actors, String awards, String language, String country, DateFormat released, DateFormat runtime) {
            this.title = title;
            this.year = year;
            this.rated = rated;
            this.genre = genre;
            this.director = director;
            this.actors = actors;
            this.awards = awards;
            this.language = language;
            this.country = country;
            this.released = released;
            this.runtime = runtime;
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

        public String getRated() {
            return rated;
        }

        public void setRated(String rated) {
            this.rated = rated;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public String getActors() {
            return actors;
        }

        public void setActors(String actors) {
            this.actors = actors;
        }

        public String getAwards() {
            return awards;
        }

        public void setAwards(String awards) {
            this.awards = awards;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public DateFormat getReleased() {
            return released;
        }

        public void setReleased(DateFormat released) {
            this.released = released;
        }

        public DateFormat getRuntime() {
            return runtime;
        }

        public void setRuntime(DateFormat runtime) {
            this.runtime = runtime;
        }
    
     }
  
      public class Ratings{
      
       
      
      }
    
 
 
    
    

}
