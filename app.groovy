@Grab("thymeleaf-spring4")

@Controller
class MyBootApp {
  @RequestMapping("/")
  @ResponseBody
  def top(ModelAndView mv) {
    mv.setViewName("index")
    mv
  }
}