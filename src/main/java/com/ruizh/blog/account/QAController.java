package com.ruizh.blog.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rzheng
 */

@RestController
public class QAController {

  @GetMapping("/")
  public String test() {
    return "hello ruizheng";
  }

}
