function isPalindrome(str) {
    
    const cleanedStr = str.toLowerCase();
    let left = 0;
    let right = cleanedStr.length - 1;
    while (left < right) {
        
        if (cleanedStr[left] !== cleanedStr[right]) {
            return false;
        }
        
        left++;
        right--;
    }
    return true;
}
const inputString = "Racecar"; 
const result = isPalindrome(inputString);
if (result) {
    console.log(`'${inputString}' is a palindrome.`);
} else {
    console.log(`'${inputString}' is NOT a palindrome.`);
}
