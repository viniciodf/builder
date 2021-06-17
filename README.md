Padroes de Projeto

1) Criacionais
2) Estruturais
3) Comportamentais

* Criacionais

3.Builder
-> O Builder é um padrão de projeto criacional que permite a você construir objetos complexos passo a passo. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.
O padrão Builder é um padrão bem conhecido no mundo Java. É especialmente útil quando você precisa criar um objeto com muitas opções possíveis de configuração.
->Identificação: O padrão Builder pode ser reconhecido na classe que possui um único método de criação e vários métodos para configurar o objeto resultante.


Exempos de utilizacao:

java.lang.StringBuilder#append()