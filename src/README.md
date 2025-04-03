# Interpolação Polinomial em Java

Este projeto implementa o método de **Interpolação Polinomial** usando **eliminação de Gauss** para encontrar os coeficientes do polinômio interpolador.

## 📌 Descrição
O código recebe um conjunto de pontos \((x, y)\) e gera um polinômio de grau \(n-1\) que passa por todos os pontos.

A abordagem usada é:
1. Construção da **Matriz de Vandermonde** para os valores de \(x\).
2. Resolução do sistema linear \(X * coef = Y\) usando **eliminação de Gauss**.
3. Obtenção dos coeficientes do polinômio interpolador.

## 🚀 Como funciona
O código consiste em três funções principais:

### 1️⃣ `gaussElimination(double[][] A, double[] b)`
Resolve um sistema linear \(Ax = b\) utilizando eliminação de Gauss.
- **Entrada**: Matriz de coeficientes `A` e vetor de termos independentes `b`.
- **Saída**: Vetor de soluções `x[]`.

### 2️⃣ `interpolationPolynomial(double[][] points)`
Constrói a matriz do sistema e resolve para encontrar os coeficientes do polinômio.
- **Entrada**: Matriz `points[][]` onde cada linha contém um par `(x, y)`.
- **Saída**: Vetor `coefficients[]` contendo os coeficientes do polinômio.

### 3️⃣ `main()`
Chama a função de interpolação e imprime os coeficientes do polinômio.

## 📜 Exemplo de Uso
### Entrada:
```java
 double[][] points = {{1, 2}, {2, 3}, {3, 5}};
```

### Saída Esperada:
```
Coeficientes do polinômio interpolador: [1.0, 0.5, 0.5]
```
Que corresponde ao polinômio:
\[
P(x) = 1 + 0.5x + 0.5x^2
\]

## 🛠 Como Executar
1. Copie o código para um arquivo `InterpolationPolynomial.java`.
2. Compile e execute:
   ```sh
   javac InterpolationPolynomial.java
   java InterpolationPolynomial
   ```
3. Veja os coeficientes gerados!

## 📌 Observações
- O código utiliza a **Matriz de Vandermonde** para definir o sistema linear.
- A **eliminação de Gauss** é usada para encontrar os coeficientes do polinômio.

💡 Caso precise de melhorias ou dúvidas, me avise! 🚀

