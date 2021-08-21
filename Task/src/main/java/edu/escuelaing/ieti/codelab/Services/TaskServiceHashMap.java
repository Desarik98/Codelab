package edu.escuelaing.ieti.codelab.Services;

import edu.escuelaing.ieti.codelab.Data.Task;
import edu.escuelaing.ieti.codelab.Dto.TaskDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Service
public class TaskServiceHashMap implements TaskService {

    private final HashMap<String, Task> tasksMap = new HashMap<>();

    @Override
    public Task create(TaskDto taskDto) {
        Task task = new Task(taskDto);
        tasksMap.put(task.getId(), task);
        return task;
    }

    @Override
    public Task findById(String id) {
        if (tasksMap.containsKey(id)) {
            return tasksMap.get(id);
        }
        return null;
    }

    @Override
    public List<Task> all() {
        return new ArrayList<>(tasksMap.values());
    }

    @Override
    public boolean deleteById(String id) {
        tasksMap.remove(id);
        return !tasksMap.containsKey(id);
    }

    @Override
    public Task update(TaskDto taskDto, String id) {
        Task task = new Task(id,taskDto);
        tasksMap.put(id,task);
        return task;
    }
}
