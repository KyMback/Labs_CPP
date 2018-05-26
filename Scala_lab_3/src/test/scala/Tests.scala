import org.scalatest.{FlatSpec, Matchers}

class Tests extends FlatSpec with Matchers{
  "Numbers" should "return 10" in {
    Start.Numbers(5) should be (10)
  }

  it should "return 2" in {
    Start.Numbers(6) should be (2)
  }

  "NotificationToString" should "return true" in {
    Start.NotificationToString(Email("Sender", "Title", "Body")) should be ("sender - Sender\ntitle - Title\nbody - Body\n")
  }

  it should "return true_2" in {
    Start.NotificationToString(SMS("Caller", "Message")) should be ("caller - Caller\nmessage - Message\n")
  }

  it should "return false" in {
    Start.NotificationToString(VoiceRecording("Name", "Link")) should be ("name - Name\nlink - Link\n")
  }
}
