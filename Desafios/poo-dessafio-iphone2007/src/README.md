
### Diagrama de Classe poo.desafio.classes.iPhone 2007 UML (Mermaid)
```mermaid
classDiagram
    class poo.desafio.classes.Dispositivo {
        +modelo: String
        +fabricante: String
        +ligarDispositivo()
        +desligarDispositivo()
    }
    
    class iPhone extends poo.desafio.classes.Dispositivo {
        +home()
        +aumentarVolume()
        +diminuirVolume()
        +camera()
        +entradaFoneOuvido()
        +entradaChip()
        +botaoPower()
        +altoFalante()
        +microfone()
        +conectorBateria()
        +sensorProximidade()
    }

    %% Interfaces para apps do iPhone
    class poo.desafio.interfaces.ReprodutorMusical {
        +play()
        +pause()
        +retroceder()
        +avancar()
        +fullscreen()
        +listarAlbum()
        +listarMusicas()
    }

    class Telefone {
        +fazerChamada(String numero)
        +atenderChamada()
        +recusarChamada()
        +favoritos()
        +recentes()
        +listaContato()
        +tecladoDiscagem()
        +correioVoz()
    }
    
    class Contato {
        +nome: String
        +telefones: List<String>
        +email: String
        +endereco: String
        +salvar()
        +cancelar()
        +editar()
        +excluir()
    }

    class SMS {
        +novaMensagem()
        +homeMensagem()
    }

    class Galeria {
        +verFotos()
        +verVideos()
    }

    class Calendario {
        +verEventos()
        +adicionarEvento()
    }

    class Email {
        +enviarEmail()
        +receberEmail()
    }

    class Browser {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iOS {
        +reprodutorMusical: poo.desafio.interfaces.ReprodutorMusical
        +telefone: Telefone
        +sms: SMS
        +galeria: Galeria
        +calendario: Calendario
        +email: Email
        +browser: Browser
    }
    
    iPhone --> iOS
    iOS --> poo.desafio.interfaces.ReprodutorMusical
    iOS --> Telefone
    iOS --> SMS
    iOS --> Galeria
    iOS --> Calendario
    iOS --> Email
    iOS --> Browser
    Telefone --> Contato

```


[![](https://mermaid.ink/img/pako:eNp9VtFu2zAM_BXDQIEOa3_AGAq0aTMMWNdgGfow5IWRmESYLBqU7KYt-u-jYzuzFGd5SXq0qCPvyPo9V6QxL3Jlwft7A1uGcuUy-RyQ7N74irwJpqHsvQu0n8-lHLNUZMvAxm1HgQ2s2ShwASeC1myBRykvP42CGv25-Ef3NSZmFjtymOE-oNPnee6oxOgWqEt0AfiZbJ2EtCmNq81USEGJDBEkWRg0zIXFU90YTVPR2c5UEb6mALSgF-SYlQ00B9u2LcJLo5g2ckXMRgAViO8gIJuYlkfniRdMe6lGg8ZRD7sfFxfZN7mHN6DQZxUwZFBVPtPUN3Xc5p9YMelaLnusvehqo-5WFl6j2yuofcyVMTAp1GnBDTgFMbaprfWKEV0EW-NFr1u7rssJvKPlT6rs6P9Ci237ItYbeEOe7aAUgS47j2ZOFGeKGLbG-vdcXJOqPUyGNtAQm0A-PSCGQH_Kf0ZixhB7J6CQ1ySWVrDFMpGeGQ0909t_ZqNPGhXtZBAmJjL0DfJF9l34fOkeuBk7uQRjJ04euoNqagd4sE2irWwEhTYBUZuQQntlZQTPyLl8XCZFNfAohj9pUzv2aSDJ9RVsOzxRvgZ5Tql4Aj4bjXTOYzNJ5DSwoTTXQyOqJ9lAG2XIQR88k_OhbXqUDl1j5FCLn1hrjXEgSXbH9OKR43R7sza8gK1xxxmo2U4y_SFdvl3HPodQgzVvMKSYvtk8xXpxuk2K0wUzYc7iOMdjk5XiWTHECNp2khaDtpH_BpGKkWCnNj_0cbyvu94VQxMnZq7_T3R9fdPW22NSeAucqW4Ix2UN6LGoAYjKGcC0igEfVTBAEffjSjwk6TZFp1p-lcsSlONaXggOsq3ysMMSV3khP-WuP6t85T7kOZCSlq9O5UXgGq9ypnq7y4sNWC9_1ZWW7dm_TRzRCtxvonI40g6_tKV__Wi_Pv4CodyM3g?type=png)](https://mermaid.live/edit#pako:eNp9VtFu2zAM_BXDQIEOa3_AGAq0aTMMWNdgGfow5IWRmESYLBqU7KYt-u-jYzuzFGd5SXq0qCPvyPo9V6QxL3Jlwft7A1uGcuUy-RyQ7N74irwJpqHsvQu0n8-lHLNUZMvAxm1HgQ2s2ShwASeC1myBRykvP42CGv25-Ef3NSZmFjtymOE-oNPnee6oxOgWqEt0AfiZbJ2EtCmNq81USEGJDBEkWRg0zIXFU90YTVPR2c5UEb6mALSgF-SYlQ00B9u2LcJLo5g2ckXMRgAViO8gIJuYlkfniRdMe6lGg8ZRD7sfFxfZN7mHN6DQZxUwZFBVPtPUN3Xc5p9YMelaLnusvehqo-5WFl6j2yuofcyVMTAp1GnBDTgFMbaprfWKEV0EW-NFr1u7rssJvKPlT6rs6P9Ci237ItYbeEOe7aAUgS47j2ZOFGeKGLbG-vdcXJOqPUyGNtAQm0A-PSCGQH_Kf0ZixhB7J6CQ1ySWVrDFMpGeGQ0909t_ZqNPGhXtZBAmJjL0DfJF9l34fOkeuBk7uQRjJ04euoNqagd4sE2irWwEhTYBUZuQQntlZQTPyLl8XCZFNfAohj9pUzv2aSDJ9RVsOzxRvgZ5Tql4Aj4bjXTOYzNJ5DSwoTTXQyOqJ9lAG2XIQR88k_OhbXqUDl1j5FCLn1hrjXEgSXbH9OKR43R7sza8gK1xxxmo2U4y_SFdvl3HPodQgzVvMKSYvtk8xXpxuk2K0wUzYc7iOMdjk5XiWTHECNp2khaDtpH_BpGKkWCnNj_0cbyvu94VQxMnZq7_T3R9fdPW22NSeAucqW4Ix2UN6LGoAYjKGcC0igEfVTBAEffjSjwk6TZFp1p-lcsSlONaXggOsq3ysMMSV3khP-WuP6t85T7kOZCSlq9O5UXgGq9ypnq7y4sNWC9_1ZWW7dm_TRzRCtxvonI40g6_tKV__Wi_Pv4CodyM3g)