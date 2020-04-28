package designpattern.excercise_solutions.iteratorpattern;

import designpattern.design_pattern_examples.iterator.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Product remove(){
        int lastProductIndex = products.size() - 1;
        Product lastProduct = products.get(lastProductIndex);
        products.remove(lastProductIndex);
        return lastProduct;
    }

    public Iterator createIterator(){
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<Product>{

        ProductCollection productCollection;
        int index;

        public ListIterator(ProductCollection productCollection) {
            this.productCollection = productCollection;
        }

        @Override
        public boolean hasNext() {
            return index > productCollection.products.size();
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public Product current() {
            return productCollection.products.get(index);
        }
    }
}
