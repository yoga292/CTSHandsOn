import java.util.*;

class Product
{
    int pid;
    String pname;
    String category;
    Product(int pid,String pname,String category)
    {
        this.pid=pid;
        this.pname=pname;
        this.category=category;
    }
}
    class SearchUtility
    {
    public static Product LinearSearch(Product[]products,String name)
    {
      for(Product product:products)
      {
         if(product.pname.equalsIgnoreCase(name))
         {
            return product;
         }
      }
      return null;
    }
    public static Product BinarySearch(Product[]products,String name)
    {
        int low=0;
        int high=products.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int comp=products[mid].pname.compareToIgnoreCase(name);
            if(comp==0)
             return products[mid];
            else if(comp<0)
             low=mid+1;
            else
             high=mid-1;

        }
        return null;
    }
    }
    

public class ECommercePlatform {
    public static void main(String[] args) {
        Product[]products={new Product(101,"AC","Electronincs"),
                           new Product(102,"Phone","Electronincs"),
                           new Product(103,"Book","Education"),
        };
        Arrays.sort(products,Comparator.comparing(p->p.pname.toLowerCase()));
        Product f1=SearchUtility.LinearSearch(products,"Phone");
        System.out.println("Linear Search:"+(f1!=null?f1.pname:"Not found"));
        Product f2=SearchUtility.BinarySearch(products,"Phone");
        System.out.println("Binary Search:"+(f2!=null?f2.pname:"Not found"));

    }
}

