// P1991 트리 순회 Silver I

package Silver;
import java.util.Scanner;

public class P1991 {
    static class Node {
        char data;
        Node leftChild;
        Node rightChild;

        public Node(char data){
            this.data = data;
        }
    }

    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();

        Node[] nodes = new Node[26];

        for(int i = 0; i < n; i++){
            char parent = sn.next().charAt(0);
            char left = sn.next().charAt(0);
            char right = sn.next().charAt(0);

            if(nodes[parent - 'A'] == null){
                nodes[parent - 'A'] = new Node(parent);
            }

            if(left != '.'){
                if(nodes[left - 'A'] == null){
                    nodes[left - 'A'] = new Node(left);
                }
                nodes[parent - 'A'].leftChild = nodes[left - 'A'];
            }

            if(right != '.'){
                if(nodes[right - 'A'] == null){
                    nodes[right - 'A'] = new Node(right);
                }
                nodes[parent - 'A'].rightChild = nodes[right - 'A'];
            }
        }

        Node root = nodes[0]; // 'A'

        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }

    public static void preOrder(Node node){
        if(node != null){
            System.out.print(node.data);
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }

    public static void inOrder(Node node){
        if(node != null){
            inOrder(node.leftChild);
            System.out.print(node.data);
            inOrder(node.rightChild);
        }
    }

    public static void postOrder(Node node){
        if(node != null){
            postOrder(node.leftChild);
            postOrder(node.rightChild);
            System.out.print(node.data);
        }
    }
}