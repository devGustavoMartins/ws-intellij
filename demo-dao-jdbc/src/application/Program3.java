package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("Total: " + sellerDao.totalCount());

        /*
        Department department = new Department(2);
        System.out.println("\n=== Seller insert ===");
        Seller newSeller = new Seller(null, "Rafael", "rafael@gmail.com", new Date(), 4000.0, department);
        System.out.print("How much inserts? ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            sellerDao.insert(newSeller);
        }
        System.out.println("Inserted!");

         */

        //sellerDao.deleteById(10001);
    }
}
