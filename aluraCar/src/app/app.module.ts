import { NgModule, ErrorHandler } from '@angular/core';
import { IonicApp, IonicModule, IonicErrorHandler } from 'ionic-angular';
import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';
import { ProdutoDetalhadoPage } from '../pages/detalhe/produto';
import { ItemPage } from '../pages/item/item';
import { CarrinhoPage } from '../pages/carrinho/carrinho';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';

@NgModule({
  declarations: [
    MyApp,
    HomePage,
    ItemPage,
    ProdutoDetalhadoPage,
    CarrinhoPage
  ],
  imports: [
    IonicModule.forRoot(MyApp)
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    ItemPage,
    ProdutoDetalhadoPage,
    CarrinhoPage
  ],
  providers: [{provide: ErrorHandler, useClass: IonicErrorHandler}]
})
export class AppModule {}
