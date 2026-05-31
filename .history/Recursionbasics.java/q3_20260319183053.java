public class q3 {
                                                  void num(int i, int n) {
                                                                                                    if (i > n) {
                                                                                                                                                      return;
                                                                                                    }

                                                                                                    System.out.println(i);
                                                                                                    num(i + 1, n);
                                                  }

                                                  public static void main(String[] args) {
                                                                                                    Scanner sc = new Scanner(System.in);

                                                                                                    System.out.print("Enter number: ");
                                                                                                    int n = sc.nextInt();

                                                                                                    q2 obj = new q2();
                                                                                                    obj.num(1, n);
                                                  }                                              
}
