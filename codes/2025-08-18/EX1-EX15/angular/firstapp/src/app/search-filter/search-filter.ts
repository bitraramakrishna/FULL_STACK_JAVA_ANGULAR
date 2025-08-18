import { Component } from '@angular/core';
import { CommonModule } from '@angular/common'; 
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-search-filter',
  imports: [CommonModule,FormsModule],
  templateUrl: './search-filter.html',
  styleUrl: './search-filter.css'
})
export class SearchFilter {
  allNames:string[]=['ramakrishna','ramu','krishna','jayaram','jayanta'];
filteredNames: string[] = [];
searchText:string='';


 filterNames(): void {
    const lowerCaseSearchText = this.searchText.toLowerCase();

    if (!lowerCaseSearchText) {
      
      this.filteredNames = [];
     
    } else {
      
      this.filteredNames = this.allNames.filter(name =>
        name.toLowerCase().startsWith(lowerCaseSearchText) 
      );
      console.log(`Filtered for "${this.searchText}" (starts with):`, this.filteredNames);
    }
    console.log(`Filtered for "${this.searchText}":`, this.filteredNames);
  }
}
