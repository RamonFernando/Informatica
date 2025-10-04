function cargarResumen() {
    fetch("resumen.json")
    .then(res => res.json())
    .then(function(salida) {
    
        banco = salida.banco;
        sucursal = salida.sucursal;
        titular = salida.titular;
        nro_cuenta = salida.nro_cuenta;

        // Array
        saldoUSD = salida.saldo[0].monto + " " + salida.saldo[0].moneda;
        saldoEUR = salida.saldo[1].monto + " " + salida.saldo[1].moneda;

        cbu = salida.cbu;
        abierto = salida.abierto;
        
        // Muestro los parametros en el HTML
        document.getElementById("banco").textContent = banco;
        document.getElementById("sucursal").textContent = sucursal;
        document.getElementById("titular").textContent = titular;
        document.getElementById("cuenta").textContent = nro_cuenta;
        
        document.getElementById("usd").textContent = saldoUSD;
        document.getElementById("eur").textContent = saldoEUR;

        document.getElementById("cbu").textContent = cbu;
        document.getElementById("abierto").textContent = abierto;
    })

}