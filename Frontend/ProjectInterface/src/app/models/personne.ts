export class Personne {

    idPerson!: number;
    lastName!: String;
    firstName!: String;
    age!: number;

    constructor(id: number,lastname: String, firstname: String, age: number) {
        this.idPerson = id;
        this.lastName = lastname;
        this.firstName = firstname;
        this.age = age;
    }

}
