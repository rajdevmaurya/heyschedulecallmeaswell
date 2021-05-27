package com.demo.audit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;

@Component
public class AuditScheduler {


	@Scheduled(cron = "0 */2 * * * *")
	@SchedulerLock(name = "shortRunningTask", lockAtMostFor = "5m", lockAtLeastFor = "1m")
	public void triggerAuditTask() throws InterruptedException {
		System.out.println("Job started to run task");
		pollJobCompleted();
		System.out.println("task ended========");
	}

	public void pollJobCompleted() throws InterruptedException {
		Thread.sleep(10000);
		System.out.println("Job completed");
	}
}
