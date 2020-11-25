package by.intexsoft.ignatieva;

public class Application {
    public static void main(String args[]) {
        int[][] matrixSpiral = Spiral.fillInMatrixSpiral(5);
        int[][] matrixPyramid = Pyramid.fillInMatrixPyramid(7);
        Printer.print(matrixSpiral);
        Printer.print(matrixPyramid);
    }
}
