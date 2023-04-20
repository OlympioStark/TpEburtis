import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser'; 
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http'

import { TabMenuModule } from 'primeng/tabmenu';
import { TableModule } from 'primeng/table';
import { InputTextModule } from 'primeng/inputtext';
import { CheckboxModule } from 'primeng/checkbox';
import { RadioButtonModule } from 'primeng/radiobutton';
import { ButtonModule } from 'primeng/button';
import { DialogModule } from 'primeng/dialog';
import { DynamicDialogModule } from 'primeng/dynamicdialog';
import { FormsModule } from '@angular/forms';
import { ToastModule } from 'primeng/toast';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersonneListComponent } from './pages/personne/personne-list/personne-list.component';
import { AddPersonneComponent } from './pages/personne/add-personne/add-personne.component';
import { HomeComponent } from './pages/home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    PersonneListComponent,
    AddPersonneComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    HttpClientModule,
    TabMenuModule,
    TableModule,
    InputTextModule,
    CheckboxModule,
    RadioButtonModule,
    ButtonModule,
    DialogModule,
    DynamicDialogModule,
    FormsModule,
    ToastModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
