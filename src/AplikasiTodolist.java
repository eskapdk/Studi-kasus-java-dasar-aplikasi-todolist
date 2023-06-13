public class AplikasiTodolist {

    public static String[] data = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewTampilTodoList();

    }

    /**
     * menampilkan todo list
     */
    public static void tampilTodoList() {
        System.out.println("TODO LIST");
        for (var i = 0; i < data.length; i++) {
            var todo = data[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testTampilTodoList() {
        data[0] = "Makan";
        data[1] = "Mandi";
        data[2] = "Belajar";
        tampilTodoList();
    }

    /**
     * menambahkan todo list
     */

    public static void tambahTodoList(String todo) {

        // cek apakah data penuh?
        var isFull = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                isFull = false;
                break;
            }
        }

        // jika penuh ukuran array dirubah menjadi 2x lipat
        if (isFull) {
            var temp = data;
            data = new String[data.length * 2];

            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }

        // tambahkan posis data ke array yang null
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todo;
                break;
            }
        }
    }

    public static void testTambahTodoList() {
        for (int i = 0; i < 25; i++) {
            tambahTodoList("Contoh todo list ke-" + i);
        }
        tampilTodoList();
    }

    /**
     * menghapus TodoList
     */

    public static boolean hapusTodoList(Integer number) {
        if ((number - 1) >= data.length) {
            return false;
        } else if (data[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < data.length; i++) {
                if (i == (data.length - 1)) {
                    data[i] = null;
                } else {
                    data[i] = data[i + 1];
                }
            }
            return true;
        }
    }

    public static void testHapusTodoList() {
        tambahTodoList("satu");
        tambahTodoList("dua");
        tambahTodoList("tiga");
        tambahTodoList("empat");
        tambahTodoList("lima");

        var hasil = hapusTodoList(20);
        System.out.println(hasil);

        hasil = hapusTodoList(7);
        System.out.println(hasil);

        hasil = hapusTodoList(2);
        System.out.println(hasil);

        tampilTodoList();
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String input = scanner.nextLine();
        return input;
    }

    public static void testinput() {
        var name = input("Nama");
        System.out.println("Hallo " + name);
        var alamat = input("Alamat");
        System.out.println("Alamat " + alamat);
    }

    /**
     * tampilan menampilkan todolist
     */
    public static void viewTampilTodoList() {

        while (true) {
            tampilTodoList();
            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");

            if (input.equals("1")) {
                viewtambahTodoList();
            } else if (input.equals("2")) {
                viewhapusTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak valid");
            }
        }
    }

    public static void testiewTampilTodoList() {
        tambahTodoList("satu");
        tambahTodoList("dua");
        tambahTodoList("tiga");
        tambahTodoList("empat");
        tambahTodoList("lima");

        viewTampilTodoList();
    }

    /**
     * tampilan menambahkan todo list
     */

    public static void viewtambahTodoList() {
        System.out.println("Tambah TODO LIST");

        var todo = input("Todo (x jika batal) ");

        if (todo.equals("x")) {
            // batal
        } else {
            tambahTodoList(todo);
        }
    }

    public static void testViewtambahTodoList() {
        tambahTodoList("satu");
        tambahTodoList("dua");

        viewtambahTodoList();

        tampilTodoList();

    }

    /**
     * tampilan menghapus todo list
     */
    public static void viewhapusTodoList() {
        System.out.println("Hapus TODO LIST");
        var number = input("Nomor yang dihapus (x jika batal) ");
        if (number.equals("x")) {
            //batal
        } else {
            boolean sukses = hapusTodoList(Integer.valueOf(number));
            if (!sukses) {
                System.out.println("Gagal Mengapus Todo Nomor "+number);
            }
        }
    }

    public static void testViewhapusTodoList() {
        tambahTodoList("satu");
        tambahTodoList("dua");
        tambahTodoList("tiga");

        tampilTodoList();

        viewhapusTodoList();

        tampilTodoList();
    }

}
