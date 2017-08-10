import { Component, OnInit } from '@angular/core';
import { NavController, LoadingController, AlertController, NavParams } from 'ionic-angular';
import { Http } from '@angular/http';

import { ProdutoDetalhadoPage } from '../detalhe/produto'; 

@Component({
    templateUrl: 'item.html'
})
export class ItemPage implements OnInit {

  public cliente;
  public produtos;

  constructor(
    public navCtrl: NavController,
    public navParams: NavParams, 
    private _http: Http,
    private _loadingCtrl: LoadingController,
    private _alertCtrl: AlertController) {
    }

    ngOnInit(){

      this.cliente = this.navParams.get('clienteSelecionado');

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