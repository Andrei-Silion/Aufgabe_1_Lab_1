package map;

public class Main {
    public static void main(String[] args){
                int[] Noten = {34, 31, 55, 60, 72, 91, 81};
                for (int i=0; i<Noten.length; i++){
                    if (Noten[i] <= 0) throw new IllegalArgumentException("Keine - oder 0");
                }
                //Aufgabe 1
                System.out.println("Aufgabe 1");
                int[] noten_failed = aufgabe1(Noten);
                for (int i=0; i<noten_failed.length; i++){
                    System.out.println(noten_failed[i]);
                }
                //Aufgabe 2
                System.out.println("Aufgabe 2");
                System.out.println(average(Noten));
                //Aufgabe 3
                System.out.println("Aufgabe 3");
                int[] noten_aufgerundet = aufgerundet(Noten);
                for (int i=0; i<noten_aufgerundet.length; i++){
                    System.out.println(noten_aufgerundet[i]);
                }
                //Aufgabe 4
                System.out.println("Aufgabe 4");
                int note_aufgerundet_max = max_aufgerundet(Noten);
                System.out.println(note_aufgerundet_max);
            }

            /**
             * Die Funktion bekommt ein array mit Variablen von tip int
             * und gibt ein array von elementen die kleiner als 40 sind zuruck
             */
            public static int[] aufgabe1(int[] noten) {
                int[] noten1 = new int[noten.length];
                int j=0;
                for (int i=0; i<noten.length; i++){
                    if (noten[i] < 40) {
                        noten1[j]=noten[i];
                        j++;
                    }
                }
                int[] noten2 = new int[j];
                for (int i=0; i<j; i++) {
                    noten2[i] = noten1[i];
                }
                return noten2;
            }

            /**
             * Die Funktion bekommt ein array mit Variablen von tip int
             * und macht die Summe aller Variablen und teilt die Summe mit die Lange
             */
            public static int average(int[] noten){
                int s=0;
                for (int i=0; i<noten.length; i++){
                    s += noten[i];
                }
                return (s / noten.length);
            }

            // Die Funktion zeigt die Distanz bis die erste vielfach von 5

            public static int[] aufgerundet(int[] noten){
                int[] noten1 = new int[noten.length];
                for (int i=0; i<noten.length; i++){
                    if (noten[i] < 38) {
                        noten1[i] = noten[i];
                        continue;
                    }
                    int dif = 5 - noten[i] % 5;
                    if (dif < 3) {
                        noten1[i]=noten[i] + dif;
                    } else {
                        noten1[i]=noten[i];
                    }
                }
                return noten1;
            }


            public static int max_aufgerundet(int[] noten){
                int[] noten1 = new int[noten.length];
                for (int i=0; i<noten.length; i++){
                    if (noten[i] < 38) continue;
                    int dif = 5 - noten[i] % 5;
                    if (dif < 3) {
                        noten1[i]=noten[i] + dif;
                    } else {
                        noten1[i]=noten[i];
                    }
                }
                int max=0;
                for (int i=0; i<noten.length; i++){
                    if (noten1[i]>max) max=noten1[i];
                }
                return max;
            }

}
