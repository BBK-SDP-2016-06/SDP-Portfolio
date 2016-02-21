//Question 7

/*
Create a simple model for publisher data. Code a set of traits and classes
according to the following description:

• A publication is a book or a periodical.
• A book has an author while a periodical has an editor.
• Periodicals have many issues, each of which has a volume and an issue
  number.
• A manuscript is a document of a certain length written by an author.
• A book is a manuscript, but an issue of a periodical contains a sequence of
  manuscripts

Tip: a sequence of type A has type Seq[A].
 */

//trait Publication
//trait Manuscript {
//  def length: Int
//  def author: Author
//}
//case class Book(a: Author, pages: Int) extends Manuscript with Publication {
//  override def length = pages
//  override def author = a
//}
//case class Periodical(editor: Editor,
//                      issues: Seq[Issue]) extends Publication
//
//case class Author()
//case class Editor()
//case class Issue(vol: Int, issueNo: Int, articles: Seq[Manuscript])

//Alternative solution -----------------------------------------------------

sealed trait Publication
final case class Book(script: Manuscript) extends Publication
final case class Periodical(editor: Editor,
                            issues: Seq[Issue]) extends Publication

case class Author()
case class Editor()
case class Issue(vol: Volume, issueNot: Int, articles: Seq[Manuscript])
case class Volume()

case class Manuscript(length: Int, author: Author)