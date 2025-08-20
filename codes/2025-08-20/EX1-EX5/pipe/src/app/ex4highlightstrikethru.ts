import { Directive, ElementRef, Renderer2  } from '@angular/core';

@Directive({
  selector: '[ex4highlightstrikethru]'
})
export class Ex4highlightstrikethru {

  constructor(private el: ElementRef, private renderer: Renderer2) {
      this.renderer.setStyle(this.el.nativeElement, 'background-color', 'yellow');
   // this.renderer.setStyle(this.el.nativeElement, 'color', 'black'); // text visible
    this.renderer.setStyle(this.el.nativeElement, 'text-decoration', 'line-through');
   }

}
