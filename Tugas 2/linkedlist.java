import java.util.LinkedList;

public class linkedlist 
{
    public static void main(String[] args) 
    {
        LinkedList<String> saya = new LinkedList<String>();
        saya.add("N");
        saya.add("A");
        saya.add("Z");
        saya.add("H");
        saya.add("I");
        saya.add("V");
        saya.add("A");
        saya.add("D");
        saya.add("A");
        saya.add("R");
        saya.add("M");
        saya.add("A");
        saya.add("F");
        saya.add("I");
        saya.add("T");
        saya.add("R");
        saya.add("I");
        
        System.out.println("Diketahui nama lengkap :");
        System.out.println(saya);
        System.out.println("");

        //1. Add karakter lain yang anda inginkan
        saya.addFirst("z");
        saya.add(10,"v");
        saya.addLast("X");
        System.out.println("1.Output add karakter");
        System.out.println(saya);
        System.out.println("");

        //2. Sisipkan karakter lain yang anda inginkan
        saya.set(15,"3");
        saya.set(12,"Z");
        System.out.println("2. Output sisip karakter :");
        System.out.println(saya);
        System.out.println("");

        //3. Hapus beberapa karakter yang ingin anda hapus
        saya.removeFirst();
        saya.remove(17);
        saya.removeLast();
        System.out.println("3 Output hapus karakter :");
        System.out.println(saya);
        System.out.println("");

        //4. Buat fungsi POP dan PUSH pada project anda
        saya.pop();
        System.out.println("4. Output POP: ");
        System.out.println(saya);
        System.out.println("");

        saya.push("N");
        System.out.println("4. Output PUSH :");
        System.out.println(saya);
        System.out.println("");
    }
}
