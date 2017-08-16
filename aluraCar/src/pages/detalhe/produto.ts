import { Component, OnInit } from '@angular/core';
import { NavController } from 'ionic-angular';
import { NavParams } from 'ionic-angular';
import { Http, Headers, RequestOptions } from '@angular/http';

import { CarrinhoPage } from '../carrinho/carrinho'; 

@Component({
    selector: 'produto',
    templateUrl: 'produto.html'
})
export class ProdutoDetalhadoPage implements OnInit { 

    public produto;
    public descricao;
    public item;

    constructor(
        public navCtrl: NavController,
        public navParams: NavParams,
        private _http: Http){
    }

    ngOnInit(){
        this.produto = this.navParams.get('produtoSelecionado');
    }

    addCarrinho(){
        let header = new Headers({'Content-Type': 'application/json'});
        header.append('access_token', "abcd");
        let options = new RequestOptions({ headers: header });
        this.item = {idProduto: this.produto.id, idPedido: 1, descricao: this.descricao};
        this._http.post('http://localhost:8080/item/salvar', JSON.stringify(this.item), options)
        .map(res =>  this.navCtrl.push(CarrinhoPage, {pedidoSelecionado: 1}))
        .subscribe(
            data => { console.log(data); },
            err => { console.log(err); }
        );

    }

}