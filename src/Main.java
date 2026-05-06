void main() {

    List<String> lista = new ArrayList<>();
    lista.add("João");
    lista.add("Maria");
    lista.add("José");
    lista.add("Ana");

    Collections.sort(lista);
    System.out.println("Lista ordenada: "+lista);

    System.out.println(Collections.binarySearch(lista, "Joaquim"));

    Collections.reverse(lista);
    System.out.println("Ordem inversa: "+lista);

    System.out.println("Máximo: "+Collections.max(lista));
    System.out.println("Mínimo: "+Collections.min(lista));
    Collections.shuffle(lista);
    System.out.println("Embaralhar: "+lista);
    Collections.swap(lista, 0, 2);
    System.out.println(lista);

    List<String> naoModificada = Collections.unmodifiableList(lista);
    System.out.println(naoModificada);
    naoModificada.add("Qualquer coisa");


}
