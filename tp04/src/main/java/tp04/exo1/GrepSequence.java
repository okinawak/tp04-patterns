package tp04.exo1;

public class GrepSequence extends SequenceDecorator {

    private String pattern;

    public GrepSequence(Sequence s, String pattern) {
        super(s);
        this.pattern = pattern;
    }

    @Override
    public String ligneSuivante() {
        String ligne;
        
        while ((ligne = wrapper.ligneSuivante()) != null) {
            
            if (ligne.contains(pattern)) {
                return ligne;
            }
        }
        
        return null;
    }
}