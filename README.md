# Exercício de Testes Unitários com JUnit: Validação de Financiamento

Este projeto tem como objetivo a prática de testes unitários utilizando **JUnit Vanilla**, sem dependências externas como Mockito ou Spring. O foco está na validação de regras de negócio relacionadas a um financiamento, com a implementação de um total de **10 testes unitários** cobrindo diversas situações.

## 📝 Descrição do Problema

Um financiamento possui três atributos principais:
- **totalAmount**: valor total financiado.
- **income**: renda mensal do cliente.
- **months**: número de meses do financiamento.

E dois métodos:
- **entry**: calcula o valor da entrada como 20% do valor total do financiamento.
- **quota**: calcula o valor da prestação mensal (sem juros).

### 🚨 Regra de Validação
A prestação mensal do financiamento não pode ser maior que **50% da renda mensal** do cliente.

### Exemplos de Casos
1. **INVÁLIDO**
   ```json
   { "totalAmount": 100000, "income": 2000, "months": 20 }
