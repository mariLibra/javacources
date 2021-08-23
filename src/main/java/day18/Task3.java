package day18;

public class Task3 {
    public static void main(String[] args) {

        Node root = new Node(20, null, null);

        Node.addNode(14, root);
        Node.addNode(23, root);
        Node.addNode(11, root);
        Node.addNode(16, root);
        Node.addNode(22, root);
        Node.addNode(27, root);
        Node.addNode(5, root);
        Node.addNode(15, root);
        Node.addNode(18, root);
        Node.addNode(24, root);
        Node.addNode(150, root);
        Node.addNode(8, root);

        //“обход в глубину”
        dfs(root);
    }

    //Метод Inorder (от меньшего к большему)
    public static void dfs(Node root) {

        //если мы добрались до листа, то выводим значение в консоль и выходим из метода
        if (root.getRight() == null && root.getLeft() == null) {
            System.out.print(root + " ");
            return;
        }

        //если левый потомок существует, спускаемся на один уровень вниз влево
        if (root.getLeft() != null) {
            dfs(root.getLeft());

            //если дерево не сбалансировано и/или правого потомка нет, выводим значение узла
            if (root.getRight() == null) {
                System.out.print(root + " ");
            }
        }

        //если правый потомок существует, записываем значение узла,
        // спускаемся на один уровень вниз вправо
        if (root.getRight() != null) {
            System.out.print(root + " ");
            dfs(root.getRight());
        }
    }
}