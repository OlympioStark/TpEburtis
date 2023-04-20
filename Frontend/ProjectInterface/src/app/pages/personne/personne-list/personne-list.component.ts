import { Component, OnInit } from '@angular/core';
import { Table } from 'primeng/table';
import { Personne } from 'src/app/models/personne';
import { PersonneService } from 'src/app/services/personne.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-personne-list',
  templateUrl: './personne-list.component.html',
  styleUrls: ['./personne-list.component.css']
})
export class PersonneListComponent implements OnInit {

  personnes!: Personne[];
  // personne!: Personne;

  loading: boolean = false;

  activityValues: number[] = [0, 100];

  constructor(private personneService: PersonneService, private router: Router) {}

  ngOnInit() {
      this.personneService.getAllPerson().subscribe((data: any) => {
        this.personnes = data;
        this.loading = false;
        console.log(this.personnes);

        
      })
  }

  newPerson() {
  
  }

  updatePerson() {

  }

  deletePerson() {}

}
