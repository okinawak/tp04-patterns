package tp04.exo1;

public class LineNumberSequence extends SequenceDecorator {

    private int lineNumber = 0;

    public LineNumberSequence(Sequence s) {
        super(s);
    }

    @Override
    public String ligneSuivante() {
        String ligne = wrapper.ligneSuivante();
        
        if (ligne != null) {
            lineNumber++; 
        }
        
        return ligne; 
    }

    
    public int getLineNumber() {
        return lineNumber;
    }
}