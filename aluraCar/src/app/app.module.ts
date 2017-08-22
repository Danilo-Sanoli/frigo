import { NgModule, ErrorHandler } from '@angular/core';
import { IonicApp, IonicModule, IonicErrorHandler } from 'ionic-angular';
import { CloudSettings, CloudModule } from '@ionic/cloud-angular';
import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';
import { ProdutoDetalhadoPage } from '../pages/detalhe/produto';
import { ItemPage } from '../pages/item/item';
import { CarrinhoPage } from '../pages/carrinho/carrinho';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';

const cloudSettings: CloudSettings = {
  'core': {
    'app_id': '322469c4'
  }
};

@NgModule({
  declarations: [
    MyApp,
    HomePage,
    ItemPage,
    ProdutoDetalhadoPage,
    CarrinhoPage
  ],
  imports: [
    IonicModule.forRoot(MyApp),
    CloudModule.forRoot(cloudSettings)
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
