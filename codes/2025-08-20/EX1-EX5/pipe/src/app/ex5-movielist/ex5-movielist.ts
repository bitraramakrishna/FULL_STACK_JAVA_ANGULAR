import { Component } from '@angular/core';
import { Ex5MovieService } from '../ex5movieservice';
import { Ex5Movie } from '../ex5movie';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-ex5-movielist',
  imports: [CommonModule,FormsModule],
  templateUrl: './ex5-movielist.html',
  styleUrl: './ex5-movielist.css'
})
export class Ex5Movielist {
     movies: Ex5Movie[] = [];
  newMovie: Ex5Movie = { movieId: 0, movieName: '', language: '', imdbRating: 0 };
    editMode: boolean = false;
  constructor(private Ex5MovieService: Ex5MovieService) {
    this.movies = this.Ex5MovieService.getMovies();
  }
  addOrUpdateMovie() {  
    if (this.editMode) {
      this.Ex5MovieService.updateMovie(this.newMovie);
      this.editMode = false;
    } else {
      this.Ex5MovieService.addMovie({ ...this.newMovie });
    }
    this.resetForm();
     this.movies = this.Ex5MovieService.getMovies();
  }
  addMovie() {
    if (this.newMovie.movieId && this.newMovie.movieName) {
      this.Ex5MovieService.addMovie({ ...this.newMovie });
      this.movies = this.Ex5MovieService.getMovies();
      this.newMovie = { movieId: 0, movieName: '', language: '', imdbRating: 0 };
    }
  }

  deleteMovie(id: number) {
    this.Ex5MovieService.deleteMovie(id);
    this.movies = this.Ex5MovieService.getMovies();
  }

  editMovie(movie: Ex5Movie) {
    this.newMovie = { ...movie };
  }

  updateMovie() {
    this.Ex5MovieService.updateMovie(this.newMovie);
    this.movies = this.Ex5MovieService.getMovies();
    this.newMovie = { movieId: 0, movieName: '', language: '', imdbRating: 0 };
  }
   resetForm() {
    this.newMovie = { movieId: 0, movieName: '', language: '', imdbRating: 0 };
  }

}
