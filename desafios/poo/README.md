### Exemplo de Diagrama UML (Mermaid)
```mermaid
classDiagram
    interface ReprodutorMusical {
  +tocar()
  +pausar()
  +selecionarMusica(mString)
}

    interface AparelhoTelefonico {
  +ligar(String)
  +atender()
  +iniciarCorreioVoz()
}

    interface NavegadorInternet {
  +exibirPagina(String)
  +adicionarNovaAba()
  +atualizarPagina()
}

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
