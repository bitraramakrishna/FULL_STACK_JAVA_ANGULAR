const names = ["ajay", "Bobby", "Charan", "ramakrishna", "dhoni", "jayram"];

document.getElementById('originalNames').innerText = `Original Names: ${names.join(", ")}`;

const longNames = names.filter(name => name.length > 5);

const uppercasedLongNames = longNames.map(name => name.toUpperCase());

document.getElementById('filteredNames').innerText = `Names > 5 chars (uppercased): ${uppercasedLongNames.join(", ")}`;
