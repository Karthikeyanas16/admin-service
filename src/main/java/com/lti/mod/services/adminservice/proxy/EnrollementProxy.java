package com.lti.mod.services.adminservice.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.lti.mod.services.adminservice.model.Enrollment;

@FeignClient(name="enrollment-services", url="${feign.client.default-config}")
public interface EnrollementProxy {

	@GetMapping("/findall")
	public List<Enrollment> getAllEnrollments();
	

}
