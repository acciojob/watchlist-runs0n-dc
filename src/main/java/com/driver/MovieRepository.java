package com.driver;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MovieRepository {
    private Map<String ,Movie> movieMap;
    private Map<String,Director>directorMap;
    private Map<String, List<String>>directorMoviepair;

    public MovieRepository() {
        this.movieMap = new HashMap<>();
        this.directorMap = new HashMap<>();
        this.directorMoviepair = new HashMap<>();
    }
   public void saveMovie(Movie movie){
        movieMap.put(movie.getName(), movie);
   }
   public void saveDirector(Director d){
        directorMap.put(d.getNameD(),d);
   }
   public void savedDirectorMovie(String mname,String dname){
        if(movieMap.containsKey(mname)&&directorMap.containsKey(dname)){
            List<String> currMovies=new ArrayList<>();
            if(directorMoviepair.containsKey(dname)){
                directorMoviepair.get(dname).add(mname);
            }
            else{
                directorMoviepair.put(dname,currMovies);
                directorMoviepair.get(dname).add(mname);
            }
        }
   }
   public Movie getMovie(String name){
        if(movieMap.containsKey(name))return movieMap.get(name);
        return null;
   }
   public Director getDirector(String name){
        if(directorMap.containsKey(name))return directorMap.get(name);
        return null;
   }
   public List<String> getMovieList(String dname){
        return directorMoviepair.get(dname);
   }
   public List<String> getAllMovies(){
      List<String>ans=new ArrayList<>();
      for(String s:movieMap.keySet()){
          ans.add(s);
      }return ans;
   }
   public void deleteDirector(String director){
        if(directorMap.containsKey(director)){
            directorMap.remove(director);
        }
        HashSet<String> moviesBydir=new HashSet<>();
        if(directorMoviepair.containsKey(director)){
            for(String s:directorMoviepair.get(director)){
                moviesBydir.add(s);
            }
            directorMoviepair.remove(director);
        }
        for(String s:moviesBydir){
            if(movieMap.containsKey(s))movieMap.remove(s);
        }
   }
   public void deleteDirectorAll(){
        for(String director:directorMap.keySet()){
            if(directorMap.containsKey(director)){
                directorMap.remove(director);
            }
            HashSet<String> moviesBydir=new HashSet<>();
            if(directorMoviepair.containsKey(director)){
                for(String s:directorMoviepair.get(director)){
                    moviesBydir.add(s);
                }
                directorMoviepair.remove(director);
            }
            for(String s:moviesBydir){
                if(movieMap.containsKey(s))movieMap.remove(s);
            }
        }
   }


}
