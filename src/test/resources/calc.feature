#language: pt

Funcionalidade: Operações matemáticas

  Cenario: realizar a soma de dois numeros
    Dado os valores sejam 10 e 5
    Quando o cliente chama o endpoint da "add"
    Entao o retorno deve ser 15

  Cenario: realizar a subtração de dois numeros
    Dado os valores sejam 10 e 5
    Quando o cliente chama o endpoint da "sub"
    Entao o retorno deve ser 5

  Cenario: realizar a multiplicação de dois numeros
    Dado os valores sejam 10 e 5
    Quando o cliente chama o endpoint da "mul"
    Entao o retorno deve ser 50

  Cenario: realizar a divisão de dois numeros
    Dado os valores sejam 10 e 5
    Quando o cliente chama o endpoint da "div"
    Entao o retorno deve ser 2

  Esquema do Cenario: realizar operações matemáticas
    Dado os valores sejam <valor1> e <valor2>
    Quando o cliente chama o endpoint da "<operacao>"
    Entao o retorno deve ser <resultado>
    Exemplos:
      | valor1 | valor2 | operacao | resultado |
      | 4      | 2      | add      | 6         |
      | 4      | 2      | sub      | 2         |
      | 4      | 2      | mul      | 8         |
      | 4      | 2      | div      | 2         |
