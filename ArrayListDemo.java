import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class ArrayListDemo extends Frame {
   JLabel label1; JLabel label2; 
   JButton b1; JButton b2; JButton b3; 
   JButton b4; JButton b5; JButton b6; 
   JButton b7; JButton b8; 
   JTextField tf; JTextField tf2;
   String s1 = new String();
   
   //create new empty arraylist
   ArrayList arList = new ArrayList();
   
   @SuppressWarnings("unckecked")
   ArrayListDemo(){
      
      label1 = new JLabel();
      label1.setBounds(50, 50, 250, 20);
      
      label2 = new JLabel("Size: " + arList.size());
      label2.setBounds(50, 100, 250, 20);
      
      
      tf = new JTextField("Test0");
      tf.setBounds(50, 150, 150, 20);
      
      //add element to end
      b1 = new JButton("Add Element");
      b1.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               arList.add(tf.getText());
               label1.setText(arList.toString());
               label2.setText("Size: " + arList.size());
            }
         }
      );
      b1.setBounds(50, 200, 225, 30);
      
      //remove element at index 0
      b2 = new JButton("Remove First Element");
      b2.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               arList.remove(0);
               label1.setText(arList.toString());
               label2.setText("Size: " + arList.size());
            }
            
         }
      );
      b2.setBounds(50, 250, 225, 30);
      
      //remove element at index size()-1
      b3 = new JButton("Remove Last Element");
      b3.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               int size = arList.size();
               arList.remove(size-1);
               label1.setText(arList.toString());
               label2.setText("Size: " + arList.size());
            }
         }
      );
      b3.setBounds(50, 300, 225, 30);
      
      //just uses the remove() function
      b4 = new JButton("Remove First Instance of Element");
      b4.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               arList.remove(tf.getText());
               label1.setText(arList.toString());
               label2.setText("Size: " + arList.size());
            }
         }
      );
      b4.setBounds(50, 350, 225, 30);
      
      //get lastIndexOf element and removes by index
      b5 = new JButton("Remove Last Instance of Element");
      b5.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               int index = arList.lastIndexOf(tf.getText());
               arList.remove(index);
               label1.setText(arList.toString());
               label2.setText("Size: " + arList.size());
            }
         }
      );
      b5.setBounds(50, 400, 225, 30);
      
      tf2 = new JTextField(0);
      tf2.setBounds(50, 450, 225, 30);
      
      //Remove element at index N
      b6 = new JButton("Remove Element by Index");
      b6.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               int index = Integer.parseInt(tf2.getText());
               arList.remove(index);
               label1.setText(arList.toString());
               label2.setText("Size: " + arList.size());
            }
         }
      );
      b6.setBounds(50, 500, 225, 30);
      
      //Set element at index N to text field value
      b7 = new JButton("Set Element at Index");
      b7.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               int index = Integer.parseInt(tf2.getText());
               String element = tf.getText();
               arList.set(index, element);
               label1.setText(arList.toString());
               label2.setText("Size: " + arList.size());
            }
         }
      );
      b7.setBounds(50, 550, 225, 30);
      
      //Clear List
      b8 = new JButton("Clear ArrayList");
      b8.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               arList.clear();
               label1.setText(arList.toString());
               label2.setText("Size: " + arList.size());
            }
         }
      );
      b8.setBounds(50, 650, 225, 30);
       
      add(b1);
      add(b2);
      add(b3);
      add(b4);
      add(b5);
      add(b6);
      add(b7);
      add(b8);
      add(label1);
      add(label2);
      add(tf);
      add(tf2);
      
      setSize(400, 800);
      setLayout(null);
      setVisible(true);

   }
   
   public static void main(String [] args) {
      new ArrayListDemo();  
   }
}