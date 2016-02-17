//Question 5
class Director(val firstName:String, val lastName:String, val yearOfBirth:Int) {
  def name = firstName + " " + lastName
}

class Film(val name:String, val yearOfRelease:Int, val imdbRating:Double,
           val director:Director) {

  def directorsAge = yearOfRelease - director.yearOfBirth

  def isDirectedBy(director:Director) = director == this.director

  def copy(name:String = this.name,
           yearOfRelease:Int = this.yearOfRelease,
           imdbRating:Double = this.imdbRating,
           director:Director = this.director) = {
    new Film(name, yearOfRelease, imdbRating, director)
  }
}



//Question 6
object Director {
  def apply(firstName:String, lastName:String, yearOfBirth:Int) = {
    new Director(firstName, lastName, yearOfBirth)
  }

  def older(d1:Director, d2:Director) = {
    val diff = d1.yearOfBirth - d2.yearOfBirth
    if (diff > 0) d1 else d2
  }
}

object Film {
  def apply(name:String, yearOfRelease:Int, imdbRating:Double, director:Director) = {
    new Film(name, yearOfRelease, imdbRating, director)
  }

  def highestRating(f1:Film, f2:Film) = {
    val diff = f1.imdbRating - f2.imdbRating
    if(diff > 0) f1.imdbRating else f2.imdbRating
  }

  def oldestDirectorAtTheTime(f1:Film, f2:Film) = {
    val diff = f1.directorsAge - f2.directorsAge
    if (diff > 0) f1.director else f2.director
  }
}



//Question 7
/*
a) val prestige: Film = bestFilmByChristopherNolan()
   ANS: VALUE

b) new Film("Last Action Hero", 1993, mcTiernan)
   ANS: TYPE

c) Film("Last Action Hero", 1993, mcTiernan)
   ANS: VALUE

d) Film.newer(highPlainsDrifter, thomasCrownAffair)
   ANS: VALUE

e) Film.type
   ANS: VALUE
 */