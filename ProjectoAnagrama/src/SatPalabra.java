import java.util.Comparator;


public class SatPalabra implements Comparator<Palabra>{
 public int compare(Palabra arg0, Palabra arg1) {
  int ns;
  int aux = arg0.getPalabra().length() - arg1.getPalabra().length();
  if(aux<0) ns = -1;
  else if (aux> 0) ns = 1;
  else ns = arg0.compareTo(arg1);
  return ns;
 }

}