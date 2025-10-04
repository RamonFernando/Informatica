package Teoria;
import java.awt.FlowLayout;

import javax.swing.JButton;

public class Teoria {

	public Teoria() {
		// Teoría Sobre Inetrfaz Gráfica
	}
	// JPanel
	/**
	 * JPanel: es un contenedor que se utiliza para agrupar componentes. Un
	 * panel corresponde a una sección rectangular de la pantalla. Sin embargo,
	 * los paneles no tienen bordes visible
	 */
	// Layout
	/**
	 * Layout: EL layout es la clase que decide como se van a repartir los 
	 * componentes de la ventana, el tamaño y la organizacion de estos.
	 * setLayout(new FlowLayout());
	 */
	// JLabel
	/**
	 * JLabel: JLabel lblPagina = new JLabel("Dirección página web: ", JLabel.LEFT);
	 * Para crear una etiqueta
	 **/
	// GridLayout
	/**
	 * GridLayout: Sirve para dividir un panel en forma de rejilla con filas y columnas.
	 * GridLayout gr = new GridLayout(filas, columnas, separación horizontal, separación vertical);
	 * GridLayout gr = new GridLayout(2,6,5,5);
	 */
	// JTextField
	/**
	 * JTexctField: JTextField txtPagina = new JTextField("Escribe aquí", 30);
	 * para crear un campo de Texto de una sola linea tipo URL...
	 */
	// JCheckBox
	/**
	 * JCheckBox: chkCursoJava = new JCheckBox("Curso de Java", true)
	 * ButtonGroup cursos = new ButtonGroup(); 
	 * cursos.add(chkCursoJava)
	 * Grupo de Botones
	 * */
	// JButtonGroup
	/**
	* Para hacer que no se puedan señalar en un grupo de botones mas de uno.
	* ButtonGroup cursos = new ButtonGroup();
	*/
	// JComboBox
	/**
	 *  JComboBox: JComboBox<String> cmbCursos = new JComboBox<String>()
	 *   cmbCursos.addItem("Curso de Java");
	 *   JComboBox es una lista desplegable
	 */
	// BorderLayout
	/**
	 * BorderLayout: Este layout divide la ventana en cinco zonas, la más grande de las cuales es la central
	 * setLayout(new BorderLayout());       
	 * add(botón, BorderLayout.NORTH)
	 */
	// JToolBar
	/**
	 * JtoolBar: Es una barra de botones.  El JToolBar de java permite que lo 
	 * arrastremos con el ratón para colocarlo en otra parte de la ventana de 
	 * nuestra aplicación o incluso que quede flotando en una ventana propia.
	 * JToolBar barra = new JToolBar();
	 */
	// JList
	/**
	 * JList: Es una lista, que a diferencia es el JComboBox permanece siempre 
	 * desplegada
	 * String categorias[] = { "1º de ESO", "2º de ESO", "3º de ESO"} 
	 * JList lista = new JList(categorias)
	 */
	// JSlider
	/**
	* JSlider: Muestra una escala sobre la que podemos deslizar un indicador
	* • setMajorTickSpacing(10): Las marcas grandes irán de 10 en 10. 
	* • setMinorTickSpacing(1): Las marcas pequeñas irán de 1 en 1. 
	* • setPaintTicks(true): Se mostrarán las marcas. 
	* • miSlider.setPaintLabels(true): Se mostrarán los números.
	*/
	// JProgressBar B.Progreso
	/**
	* JProgressBar: Barra de progreso
	* JProgressBar prgDeposito = new JProgressBar(0, 2000);
	* prgDeposito.setStringPainted(true);
	* add(prgDeposito);
	*/
	// JMenuItem Barra Menu
	/**
	* Parsa añadir barras de menu a la ventana
	* • JMenuItem: Cada opción que se muestra en un menú desplegable (por ejemplo, Nuevo, Abrir, Guardar, ...).
	* • JMenu: Cada menú desplegable (por ejemplo, Archivo, Editar, Ver, ...). 
	* • JMenuBar: La propia barra de menú.
	*/
	// new Dimension: SetPreferredSize
	/**
	 * setPreferredSize()
	 * cmbCursos.setPreferredSize(new Dimension(250, 20));
	 * Para cambiar la dimension del boton que vamos a añadir
	 */
	/**
	 * JTextArea: JTextArea txtComentarios = new JTextArea(8, 40);
	 * Para crear un area de texto es mas grande que el JTextField
	 */
	// LookandFeel
	/**
	 * UIManager.setLookAndFeel()
	 * UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
	 * Para cambiar el tema de una ventana
	 */
	// Super()
	/**
	 * Super()
	 * Es para llamar al constructor de la clase
	 */
	// JSCrollPanel Barra Espaciadora
	/**
	 * JScrollPane: Es para agregar barra espaciadora
	 * JScrollPane: JScrollPane scrPanelBarras = new JScrollPane(txtComentarios);
	 * JTextArea txtComentarios = new JTextArea(6, 20);
	 * JScrollPane scrPanelBarras = new JScrollPane(txtComentarios);
	 * getContentPane().add(scrPanelBarras);
	 * */
	// Imagen
	/**
	 * Asi se agrega un icono
	 * ImageIcon imgCargar = new ImageIcon("Ruta al archivo GIF, PNG o JPG")
	 */
	
	



}
