//Question 8
case class Director(firstName:String, lastName:String, yearOfBirth:Int) {
  def name = firstName + " " + lastName
}

case class Film(name:String, yearOfRelease:Int, imdbRating:Double,
           director:Director) {
  def directorsAge = yearOfRelease - director.yearOfBirth
  def isDirectedBy(director:Director) = director == this.director
}

object Director {
  def older(d1:Director, d2:Director) = {
    val diff = d1.yearOfBirth - d2.yearOfBirth
    if (diff > 0) d1 else d2
  }
}

object Film {
  def highestRating(f1:Film, f2:Film) = {
    val diff = f1.imdbRating - f2.imdbRating
    if(diff > 0) f1.imdbRating else f2.imdbRating
  }

  def oldestDirectorAtTheTime(f1:Film, f2:Film) = {
    val diff = f1.directorsAge - f2.directorsAge
    if (diff > 0) f1.director else f2.director
  }
}

val stevenSpielberg = Director("Steven", "Spielberg", 1946)
val film1 = Film("Jurassic Park", 1993, 8.1, stevenSpielberg)

/*
Converting Director and Film to case classes removes the need to explicitly
state val in the default constructor. The case class also automatically
generates the apply methods and copy method.
 */