package treestructure;

import java.util.ArrayList;

public class LinkList {
    Node root;
}
class Node{

    Node previous;
    ArrayList<Node> next=new ArrayList<Node>();
    
    int id;
    String name;

    Node() {

    }
    
    Node(String name) {
        this.name = name;
    }

}