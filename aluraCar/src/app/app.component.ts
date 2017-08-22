import { Component, ViewChild } from '@angular/core';
import { Platform, Nav } from 'ionic-angular';
import { StatusBar, Splashscreen } from 'ionic-native';

// import { LoginPage } from '../pages/login/login';
import { HomePage } from '../pages/home/home';
import { ItemPage } from '../pages/item/item';
import { CarrinhoPage } from '../pages/carrinho/carrinho';

@Component({
  templateUrl: 'app.html'
})
export class MyApp {
  @ViewChild(Nav) nav: Nav;

  rootPage = HomePage; 
 
  pages: Array<{title: string, component: any}>;
 
  constructor(public platform: Platform) {
    this.initializeApp();

    this.pages = [
      { title: 'Clientes', component: HomePage },
      { title: 'Produtos', component: ItemPage },
      { title: 'Itens do Pedido', component: CarrinhoPage }
    ];
 
  }

  openPage(page) {
    this.nav.setRoot(page.component);
  }

  initializeApp() {
    this.platform.ready().then(() => {
      StatusBar.styleDefault();
      Splashscreen.hide();
    });
  }
}
