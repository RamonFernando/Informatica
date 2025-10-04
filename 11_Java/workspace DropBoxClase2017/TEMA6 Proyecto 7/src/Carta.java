
public class Carta {

	private int palo;
	private int valor;

	
	
	public Carta( int Palo, int Valor) {
		this.palo = Palo;
		this.valor = Valor;
			
	}
	@Override
	public boolean equals(Object carta){
		
		if (carta == null) {
			return false;
		}
		Carta c = (Carta) carta;
		
		if (c.getPalo() == palo && c.getValor() == valor) {
			return true;
		}
		
		return false;
		
	}
	public int getPalo() {
		return palo;
	}
	public void setPalo(int palo) {
		this.palo = palo;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
