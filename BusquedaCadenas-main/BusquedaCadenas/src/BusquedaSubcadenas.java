public class BusquedaSubcadenas {
    public int buscar(String cadena, String subcadena) {
        int longitudCadena = cadena.length();
        int longitudSubcadena = subcadena.length();
        for (int i = 0; i <= longitudCadena - longitudSubcadena; i++) {
            int j;
            for (j = 0; j < longitudSubcadena; j++) {
                if (cadena.charAt(i + j) != subcadena.charAt(j)) {
                    break;
                }
            }
            if (j == longitudSubcadena) {
                return i;
            }
        }
        return -1;
    }
}
