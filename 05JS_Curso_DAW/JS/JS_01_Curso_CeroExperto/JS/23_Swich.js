// Swich
const metodoPago = 'tarjeta';

switch (metodoPago) {
    case 'tarjeta':
        console.log('Pago con tarjeta');
    case 'efectivo':
        console.log('Pago con efectivo');
    case 'cheque':
        console.log('Pago con cheque');
    default:
        console.log('Pago con otro metodo');
    break;    
}