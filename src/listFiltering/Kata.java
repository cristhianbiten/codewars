package listFiltering;

import java.util.List;
import java.util.stream.Collectors;

public class Kata {

    public static List<Object> filterList(final List<Object> list) {


        return list.stream()
                .filter(i -> i instanceof Integer)
                .map(i -> (Integer) i)
                .collect(Collectors.toList());


        //1.list.stream(): Esse método transforma a lista list em um fluxo.
        //Esse fluxo é uma sequência de elementos que permite executar operações de processamento de dados nessa sequência.

        //2..filter(i -> i instanceof Integer): O método filter é usado para filtrar o fluxo com base em uma condição.
        // Nesse caso, estamos filtrando apenas os elementos do fluxo que são instâncias da classe Integer.

        //3. .map(i -> (Integer) i): O método map é usado para transformar cada elemento do fluxo.
        // Nesse caso, estamos transformando cada elemento que é instância da classe Integer em um objeto do tipo Integer.

        //4. .collect(Collectors.toList()): O método collect é usado para coletar o fluxo filtrado e mapeado em uma lista.
        // Essa lista final contém todos os elementos que eram instâncias da classe Integer na lista original.

        //Em resumo, esse código filtra uma lista de objetos para obter apenas os elementos que são instâncias da classe Integer,
        // em seguida, converte esses elementos em objetos Integer e os coleta em uma nova lista.
    }
}
