package Exo_1_1;

class Triplet<T> {

  private T premier, second, troisieme;

  public Triplet (T premier, T second, T troisieme) {
    this.premier = premier;
    this.second = second;
    this.troisieme = troisieme;
  }

  public T getPremier() {
    return premier;
  }

  public T getSecond() {
    return second;
  }

  public T getTroisieme() {
    return troisieme;
  }

  public void afficher() {
    System.out.println("<premier : " + premier + ", second : " + second + ", troisieme : " + troisieme + ">");
  }

  
}