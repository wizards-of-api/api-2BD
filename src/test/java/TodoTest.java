import com.tg.manager.model.ToDoModel;
import org.junit.Test;

public class TodoTest {

    @Test
    public void getIdToDo(){
        System.out.println(ToDoModel.filterTodoForDelete(10));
    }

    @Test
    public void getToDoNoteFeedback(){
        System.out.println(ToDoModel.filterTodo(16));
    }

    @Test
    public void updateNoteAndFeed(){
        try {
            ToDoModel.toDoValidator(6, 18, 7.0, "test");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
