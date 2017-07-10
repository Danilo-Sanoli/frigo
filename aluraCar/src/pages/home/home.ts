import { Component, OnInit } from '@angular/core';
import { NavController, LoadingController, AlertController } from 'ionic-angular';
import { Http } from '@angular/http';

import { ProdutoDetalhadoPage } from '../detalhe/produto';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage implements OnInit {

  public produtos;

  constructor(
    public navCtrl: NavController, 
    private _http: Http,
    private _loadingCtrl: LoadingController,
    private _alertCtrl: AlertController) {}

    ngOnInit(){
      let loader = this._loadingCtrl.create({
        content: "Carregando as Frigo informações ...",
      });

      loader.present();

      this._http.get('http://localhost:8080/produto')
        .map(res => res.json())
        .toPromise()
        .then(produtos => {
          loader.dismiss();
          this.produtos = produtos
        }).catch(err => {
          console.log(err);

          loader.dismiss();

          this._alertCtrl.create({
            title: 'Falha na conexão',
            buttons: [{text : 'Ok'}],
            subTitle: 'Não foi possível conectar-se com o Frigo Servidor, contate um administrador'
          }).present();

        });
    }

    selecionaProduto(produto){
      this.navCtrl.push(ProdutoDetalhadoPage, {produtoSelecionado: produto});
    }

}