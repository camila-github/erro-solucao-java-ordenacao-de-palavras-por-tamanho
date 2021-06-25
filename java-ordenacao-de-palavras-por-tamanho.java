import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenacaoPalavrasPorTamanho {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int linhasDeEntrada = Integer.parseInt(br.readLine());
    
      List<String> listaDePalavras = new ArrayList<>();
        
      for (int i = 0; i < linhasDeEntrada; i++) {
        String palavras = br.readLine();
        listaDePalavras.addAll(Arrays.stream(palavras.split(" ")).collect(Collectors.toList()));
            
        String listaOrdenada = listaDePalavras.stream()
                            .sorted(Comparator.comparingInt(String::length)
                            .reversed()
                            .thenComparing(String::compareTo))
                            .collect(Collectors.joining(" "));
    
        System.out.println(listaOrdenada);
        listaDePalavras.clear();
      }
    }
}