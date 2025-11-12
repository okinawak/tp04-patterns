package tp04.exo1;

public class UpperCaseDecoratorSequence extends SequenceDecorator {

    public UpperCaseDecoratorSequence(Sequence s) {
        super(s);
    }

    @Override
    public String ligneSuivante() {
        
        String ligne = wrapper.ligneSuivante();
                
        if (ligne != null) {
            return ligne.toUpperCase();
        }
        
        return null; 
    }
}