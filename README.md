# Simulador de Conta Corrente em Java <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="Java" width="50" height="50" />

## 📌 Descrição do Projeto

Este projeto é uma simulação básica de uma conta corrente de banco desenvolvida em Java. Ele permite realizar operações bancárias fundamentais, como abertura de conta, depósitos e saques, fornecendo uma experiência simplificada de gerenciamento bancário.

## ⚙️ Funcionamento

O programa começa solicitando informações básicas do usuário, como número da conta e nome do titular. O usuário também pode optar por realizar um depósito inicial. Após a criação da conta, o programa exibe um extrato com as informações cadastradas.

### 🔑 Operações Disponíveis

- **💰Depósito**: O usuário informa o valor desejado para depósito, que é adicionado ao saldo da conta.
- **🏧Saque**: O usuário informa o valor a ser sacado. O valor do saque é descontado do saldo da conta, junto com uma taxa fixa de $5.00.

Após cada operação, o programa exibe o extrato atualizado.

## 🛠 Estrutura do Código

### Main.java

Este arquivo contém o ponto de entrada do programa. Ele utiliza a classe `Scanner` para interagir com o usuário e criar uma instância da classe `Conta`, realizando operações bancárias com base nas escolhas do usuário.

### Conta.java

A classe `Conta` contém os atributos e métodos relacionados à conta bancária:

- **Atributos**: numero, titular, e extrato (saldo da conta).
- **Construtores**: Permitem a criação de uma conta com ou sem depósito inicial.
- **Métodos**:
  - `deposito(double quantia)`: Adiciona uma quantia ao saldo.
  - `saque(double quantia)`: Deduz uma quantia mais uma taxa fixa de $5.00.
  - `toString()`: Exibe as informações da conta de forma legível.

## 🎯 Boas Práticas de Programação

- **Encapsulamento**: A classe `Conta` protege seus atributos, expondo apenas métodos necessários.
- **Reutilização de Código**: As operações são encapsuladas em métodos específicos, facilitando futuras alterações, como mudanças nas regras de depósito.
