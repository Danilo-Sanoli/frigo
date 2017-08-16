import { Component, OnInit } from '@angular/core';
import { NavController, LoadingController, AlertController, NavParams } from 'ionic-angular';
import { Http } from '@angular/http';

@Component({
    templateUrl: 'carrinho.html'
})
export class CarrinhoPage implements OnInit {

  public items;
  public pedido;

  constructor(
    public navCtrl: NavController,
    public navParams: NavParams, 
    private _http: Http,
    private _loadingCtrl: LoadingController,
    private _alertCtrl: AlertController) {
    }

    ngOnInit(){

      this.pedido = this.navParams.get('pedidoSelecionado');

      let loader = this._loadingCtrl.create({
        content: "Carregando as Frigo informações ...",
      });

      loader.present();

      this._http.get('http://localhost:8080/item/pedido/' + this.pedido)
        .map(res => res.json())
        .toPromise()
        .then(items => {
          loader.dismiss();
          this.items = items
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

}