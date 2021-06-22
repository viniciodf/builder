Padroes de Projeto

1) Criacionais
2) Estruturais
3) Comportamentais

* Criacionais

3.Builder

O que é:
O Builder é um padrão de projeto criacional que permite a você construir objetos complexos passo a passo. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.

Aplicabilidade:
Use o padrão Builder para se livrar de um “construtor telescópico”.
Use o padrão Builder quando você quer que seu código seja capaz de criar diferentes representações do mesmo produto (por exemplo, casas de pedra e madeira).
Use o Builder para construir árvores Composite ou outros objetos complexos.

Identificação:
O padrão Builder pode ser reconhecido na classe que possui um único método de criação e vários métodos para configurar o objeto resultante.

Exempos de utilizacao:
java.lang.StringBuilder#append()