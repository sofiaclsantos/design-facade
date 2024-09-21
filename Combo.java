public class Combo {

    private Burguer burguer;
    private Bebida bebida;
    private Sobremesa sobremesa;
 
    public Combo(){
 
     this.burguer = null;
     this.bebida = null;
     this.sobremesa = null;
    }
 
    public void CriarCombo(int tipo){
 
     if(tipo == 1){
             burguer = new Burguer(100,"Smash burguer", 20);
             bebida = new Bebida(300, "Coca-cola", 10);
             sobremesa = new Sobremesa(100, "Sundae", 8); 
         }
         else if (tipo == 2){
             burguer = new Burguer(180,"Double smash", 30);
             bebida = new Bebida(500, "Coca-cola", 15);
             sobremesa = new Sobremesa(150, "Top sundae", 12); 
         }
         else{
             System.out.println("Opção inválida.");
         }
    }
    
   @Override 
 public String toString() {
     return "Itens do Combo:\n" +
            "Burguer: " + (burguer != null ? burguer.getDescricao() + " (R$ " + burguer.getPreco() + ", " + burguer.getGramas() + "g)" : "Burguer não incluído") + "\n" +
            "Bebida: " + (bebida != null ? bebida.getDescricao() + " (R$ " + bebida.getPreco() + ", " + bebida.getMl() + "ml)" : "Bebida não incluída") + "\n" +
            "Sobremesa: " + (sobremesa != null ? sobremesa.getDescricao() + " (R$ " + sobremesa.getPreco() + ", " + sobremesa.getMl() + "ml)" : "Sobremesa não incluída") + "\n";
 }
 
    
 
 
 } 