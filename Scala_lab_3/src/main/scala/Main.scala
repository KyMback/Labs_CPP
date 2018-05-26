
//object Main {
//  def main(args: Array[String]): Unit = {
//    //println(Start.Numbers(30))
//    println(Start.NotificationToString(Email("Sender", "Title", "Body")))
//    println(Start.NotificationToString(SMS("Caller", "Message")))
//    println(Start.NotificationToString(VoiceRecording("Name", "Link")))
//  }
//
//}

object Start {
  def Numbers(num: Int): Int = {
    num match {
      case a if num % 5 == 0 => a * 2
      case b if num % 6 == 0 => b / 3
    }
  }

  def NotificationToString(not: Notification): String ={
    not match {
      case a: Email => String.format("sender - %s\ntitle - %s\nbody - %s\n", a.Sender, a.Title, a.Body)
      case a: SMS => String.format("caller - %s\nmessage - %s\n", a.Caller, a.Message)
      case a: VoiceRecording => String.format("name - %s\nlink - %s\n", a.Name, a.Link)
    }
  }
}


abstract class Notification

case class Email(Sender: String, Title: String, Body: String) extends Notification

case class SMS(Caller: String, Message: String) extends Notification

case class VoiceRecording(Name: String, Link: String) extends Notification
