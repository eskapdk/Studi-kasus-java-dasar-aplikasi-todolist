public class AplikasiTodolist {
    
    public static String[] data = new String[10];
    public static void main(String[] args) {
        
    }

    /**
     * menampilkan todo list
     */
    public static void tampilTodoList() {
        for (var i = 0; i<data.length; i++){
            var todo = data[i];
            var no = i+1;

            if (todo != null) {
                System.out.println(no+". "+todo);
            }
        }
    }

    /**
     * menambahkan todo list
     */

    public static void tambahTodoList() {
        
    }

    /**
     * menghapus TodoList
     */

    public static void hapusTodoList() {
        
    }

    /**
     * tampilan menampilkan todolist
     */
    public static void viewTampilTodoList() {
        
    }

    /**
     * tampilan menambahkan todo list
     */
    
    public static void viewtambahTodoList() {
        
    }

    /**
     * tampilan menghapus todo list
     */
    public static void viewhapusTodoList() {
        
    }


}
