import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Five_levelOrderTraversal {

    public static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode next;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
    }
    public static void main(String[] args) {

    }

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            ArrayList<Integer> currentLevelList = new ArrayList<>(levelSize);

            for(int i=0; i<levelSize; i++) {
                TreeNode current = queue.poll();
                currentLevelList.add(current.val);
                if(current.left != null) {
                    queue.offer(current.left);
                }
                if(current.right != null) {
                    queue.offer(current.right);
                }
            }
            result.add(currentLevelList);
        }
        return result;
    }

    public TreeNode findSuccessor(TreeNode root, int key) {

        if(root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode current = queue.poll();
                if(current.left != null) {
                    queue.offer(current.left);
                }
                if(current.right != null) {
                    queue.offer(current.right);
                }
            if(current.val == key) {
                break;
            }

        }
        return queue.peek();
    }

    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean reverse = false;

        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            ArrayList<Integer> currentLevelList = new ArrayList<>(levelSize);

            for(int i=0; i<levelSize; i++) {

                if(!reverse) {
                    TreeNode current = queue.pollFirst();
                    currentLevelList.add(current.val);
                    if(current.left != null) {
                        queue.addLast(current.left);
                    }
                    if(current.right != null) {
                        queue.addLast(current.right);
                    }
                }else{
                    TreeNode current = queue.pollLast();
                    currentLevelList.add(current.val);
                    if(current.right != null) {
                        queue.addFirst(current.right);
                    }
                    if(current.left != null) {
                        queue.addFirst(current.left);
                    }
                }


            }reverse = !reverse;
            result.add(currentLevelList);
        }
        return result;
    }

    public TreeNode connect(TreeNode root) {
        if(root == null) {
            return null;
        }

        TreeNode leftMost = root;

        while(leftMost.left != null) {
            TreeNode current = leftMost;
            while(current != null) {
                current.left.next = current.right;
                if(current.next != null) {
                    current.right.next = current.next.left;
                }
                current = current.next;
            }leftMost = leftMost.left;
        }
        return root;
    }

    public ArrayList<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();

        if(root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();


            for(int i=0; i<levelSize; i++) {
                TreeNode current = queue.poll();

                if(i == levelSize-1) {
                    result.add(current.val);
                }
                if(current.left != null) {
                    queue.offer(current.left);
                }
                if(current.right != null) {
                    queue.offer(current.right);
                }
            }

        }
        return result;
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return (
                (level(root, xx, 0) == level(root, yy, 0)) && (!isSiblings(root, xx, yy))
                );
    }

    private int level(TreeNode node, TreeNode x, int lev) {
        if(node == null) {
            return 0;
        }

        if(node == x) {
            return lev;
        }

        int l = level(node.left, x, lev+1);
        if(l != 0) {
            return l;
        }
        return level(node.right, x, lev+1);
    }

    private boolean isSiblings(TreeNode node, TreeNode x, TreeNode y) {
        if(node == null) {
            return false;
        }


        return (
                (node.left == x && node.right == y) || (node.left == y && node.right == x)
                || isSiblings(node.left, x, y) || isSiblings(node.right, x, y)
                );
    }

    private TreeNode findNode(TreeNode node, int x) {
        if(node == null) {
            return null;
        }
        if(node.val == x) {
            return node;
        }
        TreeNode n = findNode(node.left, x);
        if(n!=null) {
            return n;
        }
        return findNode(node.right, x);
    }
}