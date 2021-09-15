public class List<ContentType>  {
	
	Node head, tail, current;
	
	
	
	List() {
		head = new Node(null);
		tail = new Node(null);
		current = new Node(null);
	}
	
	
	public class Node{
		
		Node nextNode = null;
		ContentType content;
		
		Node( ContentType con) {
			this.content = con;
			
		}
		

		public ContentType getContent() {
			
			return content;
			
		}
		public boolean IsEmpty() {
			if (content == null) {return true;}
			else {return false;}
		}
		public Node GetNextNode() {
			return nextNode;
		}
		public void SetNextNode(Node nNext) {
			nextNode = nNext;
		}
		
	}

	
	public void AddNode(ContentType nContent) {
		
		if (nContent == null) {return;}
		
		Node nNode = new Node(nContent);

		if (head.IsEmpty()) {
			head = nNode;
			tail = nNode;
		} else {
					tail.SetNextNode(nNode);
					tail = nNode;
			
				}
		
	}
		public void DelNode(ContentType dNode) {
		
		if (dNode == null || head.IsEmpty()) {System.out.println("Error"); return;}
		
		Node wNode;
		Node pNode;
		
		
		if (head.getContent() != tail.getContent()) {
		
			if (head.getContent() == dNode)
			{ 
				head = head.GetNextNode(); 
				return;
			}
		
			
			
			ToHead();
		while (current.getContent() != dNode && !current.IsEmpty()) {
			Next();
		}
		
			wNode = current;
			pNode = ToPrev(wNode);
		pNode.SetNextNode(wNode.GetNextNode());
		} else if (head.getContent() == tail.getContent()){
			
			head = new Node(null);
			tail = new Node(null);
			
		}
	}

	
	public void Next() {
		
		if(!head.IsEmpty() || !current.GetNextNode().IsEmpty()) {
			current = current.GetNextNode();
		}
	}
	public void ToHead() {
		if (!head.IsEmpty()) {
			current = head;
		}
	}
	public void ToTail() {
		if(!head.IsEmpty()) {
			current = tail;
		}
	}
	public Node ToPrev(Node pNode) {
		
		if (head.IsEmpty() || head.GetNextNode() == null) {
			return null;
		}
		
		ToHead();
		if (current == pNode) {return current;}
		
		while(current.GetNextNode() != pNode && current.getContent() != null) {
			Next();
		}
		return current;
	}
	public Node GetCurrent() {
		return current;
	}
	
	public Node GetTail() {
		return tail;
	}

	public Node GetHead() {
		return head;
	}
	




}

