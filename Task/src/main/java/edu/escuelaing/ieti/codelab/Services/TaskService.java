package edu.escuelaing.ieti.codelab.Services;

import edu.escuelaing.ieti.codelab.Data.Task;
import edu.escuelaing.ieti.codelab.Dto.TaskDto;

import java.util.List;

public interface TaskService {

    Task create(TaskDto taskDto);

    Task findById(String id );

    List<Task> all();

    boolean deleteById( String id );

    Task update(TaskDto taskDto, String id );
}
