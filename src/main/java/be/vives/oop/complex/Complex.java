package be.vives.oop.complex;

/**
 * Complex
 */
public class Complex {

    private double real = 0;
    private double imaginary = 0;

    public Complex(double real,double imaginary){
        setReal(real);
        setImaginary(imaginary);
    }
    public Complex(){
        this(0,0);
    }


    public void setReal(double real){
        this.real=real;
    }
    public double getReal(){
        return real;
    }


    public void setImaginary(double imaginary){
        this.imaginary=imaginary;
    }
    public double getImaginary(){
        return imaginary;
    }


    public Complex add(Complex second){
        Complex result = new Complex();
        result.setReal(this.getReal()+second.getReal());
        result.setImaginary(this.getImaginary()+second.getImaginary());
        return result;
    }

    public Complex subtract(Complex second){
        Complex result = new Complex();
        result.setReal(this.getReal()-second.getReal());
        result.setImaginary(this.getImaginary()-second.getImaginary());
        return result;
    }

    public Complex multiply(Complex second){ // vermenigvuldigen met ander complex getal
        Complex result = new Complex();
        result.setReal((this.getReal()*second.getReal())-(this.getImaginary()*second.getImaginary()));
        result.setImaginary((this.getReal()*second.getImaginary())+(second.getReal()*this.getImaginary()));
        return result;  //(a1 + b1 i)(a2 + b2 i)=(a1a2 − b1b2) + (a1b2 + a2b1)i
    }


    public Complex multiply(double factor){ //vermenigvuldigen met 1 factor
        Complex result = new Complex();
        result.setReal(this.getReal()*factor);
        result.setImaginary(this.getImaginary()*factor);
        return result;
    }

    public Complex divide(double factor){ //delen door 1 factor
        Complex result = new Complex();
        result.setReal(this.getReal()/factor);
        result.setImaginary(this.getImaginary()/factor);
        return result;
    }

    public Complex divide(Complex second){ //delen met een complex getal
        Complex result = new Complex();
        result.setReal(((this.getReal()*second.getReal())+(this.getImaginary()*second.getImaginary()))/
                ((second.getReal()*second.getReal())+(second.getImaginary()*second.getImaginary())));
        result.setImaginary(((this.getImaginary()*second.getReal())-(this.getReal()*second.getImaginary()))/
                ((second.getReal()*second.getReal())+(second.getImaginary()*second.getImaginary())));
        return result;  
    }



    Complex(Complex copy) { 
        real = copy.real; 
        imaginary = copy.imaginary; 
    } 

    @Override
    public String toString(){
        if(imaginary<0){
            return "("+getReal() + " -" + " " + Math.abs(getImaginary()) + "j)";
        }else{
            return "("+getReal() + " + " + getImaginary() + "j)"; 
        }
     
    }

}