Torre de Hanói em Java
Este projeto implementa uma solução para o problema da Torre de Hanói utilizando recursividade na linguagem Java.

Sobre o projeto
O programa recebe a quantidade de discos e realiza os movimentos necessários para transferir todos os discos da haste A para a haste C, utilizando a haste B como auxiliar.

O programa também apresenta:
O estado inicial das hastes, cada movimento realizado, o estado final e a quantidade total de movimentos.

Regras
1-Apenas um disco pode ser movido por vez.
2- Um disco maior não pode ficar sobre um disco menor.
Lógica utilizada

A solução utiliza recursividade. Para mover n discos:
Move os n - 1 discos para a haste auxiliar;
Move o maior disco para a haste de destino;
Move os n - 1 discos restantes para a haste de destino.

A quantidade mínima de movimentos é calculada pela fórmula:
2ⁿ - 1

Tecnologias utilizadas
-Java
-Recursividade
Autores 
Miguel/Larissa/Guilerme
Matriculas
2520392 / 2421146 / 2520446
