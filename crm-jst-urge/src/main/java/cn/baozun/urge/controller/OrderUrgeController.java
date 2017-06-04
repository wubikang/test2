package cn.baozun.urge.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.baozun.urge.bean.MarketingPlanVO;
import cn.baozun.urge.service.OrderUrgeService;

@Controller
public class OrderUrgeController {
	@Resource
	private OrderUrgeService orderUrgeService;

	/**
	 * @param planVO
	 * @return
	 */
	@RequestMapping(value = "/orderUrge/syncSavePlan.html", method = RequestMethod.POST)
	@ResponseBody
	public Integer syncSavePlan(@RequestBody MarketingPlanVO planVO) {
		System.out.println("===");
		return orderUrgeService.syncSavePlan(planVO);
	}

	@RequestMapping(value = "/orderUrge/syncUpdatePlan.html", method = RequestMethod.POST)
	@ResponseBody
	public Integer syncUpdatePlan(@RequestBody MarketingPlanVO planVO) {
		return orderUrgeService.syncUpdatePlan(planVO);
	}

	@RequestMapping(value = "/orderUrge/syncUpdateActive.html", method = RequestMethod.POST)
	@ResponseBody
	public Integer syncUpdateActive(@RequestBody MarketingPlanVO planVO) {
		return orderUrgeService.syncUpdateActive(planVO);
	}
}
