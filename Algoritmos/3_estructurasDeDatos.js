function voidFunction(num){
    let array = new Array(); // Se declara un array dinamico vacio
   let table = new Array(10); // Se declara un array de 6 elementos
   let train = [7, 4, 8, 9, 6]; // Un array de 5 elementos

    // Se rellena el array con los valores pasado por parametro
   for(let i = 0; i < table.length; i++){
    table[i] = (i+1)* num;
    console.log(table[i]);
    }

    // Se imprime el array por consola
    for (let i = 0; i < train.length; i++) {
        console.log(train[i]);
    }

    return `Table: [${table}], Train: [${train}]`;
}
console.log(voidFunction(3));