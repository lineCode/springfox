package springfox.documentation.spring.web.dummy.controllers;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.spring.web.dummy.models.Pet;

@Controller
@ApiIgnore
@RequestMapping("/excluded")
@Api(value = "", description = "Operations that are excluded")
public class ExcludedService {
  @RequestMapping(method = RequestMethod.POST)
  public void someExcludedOperation(
          @ApiParam(value = "Pet object that needs to be added to the store", required = true) Pet pet) {
    throw new RuntimeException("NotImplementedException");
  }

  @RequestMapping(value = "/another", method = RequestMethod.POST)
  public void anotherExcludedOperation(
          @ApiParam(value = "Pet object that needs to be added to the store", required = true) Pet pet) {
    throw new RuntimeException("NotImplementedException");
  }
}