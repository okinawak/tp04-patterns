package tp04.exo1;

public abstract class SequenceDecorator implements Sequence {
    
    protected Sequence wrapper;

    public SequenceDecorator(Sequence s) {
        this.wrapper = s;
    }

    @Override
    public abstract String ligneSuivante();
}