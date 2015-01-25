package se

object ClassTestPrivate {

  def main(args: Array[String]): Unit = {
    //��renci  nesnesini olu�turuyoruz 
    val student = new Student()
    //Defautl  de�erleri ekrana  bas�yoruz
    println(student.get_student_Id)
    println(student.get_Student_Name)

    //��renci  nesnesindeki  Id ve Name de�erini   setliyoruz
    student.set_student_Id_=(10)
    student.set_Student_Name_=("Kadir")

    //De�erleri  ekrana   bas�yoruz
    println(student.get_student_Id)
    println(student.get_Student_Name)

    //��renci  nesnesindeki  Kitab  listesini de�erini   setliyoruz
    student.set_list_book_=(List("Kitab1", "Kitab2"))
    println(student.get_list_book)
    //��renci  nesnesindeki  Kitab  listesini de�erini   setliyoruz 
    student.set_list_book_=(List("Kitab1", "Kitab2", "Kitab3"))
    println(student.get_list_book)

    //clas i�indeki  public  de�i�kene  ula�abiliyoruz
    val p = new Person()
    p.name = "kadir"

  }

}

class Student() {

  private var student_Id: Int = 0
  private var student_Name: String = null

  private var liste_book: List[String] = List()

  //Getter
  def get_student_Id = student_Id

  //Setter

  def set_student_Id_=(value: Int): Unit = student_Id = value

  //Getter
  def get_Student_Name = student_Name

  //Setter

  def set_Student_Name_=(value: String): Unit = student_Name = value

  //Getter
  def get_list_book = liste_book

  //Setter
  def set_list_book_=(value: List[String]): Unit = liste_book = value

}

class Person() {
  var name = "Ali"
  var Id = 2

}
