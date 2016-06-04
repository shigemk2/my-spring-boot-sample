@Controller
class MyBootApp {
  @RequestMapping("/")
  @ResponseBody
  def top() {
    "<html><body><h1>Hello</h1><p>this is @Controller annotation page.</p></body></html>"
  }
}