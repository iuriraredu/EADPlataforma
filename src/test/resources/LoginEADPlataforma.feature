#language: pt
#encoding: UTF-8
#Author: Iuri Ramos Reducino
#date: 05/10/2021
#version: 1.0

  Funcionalidade: Login
    Como um aluno do site eadplataforma
    Quero fazer login
    Para ter acesso aos

    Contexto:
      Dado que estou na página home do site

    @web
    Cenário: Login com sucesso
      E clico Login
      E preencho os campos de login com dados válidos para acesso
      Quando clico no botão "Entrar"
      Então sou redirecionado para a tela "Home"