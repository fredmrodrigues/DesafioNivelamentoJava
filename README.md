# ⚽ Desafio de Nivelamento — Mata-mata

> **Disciplina:** Programação Modular — Nivelamento de Algoritmos
> **Professor:** Glender Brás
> **Instituição:** Pontifícia Universidade Católica de Minas Gerais

## 📋 Enunciado

Várias competições esportivas de modalidades diferentes, como futebol, basquete, vôlei e hóquei, utilizam o sistema de **mata-mata** para decidir seu campeão.

Considere uma competição em que **16 equipes** disputam a Fase Final, composta por **15 jogos eliminatórios**.

As equipes finalistas são representadas pelas letras maiúsculas de **A a P**, e os jogos são numerados de **1 a 15**.

### 🏆 Estrutura do campeonato

| Fase             |   Jogos | Confrontos |
| ---------------- | ------: | ---------- |
| Oitavas de final |   1 a 8 | 16 equipes |
| Quartas de final |  9 a 12 | 8 equipes  |
| Semifinais       | 13 e 14 | 4 equipes  |
| Final            |      15 | 2 equipes  |

Os confrontos são organizados da seguinte forma:

```text
OITAVAS DE FINAL

Jogo 1:  A x B ──┐
                  ├── Jogo 9 ──┐
Jogo 2:  C x D ──┘             │
                                ├── Jogo 13 ──┐
Jogo 3:  E x F ──┐             │             │
                  ├── Jogo 10 ──┘             │
Jogo 4:  G x H ──┘                           │
                                              ├── Jogo 15 ── CAMPEÃO
Jogo 5:  I x J ──┐                           │
                  ├── Jogo 11 ──┐             │
Jogo 6:  K x L ──┘             │             │
                                ├── Jogo 14 ──┘
Jogo 7:  M x N ──┐             │
                  ├── Jogo 12 ──┘
Jogo 8:  O x P ──┘
```

Por exemplo, o **jogo 3** é disputado entre as equipes `E` e `F`.

O vencedor desse jogo enfrenta o vencedor do **jogo 4**, enquanto o perdedor é eliminado da competição.

Uma equipe precisa vencer **quatro partidas** para ser campeã. Por exemplo, para a equipe `K` conquistar o campeonato, ela deverá vencer os jogos:

```text
6 → 11 → 14 → 15
```

---

## 🎯 Tarefa

Dados os resultados dos **15 jogos** da Fase Final, desenvolva um programa que determine qual equipe foi a **campeã**.

---

## 📥 Entrada

A entrada é composta pelo resultado dos 15 jogos.

O resultado de cada partida é representado por dois números inteiros:

```text
M N
```

onde:

* `M` representa o número de gols da equipe posicionada à **esquerda** na tabela;
* `N` representa o número de gols da equipe posicionada à **direita**.

Os valores devem respeitar:

```text
0 ≤ M ≤ 20
0 ≤ N ≤ 20
M ≠ N
```

Portanto, **não existem empates**.

---

## 📤 Saída

O programa deve imprimir uma única saída contendo a **letra identificadora da equipe campeã**.

---

## 🧪 Exemplo 1

### Entrada

| Jogo |  M |  N |
| ---: | -: | -: |
|    1 |  4 |  1 |
|    2 |  1 |  0 |
|    3 |  0 |  4 |
|    4 |  3 |  1 |
|    5 |  2 |  3 |
|    6 |  1 |  2 |
|    7 |  2 |  0 |
|    8 |  0 |  2 |
|    9 |  1 |  2 |
|   10 |  4 |  3 |
|   11 |  0 |  1 |
|   12 |  3 |  2 |
|   13 |  3 |  4 |
|   14 |  1 |  4 |
|   15 |  1 |  0 |

### Saída

```text
F
```

---

## 🧪 Exemplo 2

### Entrada

| Jogo |  M |  N |
| ---: | -: | -: |
|    1 |  2 |  0 |
|    2 |  1 |  0 |
|    3 |  2 |  1 |
|    4 |  1 |  0 |
|    5 |  1 |  0 |
|    6 |  1 |  2 |
|    7 |  1 |  2 |
|    8 |  1 |  0 |
|    9 |  2 |  1 |
|   10 |  1 |  0 |
|   11 |  0 |  1 |
|   12 |  0 |  2 |
|   13 |  2 |  1 |
|   14 |  1 |  0 |
|   15 |  2 |  1 |

### Saída

```text
A
```
