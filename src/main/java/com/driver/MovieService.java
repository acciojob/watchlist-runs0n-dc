package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
@Autowired
MovieRepository rep;
public void addMovie(Movie movie){
    rep.saveMovie(movie);
}
public void addDirector(Director director){
    rep.saveDirector(director);
}
public void addDirectorMoviePair(String movie,String director)
{
    rep.savedDirectorMovie(movie,director);
}
public Movie getMovie(String movie){
    return rep.getMovie(movie);
}
public Director getDirector(String Director){
    return rep.getDirector(Director);
}
public List<String>getMoviesByDirector(String dname){
    return rep.getMovieList(dname);
}
public List<String> getAllMovies(){
    return rep.getAllMovies();
}
public void deleteDirector(String name){
    rep.deleteDirector(name);
}
public void deleteAlldirectors(){
    rep.deleteDirectorAll();
}
}
