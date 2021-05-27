package com.example.esdemo.TestController;
import com.example.esdemo.Service.TestService;
import com.example.esdemo.bean.TestBean;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author: pyfysf
 * <p>
 * @qq: 337081267
 * <p>
 * @CSDN: http://blog.csdn.net/pyfysf
 * <p>
 * @blog: http://wintp.top
 * <p>
 * @email: pyfysf@163.com
 * <p>
 */
@RestController
@RequestMapping("/testes")
public class TestController {
	@Autowired
	private RestHighLevelClient restHighLevelClient;

	@Autowired
	TestService testService;

	@RequestMapping("findAll")
	public Iterable<TestBean> findAll() {

		return testService.findAll();
	}

	@RequestMapping("list")
	public String save() {
		List<TestBean> list = null;
		testService.save(list);

		return "success";
	}

	@RequestMapping("save")
	public void save(TestBean bean) {
		testService.save(bean);
	}

	@RequestMapping("findByName")
	public List<TestBean> findByName(String name) {
		return testService.findByName(name);
	}

	@RequestMapping("findByNameOrDesc")
	public List<TestBean> findByNameOrDesc(String name,String desc) {
		return testService.findByNameOrDesc(name,desc);
	}

	public void test1(){
		restHighLevelClient.asyncSearch();
	}
}


