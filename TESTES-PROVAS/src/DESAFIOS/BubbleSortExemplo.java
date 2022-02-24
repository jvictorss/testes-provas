class BubbleSortExemplo {
    public static void bubbleSort(int[] array) {
        for(int i=0; i < array.length; i++) {
            for(int j=1; j < (array.length-i); j++) {
                if(array[j-1] > array[j]){
                    int aux = array[j-1];
                    array[j-1] = array[j];
                    array[j] = aux;
                }
            }
        }
    }
    private static void imprimir(int vetor[]) {
        for (int aux: vetor){
            System.out.println(aux);
        }
    }

    public static void main(String[] args) {
        int array[] = new int[]{80, 2, 0, 100, 50, 49};
        bubbleSort(array);
        imprimir(array);
    }
}
