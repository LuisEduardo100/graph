# ⚙️ Algoritmos de Hierholzer e Fleury

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![License](https://img.shields.io/badge/uso-acad%C3%AAmico-blue?style=for-the-badge)
![GitHub](https://img.shields.io/badge/Grafos-Eulerianos-success?style=for-the-badge)

---

## 🧭 Descrição Geral

Este repositório contém a **implementação em Java** dos algoritmos de **Hierholzer** e **Fleury**, ambos utilizados para **encontrar trilhas e circuitos eulerianos em grafos não direcionados**. O projeto foi desenvolvido como parte da disciplina de **Grafos** na **Universidade de Fortaleza (UNIFOR)**, com o objetivo de **explorar, comparar e compreender** diferentes estratégias para a construção de trilhas e circuitos eulerianos.

---

## 🎯 Objetivo

O foco deste trabalho é **analisar e implementar** ambos os algoritmos, destacando:

- Suas **características e diferenças conceituais**
- As **complexidades de tempo e espaço**
- As **vantagens e limitações práticas**
- Exemplos e aplicações em **grafos simples e não direcionados**

---

## 🧩 Estrutura do Projeto

```
src/
└── edu/unifor/graph/
├── Bag.java
├── BreadthFirstPaths.java
├── EulerUtils.java
├── Fleury.java ← Implementação do algoritmo de Fleury
├── Graph.java ← Estrutura base do grafo (listas de adjacência)
├── Hierholzer.java ← Implementação do algoritmo de Hierholzer
├── In.java
├── Main.java ← Classe principal para execução e testes
├── Queue.java
├── SET.java
├── Stack.java
├── StdIn.java
├── StdOut.java
└── StdRandom.java
```

Cada classe auxilia na **manipulação e análise de grafos**, compondo uma base modular e reutilizável para experimentos e estudos.

---

## 🔹 Algoritmo de Hierholzer

O **algoritmo de Hierholzer** é o método **mais eficiente** para encontrar circuitos eulerianos.  
Ele constrói o caminho percorrendo cada aresta **exatamente uma vez**, garantindo **complexidade linear**.

**Características principais:**

- ✅ Complexidade: **O(E)**
- 🔁 Percorre cada aresta uma única vez
- ⚡ Ideal para grafos grandes
- 🔒 Requer grafo **conexo (ignorando vértices isolados)** e com **todos os vértices de grau par**

**Resumo do funcionamento:**

1. Escolhe um vértice inicial qualquer.
2. Percorre o grafo até retornar ao ponto inicial.
3. Caso existam vértices com arestas não visitadas, forma subcircuitos e os integra ao circuito principal.

---

## 🔸 Algoritmo de Fleury

O **algoritmo de Fleury** é mais **didático**, mas **menos eficiente**.  
Ele escolhe cuidadosamente as arestas para evitar desconectar o grafo durante o percurso.

**Características principais:**

- 🕒 Complexidade: **O(E²)**
- 🔍 Verifica conectividade a cada remoção de aresta
- 📚 Ideal para fins educacionais
- ❗ Mais lento em grafos grandes, mas ótimo para **entendimento conceitual**

**Resumo do funcionamento:**

1. Verifica se o grafo é euleriano (todos os graus pares) ou semieuleriano (apenas dois ímpares).
2. Escolhe um vértice inicial adequado.
3. A cada passo, seleciona uma aresta **não crítica** (cuja remoção não desconecte o grafo).
4. Repete até visitar todas as arestas.

---

## 📊 Complexidade dos Algoritmos

| Algoritmo      | Tempo (Pior Caso) | Espaço   | Observações                                    |
| -------------- | ----------------: | -------- | ---------------------------------------------- |
| **Hierholzer** |              O(E) | O(V + E) | Percorre cada aresta uma vez; muito eficiente  |
| **Fleury**     |             O(E²) | O(V + E) | Requer múltiplas verificações de conectividade |

---

## 🧠 Aplicações Práticas

Esses algoritmos têm uso em diversos contextos, como:

- 📋 **Problemas de logística e roteamento**
- 🧭 **Planejamento de rotas de inspeção**
- 🌐 **Análise de redes e conectividade**
- 🧩 **Ensino e pesquisa em teoria dos grafos**

---

## ▶️ Execução

### 1. Clonar o repositório

```bash
git clone https://github.com/SeuUsuario/graph-eulerianos.git
```

### 2. Compilar o projeto

```bash
javac src/edu/unifor/graph/*.java
```

### 3. Executar o programa principal

```bash
java src.edu.unifor.graph.Main
```

---

## 🏷️ Licença

Este projeto foi desenvolvido **para fins educacionais**.  
Sinta-se à vontade para **estudar, modificar e reutilizar o código**.

---
