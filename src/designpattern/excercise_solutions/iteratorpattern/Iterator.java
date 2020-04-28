package designpattern.excercise_solutions.iteratorpattern;

import designpattern.design_pattern_examples.iterator.Product;

public interface Iterator<T extends Product> {
    boolean hasNext();
    void next();
    T current();
}
