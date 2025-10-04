/**
 * @param {number[]} potions - Lista de enteros que representan el poder de cada poción.
 * @param {number} target - Poder total objetivo que se desea alcanzar con dos pociones.
 * @returns {(number[]|undefined)} - Índices de las dos primeras pociones que sumen el objetivo, o `undefined` si no existe tal combinación.
 */

const potions = [4, 5, 6, 2];
let target = 8;

createMagicPotion(potions, target);

function createMagicPotion(potions, target) {
    let resultado = null;

    for (let i = 0; i < potions.length; i++) {
        for (let j = i + 1; j < potions.length; j++) {
            let var_resultado = potions[i] + potions[j];

            if (var_resultado === target) {
                if (!resultado || j < resultado[1]) { // Solo actualiza si es la primera combinación o si `j` es menor
                    resultado = [i, j];
                }
            }
        }
    }

    return resultado || undefined; // Retorna la combinación encontrada o `undefined` si no hay ninguna
}