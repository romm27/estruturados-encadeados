# Manual  
### Rodando `App.java` você recebera um prompt perguntando se quer rodar testes automatizados ou acessar as operações CRUD do sistema, seguindo os passos que aparecem na tela, será possível inserir, remover ou exibir valores de uma pilha ou de duas listas(A e B), assim como realizar o merge destas duas listas.

## Valores Testados:
Fila Encadeada: 10, 20, 30
Pilha Encadeada: 5, 15, 25

Merge Encadeado:
A: 10, 30, 50
B: 20, 40, 60

Merge Vetor:
A: 5, 15, 25
B: 10, 20, 30

# Soluções  
## Geral  
### Tanto a pilha encadeada quanto a fila encadeada possuem métodos `insere()` muito parecidos. A ideia é criar uma nova instância de `Node` e adicionar uma referência a ela como a próxima `Node` na última `Node` atual.  

## Fila Encadeada (`FilaEncadeada.java`)  
### Usei a Lista Encadeada base do professor como referência e adicionei as funcionalidades de fila. Quando a função `remove()` é chamada, a referência do primeiro `Node` é passada para o próximo `Node` da referência atual, permitindo que o Garbage Collector do Java remova automaticamente essa instância do `Node`.  

## Pilha Encadeada (`PilhaEncadeada.java`)  
### O método `insere()` funciona um pouco diferente da fila. Um `while` percorre todos os `Nodes`, mantendo na memória o `Node` atual e o `Node` anterior. Quando o próximo `Node` do `Node` atual é `null`, significa que alcançamos o fim da pilha. Portanto, a referência do penúltimo `Node` (Node Anterior) deve ser setada para `null`, transformando-o no final da pilha.  

## Merge Encadeado (`MergeEncadeado.java`)  
### O método `mergeEncadeado()` recebe duas filas ordenadas (`a` e `b`) e retorna uma terceira fila (`resultado`), também ordenada.  

### Lógica:  
1. Se ambas as filas estiverem vazias, retorna uma fila vazia.  
2. Remove o primeiro elemento de cada fila (se existir) e os armazena em `valorA` e `valorB`.  
3. Enquanto houver elementos em pelo menos uma das filas:  
   - Compara `valorA` e `valorB`.  
   - Insere o menor na fila `resultado`.  
   - Remove um novo elemento da fila correspondente (se não estiver vazia).  
4. Quando uma das filas estiver vazia, todos os elementos restantes da outra fila são adicionados diretamente à `resultado`, mantendo a ordem.

## MergeVetor (`MergeVetor.java`)
### Bem parecido com o Merge Encadeado, porém usando um par extra de booleans para dizer ao código quando uma fila está vazia.
