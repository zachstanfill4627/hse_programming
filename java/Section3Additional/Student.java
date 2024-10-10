public class Section3LessonObjStudent {

  // Values
  private String firstName;
  private String lastName;
  private int age;
  private String favoriteColor;


  // Default Constructor
  Student(String firstName, String lastName, int age, String favoriteColor) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.favoriteColor = favoriteColor;
  }


  // Getters and Setters for each field
  public String getFirstName() { return firstName; }

  public void setFirstName(String firstName) { this.firstName = firstName; }

  public String getLastName() { return lastName; }

  public void setLastName(String lastName) { this.lastName = lastName; }

  public int getAge() { return age; }

  public void setAge(int age) { this.age = age; }

  public String getFavoriteColor() { return favoriteColor; }

  public void setFavoriteColor(String favoriteColor) { this.favoriteColor = favoriteColor; }

  // Object Specific Methods
  public String getFullName() {
    return firstName + " " + lastName;
  }

  public String printFavoriteColor() {
    return firstName + " " + lastName + "'s favorite color is " + favoriteColor;
  }

  public String printStudentInfo() {
    StringBuilder sb = new StringBuilder();
    sb.append("- First Name: " + firstName + "\n");
    sb.append("- Last Name: " + lastName + "\n");
    sb.append("- Age: " + age + "\n");
    sb.append("- Favorite Color: " + favoriteColor + "\n");
    return sb.toString();
  }
}
