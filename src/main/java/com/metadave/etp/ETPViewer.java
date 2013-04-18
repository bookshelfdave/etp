package com.metadave.etp;


import com.metadave.etp.rep.*;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.io.File;

public class ETPViewer extends JFrame{
    DefaultMutableTreeNode root =
            new DefaultMutableTreeNode("term");
    JTree tree;

    public ETPViewer() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //createNodes(top);
        tree = new JTree(root);

        JScrollPane treeView = new JScrollPane(tree);
        this.getContentPane().add(treeView);
    }

    public void addNodes(DefaultMutableTreeNode node, ETPTerm<?> term) {
        if(term instanceof ETPList) {
            DefaultMutableTreeNode child = new DefaultMutableTreeNode("list");
            for(ETPTerm<?> t : ((ETPList) term).getValue()) {
                addNodes(child, t);
            }
            node.add(child);
        } else if(term instanceof ETPTuple) {
            String nodeTitle = "tuple";
            java.util.List<?> v = (java.util.List<?>)term.getValue();
            if(v != null && v.size() > 0) {
                ETPTerm<?> t = (ETPTerm<?>)v.get(0);
                nodeTitle = t.getValue().toString();
            }

            DefaultMutableTreeNode child = new DefaultMutableTreeNode(nodeTitle);
            for(ETPTerm<?> t : ((ETPTuple) term).getValue()) {
                addNodes(child, t);
            }
            node.add(child);
        } else {
            //DefaultMutableTreeNode child = new DefaultMutableTreeNode(term + " <" + term.getClass().getName() + ">");
            DefaultMutableTreeNode child = new DefaultMutableTreeNode(term);
            node.add(child);
        }
    }

    public void addNodes(ETPTerm<?> term) {
        addNodes(root, term);
    }

    public static void main(String args[]) throws Exception {
        File f = new File("/Users/dparfitt/basho/riak/dev/dev1/etc/app.config");
        String line =
                org.apache.commons.io.FileUtils.readFileToString(f);
        ETPTerm<?> t = new ETP().parse(line);
        ETPViewer v = new ETPViewer();
        v.addNodes(t);
        v.setSize(1024, 768);
        v.setVisible(true);
    }
}
