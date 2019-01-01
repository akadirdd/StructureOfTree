package treestructure;

public class TreeStructure {
    
    static Node nodePointer;
    static Node rootPointer;
    
    public static void main(String[] args) {
        LinkList blist = new LinkList();
       
        blist.root = new Node("Master");
        blist.root.previous= null;
        blist.root.next.add(null);
        rootPointer=blist.root;
        
        addNode("Master","firstBranch");
        addNode("Master","secondBranch");
        addNode("firstBranch","1.1");
        addNode("firstBranch","1.2");
        addNode("secondBranch","2.1");
        addNode("1.1","1.1.1");
        System.out.println("---------------------------");
        printList(rootPointer);
    }
    public static void addNode(String toWhere,String what){
        searching(rootPointer,toWhere);
        Node newNode = new Node(what);
        nodePointer.next.add(newNode);
        newNode.previous=nodePointer;
        newNode.next.add(null);
        System.out.println("Success");
    }
    public static void searching(Node root,String wanted){
        
        if(root.name.equals(wanted)){
            System.out.println("Found");
            nodePointer=root;
            
        }else{
            
            for (int i = 0; i < root.next.size(); i++) {
                if(root.next.get(i)!=null){
                    searching(root.next.get(i),wanted);
                }
            }
        }
        
    }
    public static void printList(Node root) {
        
        System.out.println(root.name + " ");
        
        for (int i = 0; i < root.next.size(); i++) {
            if(root.next.get(i)!=null){
                printList(root.next.get(i));
            }
        }
        
    }
}
