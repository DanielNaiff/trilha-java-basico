@startuml

interface ReprodutorMusical {

- tocar(): void
- pausar(): void
- selecionarMusica(musica: String): void
  }

interface AparelhoTelefonico {

- ligar(numero: String): void
- atender(): void
- iniciarCorreioVoz(): void
  }

interface NavegadorInternet {

- exibirPagina(url: String): void
- adicionarNovaAba(): void
- atualizarPagina(): void
  }

class iPhone {
implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet

- bateria: int
- armazenamento: int

* iPhone()
* carregar(): void
* verificarBateria(): int
  }

iPhone --> ReprodutorMusical
iPhone --> AparelhoTelefonico
iPhone --> NavegadorInternet

@enduml
