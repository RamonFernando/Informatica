// Herencia
// La herencia es un concepto que permite extender la funcionalidad de una clase a otra clase

// Ejemplo: Esta clase va a pasar las propiedades de padre a hijo.
class Usuario {
    constructor(nombre, apellido, autentificado, idUsuaruio) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.autentificado = autentificado;
      this.idUsuaruio = idUsuaruio;
    }
    PrivilegiosUsuario() {
      if (this.autentificado == true) {
        return `El usuario ${this.nombre} ${this.apellido} esta autenticado`;
      } else {
        return `El usuario ${this.nombre} ${this.apellido} no esta autenticado`;
      }
    }
  }
  class Admin extends Usuario {
    constructor(nombre, apellido, autentificado, idUsuaruio, tipoUsuario) {
      super(nombre, apellido, autentificado, idUsuaruio);
      this.tipoUsuario = tipoUsuario;
    }
    admin() {
      if (this.autentificado == true) {
        return `El usuario ${this.nombre} ${this.apellido} es Administrador`;
      } else {
        return `El usuario ${this.nombre} ${this.apellido} no es Administrador`;
      }
    }
  }
  
  // Tipos de Usuario
  // Usuario 1 (A este usuario se le agrega la propiedad tipoUsuario)
  const usuario1 = new Usuario("Ramon", "Perez", true, 1);
  const admin = new Admin("Ramon", "Perez", true, 1, "Administrador");
  const admin1 = new Admin("Blas", "Diaz", false, 2);
  
  // Usuario 2
  const usuario2 = new Usuario("Blas", "Mario", false, 2);
  
  // Usuario 3
  const usuario3 = new Usuario("Lida", "Alvarez", true, 3, "Registrado");
  
  // Usuario 4
  const usuario4 = new Usuario("Maite", "Danese", false, 4, "No registrado");
  
  // Agregamos la propiedad tipoUsuario al usuario Admin
  admin.tipoUsuario = "Administrador";
  usuario1.tipoUsuario = "Administrador";
  console.log(admin);
  
  // La herencia permite en este caso pasar la propiedad tipoUsuario
  // Ejemplo 1 de herencia mostrando la autenticacion de usuario
  console.log("Privilegios de usuario");
  console.log(usuario1.PrivilegiosUsuario());
  console.log(usuario2.PrivilegiosUsuario());
  console.log(usuario3.PrivilegiosUsuario());
  console.log(usuario4.PrivilegiosUsuario());
  
  // Ejemplo 2 de herencia mostrando la autenticacion de Admin
  console.log("Administrador");
  console.log(admin.admin());
  console.log(admin1.admin());
