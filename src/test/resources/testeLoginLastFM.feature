  #language: pt
  #enconding: UTF-8
  #author: iuriraredu
  #date: 11/05/2021
  #version: 1.0

  Funcionalidade: Realizar login no LastFM
    Como usuário do LastFm
    Quero realizar login no site
    Para visualizar minhas tabelas de músicas executadas

    @login @web @LastFM
    Cenário: Logar no LastFM com dados válidos
      Dado que relizou login com credenciais válidas
      Quando clico na imagem do usuário no canto superior direito
      Entao sou redirecionado para o perfil "seleniumgomes"
