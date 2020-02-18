package sample_2;

public class Search extends Get 
{
  void binary_search(int key)
  {
	  int last=arr1.length;
	  int first=0;
	  int mid=(first+last)/2;
	  while(first <= last)
	  {
		  if(arr1[mid] < key)
		  {
			  first=mid+1;
		  }
		  else if(arr1[mid]==key)
		  {
			  System.out.println("key element is found"+mid);
			  break;
		  }
		  else
		  {
			  last=mid-1;
		  }
		  mid=(first+last)/2;
	  }
	  
  }
}
