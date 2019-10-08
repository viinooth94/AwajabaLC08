public class repas {
	
	private int numero ;
	private LocalDate date ;
	
	public repas (int,LocalDate){
		this.numero= numero;
		this.date=date;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int numero){
		this.numero=numero;
	}
	
	public LocalDate getDate(){
		return this.date;
	}
	
	public void setDate(LocalDate date){
		this.date=date;
	}
}
