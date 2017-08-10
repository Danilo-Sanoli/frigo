import { Component, OnInit } from '@angular/core';
import { NavController } from 'ionic-angular';

import { ItemPage } from '../item/item';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage implements OnInit {

  constructor(
    public navCtrl: NavController) {}

    ngOnInit(){

    }

    selecionaCliente(cliente){
      this.navCtrl.push(ItemPage, {clienteSelecionado: cliente});
    }

}