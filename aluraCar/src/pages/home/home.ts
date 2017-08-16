import { Component, OnInit } from '@angular/core';
import { NavController } from 'ionic-angular';
import { Http } from '@angular/http';

import { ItemPage } from '../item/item';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage implements OnInit {

  constructor(
    public navCtrl: NavController,
    private _http: Http) {
    }

    ngOnInit(){
      
    }

    selecionaCliente(cliente){
      this.navCtrl.push(ItemPage, {clienteSelecionado: cliente});
      // this._http.post('http://localhost:8080/pedido/salvar/1', null)
      // .subscribe(() => {

      // });
    }

}