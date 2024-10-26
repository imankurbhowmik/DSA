public class Four_mergeSort {
      int val;
      Four_mergeSort next;
      Four_mergeSort() {}
      Four_mergeSort(int val) { this.val = val; }
      Four_mergeSort(int val, Four_mergeSort next) { this.val = val; this.next = next; }


    public Four_mergeSort sortList(Four_mergeSort head) {
        if(head == null || head.next == null) {
            return head;
        }

        Four_mergeSort middle = middleNode(head);

        Four_mergeSort left = sortList(head);
        Four_mergeSort right = sortList(middle);

        return merge(left, right);
    }

    Four_mergeSort merge(Four_mergeSort first, Four_mergeSort second) {
         Four_mergeSort ans = new Four_mergeSort();
         Four_mergeSort tail = ans;

         while(first!= null && second!= null) {
             if (first.val < second.val) {
                 tail.next = first;
                 first = first.next;
                 tail.next = tail;
             } else {
                 tail.next = second;
                 second = second.next;
                 tail.next = tail;
             }
         }

             while(first!=null) {
                 tail.next = first;
                 first = first.next;
                 tail.next = tail;
             }

             while(second != null){
                 tail.next = second;
                 second = second.next;
                 tail.next = tail;
             }

             return ans.next;
         }



    public Four_mergeSort middleNode(Four_mergeSort head) {
        Four_mergeSort fast = head;
        Four_mergeSort slow = head;

        while(fast != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
}