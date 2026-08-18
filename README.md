Pontif´ ıcia Universidade Cat´ olica de Minas Gerais
Programac¸˜ ao Modular- Nivelamento Algoritmos
Prof. Glender Br´ as
DESAFIO (n˜ao avaliativo)- Mata-mata
V´arias competi¸c˜oes esportivas de modalidades diferentes como futebol, basquete, vˆolei
e h´oquei utilizam o sistema de mata-mata para decidir seu campe˜ao. Considere uma
competi¸c˜ao em que dezesseis equipes disputam a Fase Final, composta de 15 jogos elimi
nat´orios. A figura a baixo mostra a tabela de jogos da Fase Final:
A
Oitavas-de-final
B
1
C
D
2
E
F
3
G
H
4
I
J
5
K
L
6
M
N
7
Quartas-de-final
9
10
11
O
P
8
12
Semifinais
Final
13
14
15
Campeão
Na tabela, as dezesseis equipes finalistas s˜ao representadas por letras mai´usculas (A a P)
e os jogos s˜ao numerados de 1 a 15. Por exemplo, o jogo 3 ´e entre as equipes E e F; o
vencedor desse jogo enfrentar´a vencedor do jogo 4, e o perdedor ser´a eliminado. A equipe
que vencer os quatro jogos da Fase Final ser´a a campe˜a (por exemplo, para a equipe K
ser campe˜a ela deve vencer os jogos 6, 11, 14 e 15).
Tarefa
Dados os resultados dos quinze jogos da Fase Final, desenvolva um programa que determine
a equipe campe˜a.
Entrada: A entrada ´e composta pelo resultado dos 15 jogos. O resultado de um jogo
´e representado por dois n´umeros inteiros M e N, indicando respectivamente o n´umero
de gols da equipe representada `a esquerda e `a direita na tabela de jogos. Considere que
o n´umero de gols deve estar entre 0 e 20 e n˜ao podem haver empates (0 ≤ M ≤ 20,
≤N ≤20 eM̸ =N)
Sa´ıda: Seu programa deve imprimir uma ´unica sa´ıda, indicando a letra identificadora da
equipe campe˜a.
1
Exemplos
Jogos
1 41
2 10
3 04
4 31
5 23
6 12
7 20
8 02
9 12
10 4 3
11 0 1
12 3 2
13 3 4
14 1 4
15 1 0
Jogos
1 20
2 10
3 21
4 10
5 10
6 12
7 12
8 10
9 21
10 1 0
11 0 1
12 0 2
13 2 1
14 1 0
15 2 1
Resultado
F
Resultado
A
2
