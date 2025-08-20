import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'ex3ctof'
})
export class Ex3ctofPipe implements PipeTransform {

  transform(value: number): string {
   if (value == null) return '';
    const fahrenheit = (value * 9/5) + 32;
    return `${Math.round(fahrenheit)}F`;
  }

}
