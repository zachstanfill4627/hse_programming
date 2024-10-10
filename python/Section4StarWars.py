class StarWarsMovie:
  """
  Simple StarWarsMovie Object

  order - STORY ORDER ONLY - The other orders don't matter, seriously
  """
  def __init__(self, order, name):
    self.order = order
    self.name = name

  def getMovieFullName(self):  # Renamed method as requested
    if self.order != 0:
      return f"Star Wars : Episode {self.order} : {self.name}"
    else:
      return f"Star Wars : Story     : {self.name}"


def getStarWarsMovieList():
  """
  Returns a formatted string of Star Wars movies.
  """
  # Using f-strings directly for formatting, no loop
  movie_list = (
      f" 1.  {StarWarsMovie(1, 'The Phantom Menace').getMovieFullName()}\n"
      f" 2.  {StarWarsMovie(2, 'Attack of the Clones').getMovieFullName()}\n"
      f" 3.  {StarWarsMovie(3, 'Revenge of the Sith').getMovieFullName()}\n"
      f" 4.  {StarWarsMovie(0, 'Solo').getMovieFullName()}\n"
      f" 5.  {StarWarsMovie(0, 'Rogue One').getMovieFullName()}\n"
      f" 6.  {StarWarsMovie(4, 'A New Hope').getMovieFullName()}\n"
      f" 7.  {StarWarsMovie(5, 'The Empire Strikes Back').getMovieFullName()}\n"
      f" 8.  {StarWarsMovie(6, 'Return of the Jedi').getMovieFullName()}\n"
      f" 9.  {StarWarsMovie(7, 'The Force Awakens').getMovieFullName()}\n"
      f" 10. {StarWarsMovie(8, 'The Last Jedi').getMovieFullName()}\n"
      f" 11. {StarWarsMovie(9, 'The Rise of Skywalker').getMovieFullName()}\n"
  )
  return movie_list


# --- Main execution flow (without a main function) ---

print("What StarWars Movie would you like to watch?")
print(getStarWarsMovieList())
print()

movieSelection = int(input())

# Conditional to validate input - We don't have options for outside the list
if movieSelection < 0 or movieSelection > 11:
  print("Invalid movie selection - Please restart and try again")
  exit(1)

# Conditional for Movie Quality
if movieSelection == 5:
  print("This is, without question, the best StarWars Movie")
elif movieSelection == 3:
  print("This movie is great, and pivotal to the overall story")
elif ((movieSelection >= 1 and movieSelection <= 2) or movieSelection == 4 or
      (movieSelection >= 6 and movieSelection <= 8)):
  print("This movie is alright and contributes to the story")
else:
  print("This movie is awful and isn't worth watching")