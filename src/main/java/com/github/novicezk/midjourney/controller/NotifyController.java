package com.github.novicezk.midjourney.controller;

import com.github.novicezk.midjourney.support.task.Task;
import com.github.novicezk.midjourney.support.task.TaskHelper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/notify")
@RequiredArgsConstructor
public class NotifyController {
  private final NotifyService notifyService;
	private final NotifyService notifyService;
	private final TaskHelper taskHelper;

	@GetMapping("/list")
	public void list() {
		notifyService.notifyTaskChange();
	}
}
