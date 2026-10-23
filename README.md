# Conversor de Moedas

Aplicação de console em Java para converter valores em reais (BRL) para outras moedas, usando taxas de câmbio em tempo real da [ExchangeRate-API](https://www.exchangerate-api.com/). Desenvolvida durante o programa Oracle Next Education (ONE), em parceria com a Alura.

## Funcionalidades

- Conversão de BRL para USD, EUR, GBP, JPY, ARS e CHF
- Menu interativo no terminal
- Consulta de taxas atualizadas a cada conversão
- Separação de responsabilidades em `controller`, `service`, `infrastructure`, `domain` e `dto`

## Tecnologias

Java 17 · Gson · ExchangeRate-API · Maven

## Pré-requisitos

- JDK 17 ou superior
- Chave de acesso à ExchangeRate-API

## Como executar

1. Crie uma conta em [exchangerate-api.com](https://www.exchangerate-api.com/) e copie sua chave.
2. Defina a variável de ambiente:

PowerShell (Windows):

```powershell
$env:EXCHANGE_RATE_API_KEY="sua-chave"
```

Bash (Linux/macOS):

```bash
export EXCHANGE_RATE_API_KEY="sua-chave"
```

3. Execute na raiz do projeto:

Windows:

```powershell
.\mvnw.cmd compile exec:java
```

Linux/macOS:

```bash
./mvnw compile exec:java
```

O Maven Wrapper baixa a versão necessária do Maven automaticamente. A chave não é armazenada no repositório.

## Exemplo de uso

```text
=== Conversor de Moedas ===
1 - BRL para USD (Dólar Americano)
2 - BRL para EUR (Euro)
3 - BRL para GBP (Libra Esterlina)
4 - BRL para JPY (Iene Japonês)
5 - BRL para ARS (Peso Argentino)
6 - BRL para CHF (Franco Suíço)
0 - Sair
Escolha: 1
Digite o valor em BRL: 100
Resultado: 18.00 USD
```

Os valores variam conforme a cotação do momento.

## Estrutura

```text
src/main/java/
├── Main.java
└── br/com/currencyapp/
    ├── controller.java
    ├── domain.java
    ├── dto.java
    ├── infrastructure.java
    └── service.java
```

## Licença

Distribuído sob a licença MIT. Consulte [LICENSE](LICENSE).

---

Autor: Gilvam Oliveira · [LinkedIn](https://www.linkedin.com/in/gilvam-oliveira/) · [GitHub](https://github.com/GilvamOliveira)
