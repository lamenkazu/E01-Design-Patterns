package decorator;

public class Salada extends IngredienteDecorator{


    public Salada(){
        super(null);
    }

    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }


    @Override
    public String imprimeIngrediente() {
        String ingredientes = "Salada";

        if(super.ingrediente != null)
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {
        double valor = 0.25;

        if(super.ingrediente != null)
            valor += super.ingrediente.valorDoIngrediente();

        return valor;
    }
}
