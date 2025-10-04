// Métodos de Propiedad

const reproductor = {
    reproducir : function(id){
        console.log(`Reproduciendo canción número:  ${id}`);
    },
    pausar : function(){
        console.log(`Pausando canción ... `);
    },
    crearPlaylist: function(nombre){
        console.log(`Creando playlist: ${nombre}`);
    },
    reproducirPlaylist: function(nombre){
        console.log(`Reproduciendo playlist: ${nombre}`);
    }
}
reproductor.borrarCancion = function(id){
    console.log(`Eliminando canción ... ${id}`);
}

reproductor.agregarCancion = function(id){
    console.log(`Añadiendo canción ... ${id}`);
}

// Mostrar or consola
reproductor.reproducir(3840);
reproductor.pausar(3840);
reproductor.borrarCancion(20);
reproductor.agregarCancion(20);
reproductor.crearPlaylist('Jeavy Metal');
reproductor.reproducirPlaylist('Jeavy Metal');
