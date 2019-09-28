import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	class Node {
        int data;
        Node left;
        Node right;
     }
	
	boolean checkBST(Node root) {
        if(root.left!=null&&root.left.data>root.data) return false;
        if(root.right!=null&&root.right.data<root.data) return false;
        if(root.left!=null) return checkBST(root.left);
        if(root.right!=null) return checkBST(root.right);
        return true;
    }

  
}
