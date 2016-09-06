public static boolean isPalindrome(int x) {
       if (x < 0)return false;
        Queue<Integer> queue = new LinkedList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();

        while (x!=0){
            int temp = x%10;
            x /= 10;
            queue.offer(temp);
            stack.push(temp);
        }
        while (!queue.isEmpty() && !stack.isEmpty()){
            if (!queue.poll().equals( stack.pop()))return false;
        }
        return true;
    }
    
    /*
      1.堆栈遍历,时间负责o(n)
    */
