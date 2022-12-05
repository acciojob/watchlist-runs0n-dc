package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("movies")
public class Controller {
@Autowired
MovieService services;

@PostMapping("/add_movie")
 public ResponseEntity<String> addMovie(@RequestBody Movie movie){
    services.addMovie(movie);
    return new ResponseEntity<>("New Movie Added Successfully", HttpStatus.CREATED);
}
@PostMapping("/add_director")
    public ResponseEntity<String> addDirector(@RequestBody Director director){
        services.addDirector(director);
        return new ResponseEntity<>("New Director Added Successfully",HttpStatus.CREATED);
    }
@PutMapping("/add_movie_director_pair")
  public ResponseEntity<String>addPair(@RequestParam String moviename,@RequestParam String diectorname){
    services.addDirectorMoviePair(moviename,diectorname);
    return new ResponseEntity<>("Successfully Added Movie-Director Pair",HttpStatus.CREATED);
}
@GetMapping("/getMovie/{name}")
    public ResponseEntity<Movie>getMovie(@PathVariable String name){
      return new ResponseEntity<>(services.getMovie(name),HttpStatus.ACCEPTED);
}
    @GetMapping("/getMovie/{name}")
    public ResponseEntity<Director>getDirector(@PathVariable String name){
        return new ResponseEntity<>(services.getDirector(name), HttpStatus.ACCEPTED);
    }
@GetMapping("/get_movies_byDirector/{director}")
    public ResponseEntity<List<String>> getMoviesByDirectorName(@PathVariable String director){
      return new ResponseEntity<>(services.getMoviesByDirector(director),HttpStatus.ACCEPTED);
}
@GetMapping("/getAllMovies")
    public ResponseEntity<List<String>>getAllMovies(){
    return new ResponseEntity<>(services.getAllMovies(),HttpStatus.ACCEPTED);
}
@DeleteMapping("/delete_director_by_name")
    public ResponseEntity<String>deleteDirectorByName(@RequestParam String director){
     services.deleteDirector(director);
     return new ResponseEntity<>(director+"successfully deleted",HttpStatus.CREATED);

}
@DeleteMapping("/delete_all_directors")
    public ResponseEntity<String>deleteAllDirectors(){
    services.deleteAlldirectors();
    return new ResponseEntity<>("All directors deleted Successfully",HttpStatus.CREATED);
}



}
