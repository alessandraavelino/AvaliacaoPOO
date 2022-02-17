class Main {
    public static void main(String[] args) {

      Mercadinho mercadinho = new Mercadinho(3);

      Cliente clienteRegular = new ClienteRegular("Paulo", 854);
      Cliente clienteVip = new ClienteVip("Marcos", 320, "68458");
      Cliente clienteOuroVip = new ClienteOuroVip("João", 540, "897484", "Rua da Esperança, 500");
  
      mercadinho.adicionarCliente(clienteRegular);
      mercadinho.adicionarCliente(clienteVip);
      mercadinho.adicionarCliente(clienteOuroVip);

      mercadinho.imprimirClientes();
      System.out.println("Total: " + mercadinho.calcularTotal());
    }
}