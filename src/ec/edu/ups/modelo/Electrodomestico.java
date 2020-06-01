package ec.edu.ups.modelo;

import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;

@SupportedSourceVersion(SourceVersion.RELEASE_13)
public class Electrodomestico implements Comparable<Electrodomestico>{
    
    private int codigo;
    private String descripcion;
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;
    
    public Electrodomestico(int codigo){
	this.codigo = codigo;
    }
    
    public Electrodomestico(){
	
    }
    
    public int getCodigo() {
	return codigo;
    }

    public void setCodigo(int codigo) {
	this.codigo = codigo;
    }
    
    public String getDescripcion() {
	return descripcion;
    }

    public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
    }
    
    public double getPrecioBase() {
	return precioBase;
    }

    public void setPrecioBase(double precioBase) {
	this.precioBase = precioBase;
    }
    
    public String getColor() {
	return color;
    }

    public void setColor(String color) {
	this.color = color;
    }
    
    public char getConsumoEnergetico() {
	return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
	this.consumoEnergetico = consumoEnergetico;
    }
    
    public int getPeso() {
	return peso;
    }

    public void setPeso(int peso) {
	this.peso = peso;
    }
    
    public double obtenerPrecioFinal(){
	double precio = 0;
	switch(consumoEnergetico){
	    case 'A':
		precio = 100;
		break;
	    case 'B':
		precio = 80;
		break;
	    case 'C':
		precio = 60;
		break;
	    case 'D':
		precio = 50;
		break;
	    case 'E':
		precio = 30;
		break;
	    case 'F':
		precio = 10;
		break;
	}
	if(peso >= 0 && precio <= 19){
	    precio += 10;
	} else if(peso >= 20 && precio <= 49){
	    precio += 50;
	}if(peso >= 50 && precio <= 79){
	    precio += 80;
	}else if(peso >= 80){
	    precio += 100;
	}
	precio += precioBase;
	return precio;
    }

    @Override
    public int compareTo(Electrodomestico e) {
	if(this.precioBase > e.getPrecioBase())
	    return 1;
	else if(this.precioBase < e.getPrecioBase())
	    return -1;
	else
	    return 0;
    }

    @Override
    public String toString() {
	return "\nElectrodomestico: " + 
		"\nCodigo: " + codigo + 
		"\nDescripcion: " + descripcion + 
		"\nPrecio Base: " + precioBase + 
		"\nColor: " + color + 
		"\nConsumo Energetico: " + consumoEnergetico + 
		"\nPeso: " + peso;
    }
    
}
