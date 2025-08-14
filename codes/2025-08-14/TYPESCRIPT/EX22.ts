class Stack<T> {
  private elements: T[] = []; 
  push(item: T): void {
    this.elements.push(item);
  }
  pop(): T | undefined {
    if (this.isEmpty()) {
      return undefined;
    }
    return this.elements.pop(); 
  }


  peek(): T | undefined {
    if (this.isEmpty()) {
      return undefined;
    }
    return this.elements[this.elements.length - 1]; 
  }

  
  isEmpty(): boolean {
    return this.elements.length === 0;
  }

  
  size(): number {
    return this.elements.length;
  }
}



const numberStack = new Stack<number>();
numberStack.push(10);
numberStack.pop();
numberStack.push(20);
console.log("Top number:", numberStack.peek()); 
console.log("Popped number:", numberStack.pop()); 
console.log("Stack empty?", numberStack.isEmpty()); 