document.addEventListener('DOMContentLoaded', () => {

    const cities = [
        "London", "New York", "Paris", "Tokyo", "Berlin",
        "Rome", "Sydney", "Cairo", "Beijing", "Rio de Janeiro",
        "Moscow", "Dubai", "Mumbai", "Toronto", "Mexico City",
        "Istanbul", "Shanghai", "Barcelona", "Amsterdam", "Seoul"
    ];

    
    const addCitiesBtn = document.getElementById('addCitiesBtn');
    const cityDropdown = document.getElementById('cityDropdown');

   
    addCitiesBtn.addEventListener('click', () => {
       
        const initialOption = cityDropdown.querySelector('option[value=""]');
        cityDropdown.innerHTML = ''; 

        if (initialOption) {
            cityDropdown.appendChild(initialOption); 
        } else {
           
            const newPlaceholder = document.createElement('option');
            newPlaceholder.value = "";
            newPlaceholder.textContent = "-- Select a City --";
            cityDropdown.appendChild(newPlaceholder);
        }


        const sortedCities = [...cities];
        const n = sortedCities.length;

        for (let i = 0; i < n - 1; i++) {
            for (let j = 0; j < n - 1 - i; j++) {
               
                if (sortedCities[j].localeCompare(sortedCities[j + 1]) > 0) {
                   
                    const temp = sortedCities[j];
                    sortedCities[j] = sortedCities[j + 1];
                    sortedCities[j + 1] = temp;
                }
            }
        }

       
        sortedCities.forEach(city => {
            const option = new Option(city, city.toLowerCase().replace(/\s/g, '-'));
            cityDropdown.appendChild(option);
        });
    });
});
