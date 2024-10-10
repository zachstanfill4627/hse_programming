import java.util.Scanner;

public class StarWars {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What StarWars Movie would you like to watch?");
    System.out.println(getStarWarsMovieList());
    System.out.println();

    int movieSelection = keyboard.nextInt();

    // Conditional to validate input - We don't have options for outside the list
    if(movieSelection < 0 || movieSelection > 11) {
      System.out.println("Invalid movie selection - Please restart and try again");
      System.exit(1);
    }

    // Conditional for Movie Quality
    if(movieSelection == 5) {
      System.out.println("This is, without question, the best StarWars Movie");
    } else if (movieSelection == 3) {
      System.out.println("This movie is great, and pivotal to the overall story");
    } else if((movieSelection >= 1 && movieSelection <= 2) || movieSelection == 4  ||
              (movieSelection >= 6 && movieSelection <= 8)) {
      System.out.println("This movie is alright and contributes to the story");
    } else {
      System.out.println("This movie is awful and isn't worth watching");
    }
  }

  public static String getStarWarsMovieList() {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(" 1.  " + new StarWarsMovie(1, "The Phantom Menace").printFullMovieString()+ "\n");
    stringBuffer.append(" 2.  " + new StarWarsMovie(2, "Attack of the Clones").printFullMovieString() + "\n");
    stringBuffer.append(" 3.  " + new StarWarsMovie(3, "Revenge of the Sith").printFullMovieString() + "\n");
    stringBuffer.append(" 4.  " + new StarWarsMovie(0, "Solo").printFullMovieString() + "\n");
    stringBuffer.append(" 5.  " + new StarWarsMovie(0, "Rogue One").printFullMovieString() + "\n");
    stringBuffer.append(" 6.  " + new StarWarsMovie(4, "A New Hope").printFullMovieString() + "\n");
    stringBuffer.append(" 7.  " + new StarWarsMovie(5, "The Empire Strikes Back").printFullMovieString() + "\n");
    stringBuffer.append(" 8.  " + new StarWarsMovie(6, "Return of the Jedi").printFullMovieString() + "\n");
    stringBuffer.append(" 9.  " + new StarWarsMovie(7, "The Force Awakens").printFullMovieString() + "\n");
    stringBuffer.append(" 10. " + new StarWarsMovie(8, "The Last Jedi").printFullMovieString() + "\n");
    stringBuffer.append(" 11. " + new StarWarsMovie(9, "The Rise of Skywalker").printFullMovieString() + "\n");
    return stringBuffer.toString();
  }

  /**
   * Simple StarWarsMovie Object
   *
   * order - STORY ORDER ONLY - The other orders don't matter, seriously
   */
  static class StarWarsMovie {
    private int order;
    private String name;

    public StarWarsMovie(int order, String name) {
      this.order = order;
      this.name = name;
    }

    public int getOrder() { return order; }
    public void setOrder(int order) { this.order = order; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String printFullMovieString() {
      if ( order != 0) {
        return "Star Wars : Episode " + order + " : " + name;
      } else {
        return "Star Wars : Story     : " + name;
      }
    }
  }
}
