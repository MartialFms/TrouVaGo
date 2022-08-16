import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HomeComponent } from './component/home/home.component';
import { HotelListComponent } from './component/hotel-list/hotel-list.component';
import { HotelDetailsComponent } from './component/hotel-details/hotel-details.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HotelListComponent,
    HotelDetailsComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
