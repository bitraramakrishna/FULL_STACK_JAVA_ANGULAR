import 'zone.js';
import { bootstrapApplication } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { importProvidersFrom } from '@angular/core';
import { App } from './app/app';

bootstrapApplication(App, {
  providers: [ importProvidersFrom(BrowserAnimationsModule) ]
}).catch(console.error);
