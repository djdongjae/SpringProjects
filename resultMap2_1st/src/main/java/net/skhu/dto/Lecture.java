package net.skhu.dto;

import lombok.Data;

@Data
public class Lecture {
	int id;
	String title;
	int professorId;
	int year;
	String semester;
	String room;
}
