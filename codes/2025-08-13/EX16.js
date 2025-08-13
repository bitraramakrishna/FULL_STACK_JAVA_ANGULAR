
const images = [
    'image (1).png',
     'image2.png',
     'image (1).png',
     'image2.png'
     
     
   
   
];

let currentImageIndex = 0; 


const galleryImage = document.getElementById('galleryImage');
const prevBtn = document.getElementById('prevBtn');
const nextBtn = document.getElementById('nextBtn');



function showImage() {
   
    galleryImage.src = images[currentImageIndex];
    
    prevBtn.disabled = currentImageIndex === 0;
   
    nextBtn.disabled = currentImageIndex === images.length - 1;
}
prevBtn.addEventListener('click', () => {
    
    if (currentImageIndex > 0) {
        currentImageIndex--; 
        showImage(); 
    }
});
nextBtn.addEventListener('click', () => {
    if (currentImageIndex < images.length - 1) {
        currentImageIndex++; 
        showImage(); 
    }
});

document.addEventListener('DOMContentLoaded', showImage);
