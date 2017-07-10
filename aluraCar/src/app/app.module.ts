import { NgModule, ErrorHandler } from '@angular/core';
import { IonicApp, IonicModule, IonicErrorHandler } from 'ionic-angular';
import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';
import { ProdutoDetalhadoPage } from '../pages/detalhe/produto'

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';

@NgModule({
  declarations: [
    MyApp,
    HomePage,
    ProdutoDetalhadoPage
  ],
  imports: [
    IonicModule.forRoot(MyApp)
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    ProdutoDetalhadoPage
  ],
  providers: [{provide: ErrorHandler, useClass: IonicErrorHandler}]
})
export class AppModule {}