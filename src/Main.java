void main() {

    Queue<String> fila = new LinkedList<>();
    fila.offer("João");
    fila.offer("Maria");
    fila.offer("Pedro");
    fila.offer("José");

    //Não remove
    System.out.println("Primeiro: "+fila.peek());

    while (!fila.isEmpty()){
        System.out.println(fila.poll());
    }

}
