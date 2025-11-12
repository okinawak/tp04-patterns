package tp04.exo1;

public class SliceSequence extends SequenceDecorator {

    private int start;
    private int stop;
    
    private LineNumberSequence lineNumberTracker;

    public SliceSequence(Sequence s, int start, int stop) {
        
        super(new LineNumberSequence(s)); 
        
        this.lineNumberTracker = (LineNumberSequence) this.wrapper; 
        
        this.start = start;
        this.stop = stop;
    }

    @Override
    public String ligneSuivante() {
        String ligne;
        
        while ((ligne = lineNumberTracker.ligneSuivante()) != null) {            
            int currentLineNum = lineNumberTracker.getLineNumber();             
            if (currentLineNum < start) {
                continue;
            }
            
            if (currentLineNum >= stop) {
                return null; 
            }
            
            return ligne;
        }
        
        return null; 
    }
}