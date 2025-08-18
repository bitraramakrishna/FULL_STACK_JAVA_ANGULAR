/*   -----EXERCISE 1--------
import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { AppComponent } from './app/app';
bootstrapApplication(AppComponent, appConfig)
  .catch((err) => console.error(err));
*/

  import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { ToggleMessage } from './app/toggle-message/toggle-message';
bootstrapApplication(ToggleMessage, appConfig)
  .catch((err) => console.error(err));

