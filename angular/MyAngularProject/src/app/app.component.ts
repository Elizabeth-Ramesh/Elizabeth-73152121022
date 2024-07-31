import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'MyAngularProject';
 /* name : string;
  age : number;
  email : string;
  fname : string;*/
  flag : boolean;
  vehicles : string[];
  selectVehi:string;
  myStyle : {};
  myClass : string;

  constructor(){
    /*this.name="Elizabeth";
    this.age=20;
    this.email="elizabeth@gmail.com";
    this.fname="";*/
    this.flag =true;
    this.selectVehi="";
    this.vehicles=["TwoWheeler","ThreeWheeler","FourWheeler"]
    this.myStyle={'width':'40%','border':'4px solid lightblue'};
    this.myClass="MyClass1";
  }

 /*changeName(){
  this.name="loks";
 }*/
ChangeDiv(){
  this.flag=! this.flag;
}
selectVehicle(str : string){
  this.selectVehi=str;
}
changeStyle(){
  this.myStyle={'width':'70%','border':'4px solid pink'};
}
changeClass(){
  this.myClass="MyClass2";
}
}
