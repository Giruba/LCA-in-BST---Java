# LCA-in-BST---Java
Java program to find the Lowest Common Ancestor in a Binary Search Tree using the inherent order property

@Author: Giruba Beulah SE

if root is null, return null.

If both the values are greater than the root, then recurse for LCA in the right tree.

If both the values are lesser than the root, then recurse for LCA in the left tree.

If one of the values is less than root while the other is greater than root, return root as LCA.

