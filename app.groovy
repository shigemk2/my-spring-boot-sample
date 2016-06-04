@RestController
class MyBootApp {
  @RequestMapping("/")
  def top() {
    "<html><body><h1>Hello</h1><p>this is the test page.</p></body></html>"
  }
}