import { App } from './app';

describe('AppComponent Test', () => {
  let component: App;

  beforeEach(() => {
    component = new App();
  });


  it('Test Case1: Palindrome check', () => {
    let value = component.isPalindrome("Madam");
    expect(value).toBeTrue();
  });

  it('Test Case2: Palindrome check', () => {
    let value = component.isPalindrome("Hello");
    expect(value).toBeFalse();
  });

 
});
