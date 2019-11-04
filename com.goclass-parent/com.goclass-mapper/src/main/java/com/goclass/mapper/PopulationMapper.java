package com.goclass.mapper;

public interface PopulationMapper {
	int selectNumberOfStudentByCombinationId(int id);
	int selectNumberOfTeacherBySubjectId(int id);
}
