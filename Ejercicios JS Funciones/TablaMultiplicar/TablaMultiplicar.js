"use strict";

let num1 = 0;
let num2 = 0;
let resultado = 0;

function obtenerDatos() {
    num1 = parseFloat(document.getElementById("num1").value);
    num2 = parseFloat(document.getElementById("num2").value);
    
}

function validarCampos() {
    obtenerDatos();

    if (isNaN(num1) || isNaN(num2) || num1 < 0 || num2 < 0) {
        alert("Por favor, ingrese dos números válidos y positivos sin espacios en blanco.");
        return false;
    }
    return true;
}
function validarNumero(numero) {
    if (isNaN(numero) || numero < 0) {
        alert("Por favor, ingrese un número valido y positivo.");
        return false;
    }
    return true;
}

function mostrarResultado(operacion) {
    const res = document.getElementById("resultado");
    res.innerHTML = `<p>${num1} ${operacion} ${num2} = <strong>${resultado}</strong></p>`;
}

// Limpiar
function limpiarCampos() {
    document.getElementById("num1").value = "";
    document.getElementById("num2").value = "";
}

function limpiarResultados() {
    const res = document.getElementById("resultado");
    res.innerHTML = "";
    limpiarCampos();
}

// Tabla de multiplicar
function mostrarTabla() {
    obtenerDatos();
    if (!validarNumero(num1) || !validarNumero(num2)) return;
    const res = document.getElementById("resultado");
    
    let tablaHTML = `<h3>Tabla del ${num1} hasta el ${num2}</h3><ul>`;
        for (let i = 1; i <= num2; i++) {
            tablaHTML += `<li>${num1} x ${i} = ${num1 * i}</li>`;
        }
    tablaHTML += `</ul>`;
    res.innerHTML = tablaHTML;
}

// Operaciones
function sumar() {
    if (!validarCampos()) return;
    resultado = num1 + num2;
    mostrarResultado("+");
}

function restar() {
    if (!validarCampos()) return;
    resultado = num1 - num2;
    mostrarResultado("-");
}

function multiplicar() {
    if (!validarCampos()) return;
    resultado = num1 * num2;
    mostrarResultado("*");
}

function dividir() {
    if (!validarCampos()) return;
    if (num2 === 0) {
        alert("No se puede dividir entre 0");
        return;
    }
    resultado = num1 / num2;
    mostrarResultado("/");
}


