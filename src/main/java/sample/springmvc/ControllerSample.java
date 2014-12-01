package sample.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerSample {

    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public String welcome() {
        return "welcome";
    }

    @RequestMapping(value = "/sample_ignore", params = "execute=jspGetProperty", method = RequestMethod.POST)
    public ModelAndView displayJspGetProperty() {
        ModelAndView mav = new ModelAndView("jspGetProperty");
        MessageBean mBean = new MessageBean();
        mBean.setMessage("Hello world!");
        mav.addObject("mBean", mBean);
        return mav;
    }

    @RequestMapping(value = "/sample_ignore", params = "execute=coreOut", method = RequestMethod.POST)
    public ModelAndView displayCoreOut() {
        ModelAndView mav = new ModelAndView("coreOut");
        MessageBean mBean = new MessageBean();
        mBean.setMessage("Hello world!");
        mav.addObject("mBean", mBean);
        return mav;
    }
}
