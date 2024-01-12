package lr5.Example52;

public class Test {
    private char startSymbol;
    private char endSymbol;
    public Test(char startSymbol, char endSymbol) {
        this.startSymbol = startSymbol;
        this.endSymbol = endSymbol;
    }
    public void displaySymbolRange() {
        for (char symbol = startSymbol; symbol <= endSymbol; symbol++) {
            System.out.print(symbol + " ");
        }
        System.out.println();
    }
}
