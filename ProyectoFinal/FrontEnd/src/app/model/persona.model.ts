export class persona{
    id?: number;
    nombre: string;
    apellido: string;
    ocupacion: string;
    descripcion: string;
    img: string;

    constructor(nombre: string, apellido: string, ocupacion: string, descripcion: string, img: string){
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.descripcion = descripcion;
        this.img = img;
    }
}