import { Component } from '@angular/core';
import { Auth, UserDetails, User } from "@ionic/cloud-angular";

@Component({
  selector: 'page-login',
  templateUrl: 'login.html'
})
export class LoginPage {

  estaAutenticado: boolean;
  email: string;
  senha: string;

  constructor(public auth: Auth, public user: User) {
    this.estaAutenticado = this.auth.isAuthenticated();
  }

  cadastrar(){
    let dados: UserDetails = { 
       'email': this.email, 
       'password': this.senha 
    };

    this.auth.signup(dados).then(() => {
      // USUÁRIO CRIADO - PODE SER ACESSADO COM this.user
      console.log(this.user);
    }, erro => {
      // TRATAR O ERRO
      console.log("Erro no cadastro");
    });
  }

  login(){
    let dados: UserDetails = { 
       'email': this.email, 
       'password': this.senha 
    };

    this.auth.login('basic', dados).then(() => {
      // LOGIN REALIZADO COM SUCESSO
      console.log("Login realizado com sucesso");
    }).catch(erro => {
      // TRATAR O ERRO
      console.log("Erro no login");
    });
  }

  logout(){
    this.auth.logout();
  }
}