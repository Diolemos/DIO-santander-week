A DIO lesson project. just practcing 
**I DID NOT CREATE THIS PROJECT. THIS IS NOT MY PROJECT. PLEASE IGNORE IT

#Santander Dev Week 2023
Java RESTful API criada para a Santander Dev week.

##Diagrama de Classes

```mermaid
classDiagram
    class Account {
        - String accountNumber
        - String accountAgency
        - double accountBalance
        - double accountLimit
    }

    class Feature {
        - String icon
        - String description
    }

    class Card {
        - String cardNumber
        - double cardLimit
    }

    class News {
        - String icon
        - String description
    }

    class User {
        - String name
        + Account account
        + List~Feature~ features
        + Card card
        + List~News~ news
    }

    User "1"*--"1" Account
    User"1" *--"N" Feature
    User "1" *-- "1" Card
    User "1" *-- "N" News

```
