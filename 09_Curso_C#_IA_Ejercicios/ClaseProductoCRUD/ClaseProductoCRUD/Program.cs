// File: Program.cs
using System;
using System.Collections.Generic;
using System.Linq;
using System.Windows.Forms;

namespace SistemaGestionProductos
{
    // Clase Producto
    public class Producto
    {
        public int Id { get; set; }
        public string Nombre { get; set; }
        public decimal Precio { get; set; }
        public int Cantidad { get; set; }

        public override string ToString()
        {
            return $"{Id} - {Nombre} | Precio: {Precio:C} | Cantidad: {Cantidad}";
        }
    }

    // Formulario principal
    public partial class FormInventario : Form
    {
        private List<Producto> productos;
        private int nextId;

        public FormInventario()
        {
            InitializeComponent();
            productos = new List<Producto>();
            nextId = 1; // Inicializa ID de productos
        }

        private void btnAgregar_Click(object sender, EventArgs e)
        {
            // Crear producto nuevo
            var producto = new Producto
            {
                Id = nextId++,
                Nombre = txtNombre.Text,
                Precio = nudPrecio.Value,
                Cantidad = (int)nudCantidad.Value
            };
            productos.Add(producto);
            ActualizarLista();
            LimpiarCampos();
        }

        private void btnEditar_Click(object sender, EventArgs e)
        {
            if (lstProductos.SelectedItem is Producto productoSeleccionado)
            {
                productoSeleccionado.Nombre = txtNombre.Text;
                productoSeleccionado.Precio = nudPrecio.Value;
                productoSeleccionado.Cantidad = (int)nudCantidad.Value;
                ActualizarLista();
                LimpiarCampos();
            }
        }

        private void btnEliminar_Click(object sender, EventArgs e)
        {
            if (lstProductos.SelectedItem is Producto productoSeleccionado)
            {
                productos.Remove(productoSeleccionado);
                ActualizarLista();
                LimpiarCampos();
            }
        }

        private void lstProductos_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (lstProductos.SelectedItem is Producto productoSeleccionado)
            {
                txtNombre.Text = productoSeleccionado.Nombre;
                nudPrecio.Value = productoSeleccionado.Precio;
                nudCantidad.Value = productoSeleccionado.Cantidad;
            }
        }

        private void ActualizarLista()
        {
            lstProductos.DataSource = null;
            lstProductos.DataSource = productos;
        }

        private void LimpiarCampos()
        {
            txtNombre.Clear();
            nudPrecio.Value = 0;
            nudCantidad.Value = 0;
        }
    }

    // Clase Program
    static class Program
    {
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new FormInventario());
        }
    }
}

// File: FormInventario.Designer.cs (Autogenerado por Visual Studio, fragmento relevante)
partial class FormInventario
{
    private System.Windows.Forms.TextBox txtNombre;
    private System.Windows.Forms.NumericUpDown nudPrecio;
    private System.Windows.Forms.NumericUpDown nudCantidad;
    private System.Windows.Forms.Button btnAgregar;
    private System.Windows.Forms.Button btnEditar;
    private System.Windows.Forms.Button btnEliminar;
    private System.Windows.Forms.ListBox lstProductos;

    private void InitializeComponent()
    {
        this.txtNombre = new System.Windows.Forms.TextBox();
        this.nudPrecio = new System.Windows.Forms.NumericUpDown();
        this.nudCantidad = new System.Windows.Forms.NumericUpDown();
        this.btnAgregar = new System.Windows.Forms.Button();
        this.btnEditar = new System.Windows.Forms.Button();
        this.btnEliminar = new System.Windows.Forms.Button();
        this.lstProductos = new System.Windows.Forms.ListBox();
        
        // Configurar controles...
        this.btnAgregar.Text = "Agregar";
        this.btnEditar.Text = "Editar";
        this.btnEliminar.Text = "Eliminar";
        this.lstProductos.SelectedIndexChanged += new System.EventHandler(this.lstProductos_SelectedIndexChanged);
        this.btnAgregar.Click += new System.EventHandler(this.btnAgregar_Click);
        this.btnEditar.Click += new System.EventHandler(this.btnEditar_Click);
        this.btnEliminar.Click += new System.EventHandler(this.btnEliminar_Click);
        
        // Agregar controles al formulario
        this.Controls.Add(this.txtNombre);
        this.Controls.Add(this.nudPrecio);
        this.Controls.Add(this.nudCantidad);
        this.Controls.Add(this.btnAgregar);
        this.Controls.Add(this.btnEditar);
        this.Controls.Add(this.btnEliminar);
        this.Controls.Add(this.lstProductos);
    }
}

