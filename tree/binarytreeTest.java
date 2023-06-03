package tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class binarytreeTest {

binarytree tree=new binarytree();

    @Test
    void addnode() {
        tree.Addnode(-4);
        assert(tree.check(-4));
        tree.Addnode(6);
        assert(tree.check(6));
        tree.Addnode(2);
        assert(tree.check(2));

        
    }

    @Test
    void check() {
      //  tree.check(3);
        tree.Addnode(6);
        tree.Addnode(4);
        tree.Addnode(-4);
        assert(tree.check(6));
       // tree.check(4);
       assertFalse(tree.check(7));
       // tree.check(-4);
        assertTrue(tree.check(-4));






    }

    @Test
    void del() {
        tree.Addnode(-4);
        tree.Addnode(4);
        tree.Addnode(6);
        tree.del(-4);
        assertFalse(tree.check(-4));
        tree.del(4);
        assertFalse(tree.check(-4));
        tree.del(6);
        assertFalse(tree.check(6));
    }

    @Test
    void printtree() {
        System.out.println();

    }

    @Test
    void treeheight() {
        tree.Addnode(5);
        assertEquals(1,tree.treeheight());
        tree.Addnode(6);
        assertEquals(2,tree.treeheight());


    }

}