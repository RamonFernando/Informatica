


let potions = [10, 5, 2, 3, 7, 5]; // target 10
target  = 10;
createMagicPotion(potions, target);

function createMagicPotion(potions, target) {
    let resultado = [];
    let contador = 0;
    for (i = 0; i < potions.length; i++) {
      for (j = i + 1; j < potions.length; j++) {
        contador++;
        let num = potions[i];
        let num2 = potions[j];
        let suma = num + num2;
        if (contador < 2) {
          if (suma == target) {
            resultado.push(i);
            resultado.push(j);
            return resultado;
          }
        }
        contador = 0;
      };
    };
    return undefined;
  }