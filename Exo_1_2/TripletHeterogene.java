package Exo_1_2;

public class TripletHeterogene<T, N, V> {
  private T premier;
  private N deuxieme;
  private V troisieme;

  public TripletHeterogene(T premier, N deuxieme, V troisieme){
    this.premier = premier;
    this.deuxieme = deuxieme;
    this.troisieme = troisieme;
  }

  
  public T getPremier() {
    return premier;
  }

  public N getSecond() {
    return deuxieme;
  }

  public V getTroisieme() {
    return troisieme;
  }

  @Override
  public String toString(){
    return "<TripletHeterogene (" +premier + ","+deuxieme+","+troisieme+")>";
  }
}