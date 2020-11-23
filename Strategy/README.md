# Objetivo / Aplicação
1. O padrão é aplicado em situações em que muitas classes se relacionam e diferem apenas no modo de atuação, 
com isso o Strategy irá configurar a classe que tenha um dentre muitos comportamentos fornecidos. 
Também pode ser usado quando há a necessidade da variação de um algoritmo, ou seja, pode-se implementar diferentes códigos que chegam no mesmo objetivo, 
mas que possuem em determinadas situações mais vantagens do que os demais.

2. Outra situação oportuna para o uso do padrão é em uma aplicação na qual se tem um cliente e este não pode ficar exposto a estrutura de dados do algoritmo. 
Além disso, quando uma classe tem muitos comportamentos e usam vários comandos condicionais, o desempenho do algoritmo poderá ficar insatisfatório, 
pois há a possibilidade de existir uma quantidade grande de condições, podendo deixar o código mais lento. 
Com o padrão pode-se retirar as condições, criando novas classes com estas estratégias, portanto melhorando desempenho. 
