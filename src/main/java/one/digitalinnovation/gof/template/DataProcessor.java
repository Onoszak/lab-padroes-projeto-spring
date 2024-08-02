
package one.digitalinnovation.gof.template;

public abstract class DataProcessor {

    public final void process() {
        readData();
        processData();
        writeData();
    }

    protected abstract void readData();
    protected abstract void processData();
    protected abstract void writeData();
}

class XMLDataProcessor extends DataProcessor {
    protected void readData() {
        // Leitura de dados XML
    }

    protected void processData() {
        // Processamento de dados XML
    }

    protected void writeData() {
        // Escrita de dados XML
    }
}

class JSONDataProcessor extends DataProcessor {
    protected void readData() {
        // Leitura de dados JSON
    }

    protected void processData() {
        // Processamento de dados JSON
    }

    protected void writeData() {
        // Escrita de dados JSON
    }
}
