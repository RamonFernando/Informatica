// Notificaciones API

const boton = document.querySelector('#boton');
boton.addEventListener('click', () => {
    Notification.requestPermission()
    // El resultado es granted (acepto las notificaciones) o denied (rechazo las notificaciones)
    .then(resultado => console.log(`El permiso de notificaciones es: ${resultado}`) )
});

if(Notification.permission == 'granted'){
    new Notification('Esta es una notificacion', {
        icon: '../img/prueba img.png',
        body: 'Imagenes y notificaciones'

    });
}