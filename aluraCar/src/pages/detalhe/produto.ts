import { Component } from '@angular/core';
import { NavParams } from 'ionic-angular';

@Component({
    templateUrl: 'produto.html'
})
export class ProdutoDetalhadoPage { 

    public produto;

    constructor(public navParams: NavParams){

        this.produto = navParams.get('produtoSelecionado');

    }

}