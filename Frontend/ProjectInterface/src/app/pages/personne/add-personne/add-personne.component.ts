import { Component } from '@angular/core';
import { Personne } from 'src/app/models/personne';
import { MessageService } from 'primeng/api';
import { DialogService, DynamicDialogRef } from 'primeng/dynamicdialog';

@Component({
  selector: 'app-add-personne',
  templateUrl: './add-personne.component.html',
  styleUrls: ['./add-personne.component.css']
})
export class AddPersonneComponent {

  person!: Personne;

  visible?: boolean;

  constructor() {}

  

}
