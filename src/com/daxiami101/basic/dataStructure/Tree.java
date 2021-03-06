package com.daxiami101.basic.dataStructure;

import java.util.ArrayList;
import java.util.List;

public class Tree<AnyType extends Comparable<? super AnyType>>
{
    private static class BinaryNode<T>
    {
        BinaryNode(T theElement)
        {
            this(theElement, null, null);
        }

        BinaryNode(T theElement, BinaryNode<T> lt, BinaryNode<T> rt)
        {
            element = theElement;
            left = lt;
            right = rt;
        }

        T element;
        BinaryNode<T> left;
        BinaryNode<T> right;
    }

    private BinaryNode<AnyType> root;

    public void insert(AnyType x)
    {
        root = insert(x, root);
    }

    private BinaryNode<AnyType> insert(AnyType x, BinaryNode<AnyType> t)
    {
        if(t == null)
        {
            return new BinaryNode<>(x, null, null);
        }

        int compareResult = x.compareTo(t.element);

        if(compareResult < 0)
        {
            t.left = insert(x, t.left);
        }
        else if(compareResult > 0)
        {
            t.right = insert(x, t.right);
        }
        else
        {
            ;
        }

        return t;
    }

    /**
     * ǰ�����
     */
    public void preOrder(BinaryNode<AnyType> Node)
    {
        if (Node != null)
        {
            System.out.print(Node.element + " ");
            preOrder(Node.left);
            preOrder(Node.right);
        }
    }

    /**
     * �������
     */
    public void midOrder(BinaryNode<AnyType> Node)
    {
        if (Node != null)
        {
            midOrder(Node.left);
            System.out.print(Node.element + " ");
            midOrder(Node.right);
        }
    }

    /**
     * �������
     */
    public void posOrder(BinaryNode<AnyType> Node)
    {
        if (Node != null)
        {
            posOrder(Node.left);
            posOrder(Node.right);
            System.out.print(Node.element + " ");
        }
    }

    /*
     * �������
     * �ݹ�
     */
    public void levelOrder(BinaryNode<AnyType> Node) {
        if (Node == null) {
            return;
        }

        int depth = depth(Node);

        for (int i = 1; i <= depth; i++) {
            levelOrder(Node, i);
        }
    }
   
    private void levelOrder(BinaryNode<AnyType> Node, int level) {
        if (Node == null || level < 1) {
            return;
        }

        if (level == 1) {
            System.out.print(Node.element + "  ");
            return;
        }

        
        // ������
        levelOrder(Node.left, level - 1);

        // ������
        levelOrder(Node.right, level - 1);
    }

    public int depth(BinaryNode<AnyType> Node) {
        if (Node == null) {
            return 0;
        }

        int l = depth(Node.left);
        int r = depth(Node.right);
        if (l > r) {
            return l + 1;
        } else {
            return r + 1;
        }
    }

    public static void main( String[] args )
    {
        int[] input = {4, 2, 6, 1, 3, 5, 7, 8, 10};
        Tree<Integer> tree = new Tree<>();
        for(int i = 0; i < input.length; i++)
        {
            tree.insert(input[i]);
        }
        System.out.print( "ǰ����� ��" );
        tree.preOrder(tree.root);
        System.out.print( "\n������� ��" );
        tree.midOrder(tree.root);
        System.out.print( "\n������� ��" );
        tree.posOrder(tree.root);
        System.out.print("\n�ݹ���������");
        tree.levelOrder(tree.root);
    }
}
