package ru.cft.focusstart.ryazantsev;

import ru.cft.focusstart.ryazantsev.exception.StockIsEmptyException;
import ru.cft.focusstart.ryazantsev.exception.StockIsFullException;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private static final int size = 8;
    private List<Resource> resources = new ArrayList<>();

    boolean isEmpty() {
        return resources.isEmpty();
    }

    boolean isFull() {
        return resources.size() == size;
    }

    void addResource(Resource resource) throws StockIsFullException {
        if (resources.size() == size) {
            throw new StockIsFullException();
        }
        resources.add(resource);
    }

    Resource takeResource() throws StockIsEmptyException {
        if (resources.isEmpty()) {
            throw new StockIsEmptyException();
        }
        return resources.remove(resources.size() - 1);
    }
}
