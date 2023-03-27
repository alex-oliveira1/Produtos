public class Produto {
   private String nome;
   private Double preco;
   private int quantidade;
  public Produto(){
   
  }
   public Produto(String nome, Double preco, int quantidade) {
      this.nome = nome;
      this.preco = preco;
      this.quantidade = quantidade;
   }

   public Produto(String nome, Double preco) {
      this.nome = nome;
      this.preco = preco;
      this.quantidade = 0;
   }
   public String getNome() {
      return nome;
   }
   public void setNome(String nome) {
      this.nome = nome;
   }
   public Double getPreco() {
      return preco;
   }
   public void setPreco(Double preco) {
      this.preco = preco;
   }
   public int getQuantidade() {
      return quantidade;
   }

   public void setQuantidade(int quantidade) {
      this.quantidade = quantidade;
   }

   public void addProduto(int quantidade) {
      this.quantidade += quantidade;
   }

   public Double totalProduto() {
      return this.preco * this.quantidade;
   }

   public void removeProduto(int quantidade) {
      this.quantidade -= quantidade;
   }

   public String toString() {
      return nome
            + ", R$ "
            + String.format("%.2f cada unidade", preco)
            + ", "
            + "em estoque " + quantidade + " unidades"
            + " , Total do produto: R$ "
            + String.format("%.2f", totalProduto());
   }
}
