import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Personne } from '../models/personne';

@Injectable({
  providedIn: 'root'
})
export class PersonneService {

  private baseURL = "http://localhost:8080/v1/api/rest/person";

  constructor(private httpClient: HttpClient) { }

  getAllPerson(): Observable<PersonneService[]> {
    return this.httpClient.get<PersonneService[]>(this.baseURL);
  }
}
