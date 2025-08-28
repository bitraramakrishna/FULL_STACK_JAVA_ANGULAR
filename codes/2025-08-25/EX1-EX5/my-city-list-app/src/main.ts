import { bootstrapApplication } from '@angular/platform-browser';
import { App } from './app/app';
import 'zone.js'; 
import { provideAnimations } from '@angular/platform-browser/animations';
bootstrapApplication(App, {
  providers: [
    provideAnimations()
  ]
}).catch(err => console.error(err));