import { Injectable } from '@angular/core';
import { Ex5Movie } from './ex5movie';

@Injectable({
  providedIn: 'root'
})
export class Ex5MovieService {
  private movies: Ex5Movie[] = [
    { movieId: 1, movieName: 'RRR', language: 'TELUGU', imdbRating: 8.8 }
    
  ];

  getMovies(): Ex5Movie[] {
    return this.movies;
  }

  addMovie(movie: Ex5Movie): void {
    this.movies.push(movie);
  }

  updateMovie(movie: Ex5Movie): void {
    const index = this.movies.findIndex(m => m.movieId === movie.movieId);
    if (index !== -1) {
      this.movies[index] = movie;
    }
  }

  deleteMovie(id: number): void {
    this.movies = this.movies.filter(m => m.movieId !== id);
  }
}
