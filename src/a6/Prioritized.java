package a6;

public interface Prioritized <V,P extends Comparable<P>> {
    V getValue();
    P getPriority();
}