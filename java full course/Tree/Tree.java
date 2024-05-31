package Tree;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Tree {
    public static void main(String[] args) {
        Array_imp obj = new Array_imp();

        obj.Root("A");
        obj.set_left("B", 0);
        obj.set_right("C", 0);
        obj.set_left("D", 1);
        obj.set_right("E", 1);
        obj.set_right("F", 2);
        obj.print_Tree();

    }
}
