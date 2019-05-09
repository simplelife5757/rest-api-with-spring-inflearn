package me.simplelife57.demoinflearnrestapi.events;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EventTest {

	@Test
	public void builder() {
		Event event = Event.builder()
				.name("Inflearn Sprint Rest Api")
				.description("Rest Api development with Spring")
				.build();
		assertThat(event).isNotNull();
	}

	@Test
	public void javaBean() {
		// Given
		String description = "Spring";
		String name = "Event";

		// When
		Event event = new Event();
		event.setName(name);
		event.setDescription(description);

		// Then
		assertThat(event.getName()).isEqualTo(name);
		assertThat(event.getDescription()).isEqualTo(description);
	}
}