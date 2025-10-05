package edu.unifor.graph;
import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File pasta = new File("data");
        if (!pasta.exists()) {
            System.out.println("Pasta não encontrada.");
            return;
        }

        File[] arquivos = pasta.listFiles();
        if (arquivos == null || arquivos.length == 0) {
            System.out.println("Nenhum arquivo encontrado em data/");
            return;
        }

        for (File f : arquivos) {
            if (!f.getName().endsWith(".txt")) continue;

            System.out.println("\n=== Testando grafo: " + f.getName() + " ===");
            Graph G = new Graph(new In(f.getPath()));

            if (!EulerUtils.isConnectedIgnoreIsolated(G)) {
                System.out.println("Grafo desconexo (ignorando vértices isolados).");
                continue;
            }

            int odd = 0;
            for (int v = 0; v < G.V(); v++) {
                if (G.degree(v) % 2 == 1) odd++;
            }

            if (odd != 0) {
                System.out.println("Não tem ciclo euleriano (graus ímpares).");
                continue;
            }

            // Algoritmo de Hierholzer
            Hierholzer h = new Hierholzer(G);
            List<Integer> cicloH = h.findCircuit(0);
            System.out.println("Hierholzer: " + formatar(cicloH));

            // Algoritmo de Fleury
            Fleury fAlg = new Fleury(G);
            List<Integer> cicloF = fAlg.find();
            System.out.println("Fleury:     " + formatar(cicloF));
        }
    }

    private static String formatar(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) return "(nenhum)";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lista.size(); i++) {
            if (i > 0) sb.append(" -> ");
            sb.append(lista.get(i));
        }
        return sb.toString();
    }
}
