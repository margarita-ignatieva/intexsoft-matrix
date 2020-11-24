package by.intexsoft.ignatieva;

public class Application {
    public static void main(String args[]) {
        int[][] matrixSpiral = Spiral.fillInMatrixSpiral(6);
        int[][] matrixPyramid = Pyramid.fillInMatrixPyramid(6);
        Printer.print(matrixSpiral);
        Printer.print(matrixPyramid);
    }
}
