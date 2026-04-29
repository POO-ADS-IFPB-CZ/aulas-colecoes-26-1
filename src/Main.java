void main() {

    Stack<String> pilha = new Stack<>();
    pilha.push("João");
    pilha.push("Maria");
    pilha.push("Pedro");

    System.out.println("topo da pilha: "+ pilha.peek());

    while(!pilha.isEmpty()){
        System.out.println(pilha.pop());
    }


}
