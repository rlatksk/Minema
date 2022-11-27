/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiminema;

/**
 *
 * @author Justin
 */
public class Movie {
    private String movieName;
    private String jamTayang;
    
    public Movie(String movieName, String jamTayang){
        this.movieName = movieName;
        this.jamTayang = jamTayang;
    }
    
    public String getMovieName(){
        return movieName;
    }
    
    public void setMovieName(){
        this.movieName = movieName;
    }
    
    public String getJamTayang(){
        return jamTayang;
    }
    
    public void setJamTayang(){
        this.jamTayang = jamTayang;
    }
    
    public String toString(){
        String theMovie = "Movie name = " + getMovieName() + " showtimes = " + getJamTayang();
        return theMovie;
    }
}
