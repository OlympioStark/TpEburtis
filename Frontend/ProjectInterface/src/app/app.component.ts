import { Component, OnInit } from '@angular/core';
import {MenuItem} from 'primeng/api';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'ProjectInterface';
  items!: MenuItem[];

  ngOnInit() {
    this.items = [
      {label: 'Accueil', icon: 'pi pi-fw pi-home'},
      {label: 'Personne', icon: 'pi pi-fw pi-users'},
      /*{label: 'Edit', icon: 'pi pi-fw pi-pencil'},
      {label: 'Documentation', icon: 'pi pi-fw pi-file'},
      {label: 'Settings', icon: 'pi pi-fw pi-cog'} */
  ];
  }
}
