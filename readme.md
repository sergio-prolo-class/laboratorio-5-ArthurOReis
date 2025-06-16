# Engenharia de Telecomunicações - Programação Orientada a Objetos

# *Laboratório 5: Polimorfismo*

### _15 de Junho de 2025_
### _Aluno: Arthur Oliveira dos Reis_

---

**(i) Informações iniciais**
- Coloque o diagrama de classes final no readme.md do repositório.
- Organize as classes em pacotes da forma que lhe for conveniente, respeitando as regras de encapsulamento e modificadores de acesso (especialmente o protected).
- Na classe da aplicação (App.java), você deve implementar um código que instancia diferentes objetos da hierarquia de classes e testa suas funcionalidades.

---

## 1. Frota Espacial Modular

Imagine que você faz parte de uma agência espacial responsável por desenvolver uma frota de naves com diferentes finalidades. Cada nave possui características específicas e pode contar com equipamentos especiais que influenciam suas capacidades durante missões interplanetárias. O objetivo deste laboratório é projetar e implementar a hierarquia de classes e interfaces que represente essa frota, conforme as regras de negócio descritas a seguir. A Figura 1 apresenta um diagrama de classes UML incompleto baseado nas regras de negócio.

![Diagrama UML](diagramaUML.png)
_Figura 1: Diagrama de classes UML **incompleto** de uma frota espacial modular_

## 2. Regras de negócio

1. Toda nave possui um identificador único gerado automaticamente na construção do objeto, uma velocidade atual e uma velocidade máxima possível.
2. O limite máximo de velocidade para naves **sem blindagem** é de 20 Mm/h. Para naves **blindadas**, a velocidade máxima é de 14 Mm/h, independentemente do modelo da nave.
3. As ações de controle da nave, seja ele automático ou manual, só podem ser realizadas quando a nave estiver completamente parada (velocidade atual igual a zero).
4. Naves tripuladas devem ter um número máximo de tripulantes definido, mas esse número nunca pode ultrapassar 10. Naves **Autônomas** não devem permitir qualquer quantidade de tripulantes.
5. A NaveCargueira deve ativar a blindagem sempre que sua carga atual ultrapassar 70% da sua carga máxima e só pode desativar a blindagem se estiver pousada.

## 3. Orientações para a implementação

Crie um projeto Java com o Gradle. A partir do diagrama de classes proposto (ou que você venha a ajustar com base nas regras acima), implemente todas as classes e interfaces necessárias.

- Para simular ações como “ativar blindagem”, “nave em 4 Mm/h” etc., utilize Strings impressas no console. Apenas a classe com o método main pode conter comandos de entrada e saída (como `Scanner` e `System.out`)
- Na classe com o método main, declare um atributo do tipo `LinkedHashSet` que permita armazenar objetos de qualquer classe concreta do projeto. Adicione ao menos uma instância de cada classe concreta à lista.
- Ainda no `main`, utilize **polimorfismo** para chamar métodos das naves instanciadas. Inclua um comentário no código antes de cada chamada polimórfica. Exemplo: `// Usando polimorfismo na instrução abaixo`
- Garanta que todos os métodos relevantes sejam invocados para cada objeto instanciado. Por exemplo, se uma nave blindada possui o método `ativarBlindagem()`, e uma nave tripulada possui o método `controleManual()`, ambos devem ser chamados e seus efeitos exibidos no console.

**Importante**: Se o diagrama de classes proposto para esse projeto não estiver totalmente alinhado às regras de negócio, você deverá realizar os ajustes necessários antes da implementação.[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/5KCWodJe)
