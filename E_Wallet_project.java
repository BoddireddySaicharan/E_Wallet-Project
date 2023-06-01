package com.oops9;
import java.util.Scanner;
public class E_Wallet_project 
{
	static double bal=2000;
	public static void add_balance1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("                           ");
		System.out.println(">>>>>>>>>>>>ADD_MONEY<<<<<<<<<<<<");
		System.out.println("                                 ");
		System.out.println("10% charges for every ADD MONEY");
		System.out.println("2.5% charges for ADD MONEY over 1000000");
		System.out.println("Enter the amount to be added");
		System.out.println("                           ");
		int bal1 =sc.nextInt();

		if(bal1>=1000&& bal1<=999999)
		{
			bal=bal+bal1-(bal1*10/100);
			System.out.println("                           ");
			System.out.println("Your updated balance is "+bal);
			System.out.println("                           ");
		}
		else if(bal1>=1000000)
		{
			bal=bal+bal1-(bal1*25/100);
			System.out.println("                           ");
			System.out.println("Your updated balance is "+bal);
			System.out.println("                           ");
		}
		else if (bal1>=1 && bal1<=999)
		{
			System.out.println("                           ");
			System.out.println("Minimum money to add is 1000Rs");
			System.out.println("Press 1 to enter the money greater than 1000");
			System.out.println("Press 2 to exit");
			System.out.println("                           ");
		}
	}
	public static void add_balance()
	{
		Scanner sc=new Scanner(System.in);
		boolean d=false;
		while(!d)
		{
			System.out.println("                           ");
			System.out.println(">>>>>>>>>>>>ADD_MONEY<<<<<<<<<<<<");
			System.out.println("                                 ");
			System.out.println("10% charges for every ADD MONEY");
			System.out.println("2.5% charges for ADD MONEY over 1000000");
			System.out.println("Enter the amount to be added");
			System.out.println("                           ");
			int bal1 =sc.nextInt();

			if(bal1>=1000&& bal1<=999999)
			{
				bal=bal+bal1-(bal1*10/100);
				System.out.println("                           ");
				System.out.println("Your updated balance is "+bal);
				System.out.println("                           ");
				boolean b7=false;
				while(!b7)
				{
					System.out.println("                           ");
					System.out.println("Press 1 to continue to use our services");
					System.out.println("Press 2 to exit");
					System.out.println("                           ");
					int select8=sc.nextInt();
					switch(select8)
					{
					case 1:
					{
						System.out.println("                           ");
						System.out.println("Enjoy our services");
						System.out.println("                           ");

						b7=true;
						d=true;
						main_menu();
					}break;
					case 2:
					{
						System.out.println("                           ");
						System.out.println("Thank you visit us again");
						b7=true;
						d=true;
					}break;
					}
				}
			}
			else if(bal1>=1000000)
			{
				bal=bal+bal1-(bal1*25/100);
				System.out.println("                           ");
				System.out.println("Your updated balance is "+bal);
				System.out.println("                           ");
				boolean b7=false;
				while(!b7)
				{
					System.out.println("                           ");
				System.out.println("Press 1 to continue our services");
				System.out.println("Press 2 to exit");
				System.out.println("                           ");
				int select8=sc.nextInt();
				switch(select8)
					{
						case 1:
						{
							System.out.println("                           ");
							System.out.println("Enjoy our services");
							System.out.println("                           ");
							
							b7=true;
							d=true;
						}break;
						case 2:
						{
							System.out.println("                           ");
							System.out.println("Thank you visit us again");
							b7=true;
							d=true;
						
				
						}break;
					}
				
								}
									}
								else if (bal1>=1 && bal1<=999)
								{
									System.out.println("                           ");
									System.out.println("Minimum money to add is 1000Rs");
									System.out.println("Press 1 to enter the money greater than 1000");
									System.out.println("Press 2 to exit");
									System.out.println("                           ");
									int select20=sc.nextInt();
									switch (select20)
									{
									case 1:
										{
											d=false;
										}break;
									case 2:
										{
											d=true;
										}break;
									
									}

								}
		}
			}
			public static void main_menu()
			{
				Scanner nc=new Scanner(System.in);
				System.out.println("                           ");
				System.out.println(">>>>>>>>>MAIN_MENU<<<<<<<<<<<");
				System.out.println("                             ");
				System.out.println("Press 1 for shopping");
				System.out.println("Press 2 for Add money");
				System.out.println("Press 3 for Check balance");
				System.out.println("                           ");
				int select=nc.nextInt();
				switch(select)
				{
				case 1:
				{
					shopping();
				}break;
				case 2:
				{
					add_balance();
				}break;
				case 3:
				{
					check_balance();
				}break;
				}
			}
			public static void check_balance()
			{
				Scanner sc=new Scanner(System.in);
				System.out.println(bal);
				boolean b12=false;
											while(!b12)
											{
												System.out.println("                           ");
											System.out.println("Press 1 to enjoy our services");
											System.out.println("Press 2 to exit");
											System.out.println("                           ");
											int select12=sc.nextInt();
											switch(select12)
												{
													case 1:
													{
														System.out.println("                           ");
														System.out.println("Enjoy our services");
														System.out.println("                           ");
														main_menu();
														
														b12=true;
													}break;
													case 2:
													{
														System.out.println("                           ");
														System.out.println("Thank you visit us again");
														b12=true;
													
											
													}
												}
											
										}
			}
			public static void shopping()
			{
				Scanner sc=new Scanner(System.in);
				double m_bal=2000;
					boolean b2=false;
					while (!b2)
					{
						System.out.println("                           ");
						System.out.println(">>>>>>>>>>SHOPPING<<<<<<<<<<<");
						System.out.println("                             ");
						System.out.println("press 1 for watch");
						System.out.println("press 2 for shoe");
						System.out.println("press 3 for hoodies");
						System.out.println("press 4 for Bags");
						System.out.println("press 5 for caps");
						System.out.println("press 6 for make up kit");
						System.out.println("press 7 to Go Back");
						System.out.println("                           ");
						int select1=sc.nextInt();
						switch (select1)
						{
						case 1:
						{
							boolean b3=false;
							while (!b3)
							{
								System.out.println("                           ");
								System.out.println(">>>>>>>>>WATCHES<<<<<<<<<<");
								System.out.println("                          ");
								System.out.println("FASTRACK - 3000Rs");
								System.out.println("FOSSIL - 5000Rs");
								System.out.println("TITAN - 7000Rs");
								System.out.println("                           ");
								System.out.println("***************************");
								System.out.println("                           ");
								System.out.println("press 1 for fastrack");
								System.out.println("press 2 for fossil");
								System.out.println("press 3 for Titan");
								System.out.println("                           ");
								int select2=sc.nextInt();
								switch (select2)
								{
								case 1:
								{

									double F_cost=3000;
									double deduction=bal-F_cost;
									if (deduction>m_bal)
									{ 
										bal=bal-F_cost;
										System.out.println("                           ");
										System.out.println("Purchase Successful");
										System.out.println("                           ");
										System.out.println("Your updated bal is "+bal);
										System.out.println("                           ");
										b3=true;
										b2=true;
										boolean b4=false;
										while(!b4)
										{
											System.out.println("                           ");
											System.out.println("Press 1 for continue with Watches");
											System.out.println("Press 2 to Shopping");
											System.out.println("Press 3 to Main_Menu");
											System.out.println("Press 4 to Exit");
											System.out.println("                           ");
											int select5=sc.nextInt();
											switch(select5)
											{
											case 1:
											{
												b4=true;
												b3=false;
											}break;
											case 2:
											{
												b4=true;
												b3=true;
												b2=false;
												shopping();
											}
											case 3:
											{
												b4=true;
												b3=true;
												main_menu();
											}break;
											case 4:
											{
												System.out.println("                           ");
												System.out.println("Thank you visit us again");
												b4=true;
												b2=true;
												b3=true;
											}break;
											}

										}
									}
									else
									{
										System.out.println("                           ");
										System.out.println("You are not maintaining minimum balance in your wallet");
										System.out.println("                            ");
										System.out.println("Your current balance is "+bal);
										System.out.println("                            ");
										System.out.println("press 1 to Add Money");
										System.out.println("press 2 for exit");
										System.out.println("                            ");
										int select3=sc.nextInt();
										switch (select3)
										{
										case 1:
										{
											add_balance1();
										}break;

										case 2:
										{
											System.out.println("                           ");

											b3=false;
											b2=true;

										} 
										}
									}
								}break;
								case 2:
								{

									double Fo_cost=5000;
									double deduction=bal-Fo_cost;
									if (deduction>m_bal)
									{
										bal=bal-Fo_cost;
										System.out.println("                           ");
										System.out.println("Purchase Successful");
										System.out.println("                           ");
										System.out.println("Your updated bal is "+bal);
										System.out.println("                           ");
										b3=true;
										b2=true;
										boolean b4=false;
										while(!b4)
										{
											System.out.println("                           ");
											System.out.println("Press 1 for continue with Watches");
											System.out.println("Press 2 to Shopping");
											System.out.println("Press 3 to Main_Menu");
											System.out.println("Press 4 to Exit");
											System.out.println("                           ");
											int select5=sc.nextInt();
											switch(select5)
											{
											case 1:
											{
												b4=true;
												b3=false;
											}break;
											case 2:
											{
												b4=true;
												b3=true;
												b2=false;
												shopping();
											}
											case 3:
											{
												b4=true;
												b3=true;
												main_menu();
											}break;
											case 4:
											{
												System.out.println("                           ");
												System.out.println("Thank you visit us again");
												b4=true;
												b2=true;
												b3=true;
											}break;
											}

										}
									}
									else
									{
										System.out.println("                           ");
										System.out.println("You are not maintaining minimum balance in your wallet");
										System.out.println("                            ");
										System.out.println("Your current balance is "+bal);
										System.out.println("                            ");
										System.out.println("press 1 to Add Money");
										System.out.println("press 2 for exit");
										System.out.println("                           ");
										int select3=sc.nextInt();
										switch (select3)
										{
										case 1:
										{
											add_balance1();
										}break;

										case 2:
										{
											System.out.println("                           ");
											b3=false;
											b2=true;

										}
										}	
									}
								}break;
								case 3:
								{

									double Titan_cost=7000;
									double deduction=bal-Titan_cost;
									if (deduction>m_bal)
									{
										bal=bal-Titan_cost;
										System.out.println("                           ");
										System.out.println("Purchase Successful");
										System.out.println("                           ");
										System.out.println("Your updated bal is "+bal);
										System.out.println("                           ");
										b3=true;
										b2=true;
										boolean b4=false;
										while(!b4)
										{
											System.out.println("                           ");
											System.out.println("Press 1 for continue with Watches");
											System.out.println("Press 2 to Shopping");
											System.out.println("Press 3 to Main_Menu");
											System.out.println("Press 4 to Exit");
											System.out.println("                           ");
											int select5=sc.nextInt();
											switch(select5)
											{
											case 1:
											{
												b4=true;
												b3=false;
											}break;
											case 2:
											{
												b4=true;
												b3=true;
												b2=false;
												shopping();
											}
											case 3:
											{
												b4=true;
												b3=true;
												main_menu();
											}break;
											case 4:
											{
												System.out.println("                           ");
												System.out.println("Thank you visit us again");
												b4=true;
												b2=true;
												b3=true;
											}break;
											}

										}
									}
									else
									{
										System.out.println("                           ");
										System.out.println("You are not maintaining minimum balance in your wallet");
										System.out.println("                            ");
										System.out.println("Your current balance is "+bal);
										System.out.println("                            ");
										System.out.println("press 1 to Add Money");
										System.out.println("press 2 for exit");
										System.out.println("                           ");
										int select3=sc.nextInt();
										switch (select3)
										{
										case 1:
										{
											add_balance1();
										}break;

										case 2:
										{
											System.out.println("                           ");

											b3=false;
											b2=true;

										}
										}	
									}
								}break;
								}
							}
						}break;
						case 2:
						{
							boolean b3=false;
							while (!b3)
							{
								System.out.println("                           ");
								System.out.println(">>>>>>>>>>SHOES<<<<<<<<<<");
								System.out.println("                         ");
								System.out.println("PUMA - 6000Rs");
								System.out.println("ADIDAS - 8000Rs");
								System.out.println("NIKE - 4000Rs");
								System.out.println("******************************");
								System.out.println("press 1 for PUMA");
								System.out.println("press 2 for ADIDAS");
								System.out.println("press 3 for NIKE");
								System.out.println("                           ");
								int select2=sc.nextInt();
								switch (select2)
								{
								case 1:
								{

									double Puma_cost=6000;
									double deduction=bal-Puma_cost;
									if (deduction>m_bal)
									{
										bal=bal-Puma_cost;
										System.out.println("                           ");
										System.out.println("Purchase Successful");
										System.out.println("                           ");
										System.out.println("Your updated bal is "+bal);
										System.out.println("                           ");
										b3=true;
										b2=true;
										boolean b4=false;
										while(!b4)
										{
											System.out.println("                           ");
											System.out.println("Press 1 for continue with Shoes");
											System.out.println("Press 2 to Shopping");
											System.out.println("Press 3 to Main_Menu");
											System.out.println("Press 4 to Exit");
											System.out.println("                           ");
											int select5=sc.nextInt();
											switch(select5)
											{
											case 1:
											{
												b4=true;
												b3=false;
											}break;
											case 2:
											{
												b4=true;
												b3=true;
												b2=false;
												shopping();
											}
											case 3:
											{
												b4=true;
												b3=true;
												main_menu();
											}break;
											case 4:
											{
												System.out.println("                           ");
												System.out.println("Thank you visit us again");
												b4=true;
												b2=true;
												b3=true;
											}break;
											}

										}
									}
									else
									{
										System.out.println("                           ");
										System.out.println("You are not maintaining minimum balance in your wallet");
										System.out.println("                            ");
										System.out.println("Your current balance is "+bal);
										System.out.println("                            ");
										System.out.println("press 1 to Add Money");
										System.out.println("press 2 for exit");
										System.out.println("                           ");
										int select3=sc.nextInt();
										switch (select3)
										{
										case 1:
										{
											add_balance1();
										}break;

										case 2:
										{
											System.out.println("                           ");

											b3=false;
											b2=true;

										}
										}
									}
								}break;
								case 2:
								{

									double Adidas_cost=8000;
									double deduction=bal-Adidas_cost;
									if (deduction>m_bal)
									{
										bal=bal-Adidas_cost;
										System.out.println("                           ");
										System.out.println("Purchase Successful");
										System.out.println("                           ");
										System.out.println("Your updated bal is "+bal);
										System.out.println("                           ");
										b3=true;
										b2=true;
										boolean b4=false;
										while(!b4)
										{
											System.out.println("                           ");
											System.out.println("Press 1 for continue with Shoes");
											System.out.println("Press 2 to Shopping");
											System.out.println("Press 3 to Main_Menu");
											System.out.println("Press 4 to Exit");
											System.out.println("                           ");
											int select5=sc.nextInt();
											switch(select5)
											{
											case 1:
											{
												b4=true;
												b3=false;
											}break;
											case 2:
											{
												b4=true;
												b3=true;
												b2=false;
												shopping();
											}
											case 3:
											{
												b4=true;
												b3=true;
												main_menu();
											}break;
											case 4:
											{
												System.out.println("                           ");
												System.out.println("Thank you visit us again");
												b4=true;
												b2=true;
												b3=true;
											}break;
											}

										}
									}
									else
									{
										System.out.println("                           ");
										System.out.println("Please check your balance");
										System.out.println("press 1 to Add Money");
										System.out.println("press 2 for exit");
										System.out.println("                           ");
										int select3=sc.nextInt();
										switch (select3)
										{
										case 1:
										{
											add_balance1();
										}break;

										case 2:
										{
											System.out.println("                           ");

											b3=false;
											b2=true;

										}
										}	
									}
								}break;
								case 3:
								{

									double Nike_cost=4000;
									double deduction=bal-Nike_cost;
									if (deduction>m_bal)
									{
										bal=bal-Nike_cost;
										System.out.println("                           ");
										System.out.println("Purchase Successful");
										System.out.println("                           ");
										System.out.println("Your updated bal is "+bal);
										System.out.println("                           ");
										b3=true;
										b2=true;
										boolean b4=false;
										while(!b4)
										{
											System.out.println("                           ");
											System.out.println("Press 1 for continue with Shoes");
											System.out.println("Press 2 to Shopping");
											System.out.println("Press 3 to Main_Menu");
											System.out.println("Press 4 to Exit");
											System.out.println("                           ");
											int select5=sc.nextInt();
											switch(select5)
											{
											case 1:
											{
												b4=true;
												b3=false;
											}break;
											case 2:
											{
												b4=true;
												b3=true;
												b2=false;
												shopping();
											}
											case 3:
											{
												b4=true;
												b3=true;
												main_menu();
											}break;
											case 4:
											{
												System.out.println("                           ");
												System.out.println("Thank you visit us again");
												b4=true;
												b2=true;
												b3=true;
											}break;
											}

										}
									}
									else
									{
										System.out.println("                           ");
										System.out.println("Please check your balance");
										System.out.println("press 1 to Add Money");
										System.out.println("press 2 for exit");
										System.out.println("                           ");
										int select3=sc.nextInt();
										switch (select3)
										{
										case 1:
										{
											add_balance1();
										}break;

										case 2:
										{
											System.out.println("                           ");

											b3=false;
											b2=true;

										}
										}	
									}
								}break;

								}
							}
						}break;
						case 3:
						{
							boolean b3=false;
							while (!b3)
							{
								System.out.println("                           ");
								System.out.println(">>>>>>>>>>HOODIES<<<<<<<<<<");
								System.out.println("                           ");
								System.out.println("ZARA - 1000Rs");
								System.out.println("GUCCI - 1500Rs");
								System.out.println("ROADSTER - 2000Rs");
								System.out.println("******************************");
								System.out.println("press 1 for ZARA");
								System.out.println("press 2 for GUCCI");
								System.out.println("press 3 for ROADSTER");
								System.out.println("                           ");
								int select2=sc.nextInt();
								switch (select2)
								{
								case 1:
								{

									double Zara_cost=1000;
									double deduction=bal-Zara_cost;
									if (deduction>m_bal)
									{
										bal=bal-Zara_cost;
										System.out.println("                           ");
										System.out.println("Purchase Successful");
										System.out.println("                           ");
										System.out.println("Your updated bal is "+bal);
										System.out.println("                           ");
										b3=true;
										b2=true;
										boolean b4=false;
										while(!b4)
										{
											System.out.println("                           ");
											System.out.println("Press 1 for continue with Hoodies");
											System.out.println("Press 2 to Shopping");
											System.out.println("Press 3 to Main_Menu");
											System.out.println("Press 4 to Exit");
											System.out.println("                           ");
											int select5=sc.nextInt();
											switch(select5)
											{
											case 1:
											{
												b4=true;
												b3=false;
											}break;
											case 2:
											{
												b4=true;
												b3=true;
												b2=false;
												shopping();
											}
											case 3:
											{
												b4=true;
												b3=true;
												main_menu();
											}break;
											case 4:
											{
												System.out.println("                           ");
												System.out.println("Thank you visit us again");
												b4=true;
												b2=true;
												b3=true;
											}break;
											}

										}
									}
									else
									{
										System.out.println("                           ");
										System.out.println("Please check your balance");
										System.out.println("press 1 to Add Money");
										System.out.println("press 2 for exit");
										System.out.println("                           ");
										int select3=sc.nextInt();
										switch (select3)
										{
										case 1:
										{
											add_balance1();
										}break;

										case 2:
										{
											System.out.println("                           ");

											b3=false;
											b2=true;

										}
										}	
									}
								}break;
								case 2:
								{

									double Gucci_cost=1500;
									double deduction=bal-Gucci_cost;
									if (deduction>m_bal)
									{
										bal=bal-Gucci_cost;
										System.out.println("                           ");
										System.out.println("Purchase Successful");
										System.out.println("                           ");
										System.out.println("Your updated bal is "+bal);
										System.out.println("                           ");
										b3=true;
										b2=true;
										boolean b4=false;
										while(!b4)
										{
											System.out.println("                           ");
											System.out.println("Press 1 for continue with Hoodies");
											System.out.println("Press 2 to Shopping");
											System.out.println("Press 3 to Main_Menu");
											System.out.println("Press 4 to Exit");
											System.out.println("                           ");
											int select5=sc.nextInt();
											switch(select5)
											{
											case 1:
											{
												b4=true;
												b3=false;
											}break;
											case 2:
											{
												b4=true;
												b3=true;
												b2=false;
												shopping();
											}
											case 3:
											{
												b4=true;
												b3=true;
												main_menu();
											}break;
											case 4:
											{
												System.out.println("                           ");
												System.out.println("Thank you visit us again");
												b4=true;
												b2=true;
												b3=true;
											}break;
											}

										}
									}
									else
									{
										System.out.println("                           ");
										System.out.println("Please check your balance");
										System.out.println("press 1 to Add Money");
										System.out.println("press 2 for exit");
										System.out.println("                           ");
										int select3=sc.nextInt();
										switch (select3)
										{
										case 1:
										{
											add_balance1();
										}break;

										case 2:
										{
											System.out.println("                           ");

											b3=false;
											b2=true;

										}
										}
									}
								}break;
								case 3:
								{

									double Roadster_cost=2000;
									double deduction=bal-Roadster_cost;
									if (deduction>m_bal)
									{
										bal=bal-Roadster_cost;
										System.out.println("                           ");
										System.out.println("Purchase Successful");
										System.out.println("                           ");
										System.out.println("Your updated bal is "+bal);
										System.out.println("                           ");
										b3=true;
										b2=true;
										boolean b4=false;
										while(!b4)
										{
											System.out.println("                           ");
											System.out.println("Press 1 for continue with Hoodies");
											System.out.println("Press 2 to Shopping");
											System.out.println("Press 3 to Main_Menu");
											System.out.println("Press 4 to Exit");
											System.out.println("                           ");
											int select5=sc.nextInt();
											switch(select5)
											{
											case 1:
											{
												b4=true;
												b3=false;
											}break;
											case 2:
											{
												b4=true;
												b3=true;
												b2=false;
												shopping();
											}
											case 3:
											{
												b4=true;
												b3=true;
												main_menu();
											}break;
											case 4:
											{
												System.out.println("                           ");
												System.out.println("Thank you visit us again");
												b4=true;
												b2=true;
												b3=true;
											}break;
											}

										}
									}
									else
									{
										System.out.println("                           ");
										System.out.println("Please check your balance");
										System.out.println("press 1 to Add Money");
										System.out.println("press 2 for exit");
										System.out.println("                           ");
										int select3=sc.nextInt();
										switch (select3)
										{
										case 1:
										{ 
											add_balance1();
										}break;

										case 2:
										{
											System.out.println("                           ");

											b3=false;
											b2=true;

										}
										}	
									}
								}break;

								}
							}
						}break;
						case 4:
						{
							boolean b3=false;
							while (!b3)
							{
								System.out.println("                           ");
								System.out.println(">>>>>>>>>>>BAGS<<<<<<<<<<");
								System.out.println("                         ");
								System.out.println("SKYBAGS - 700Rs");
								System.out.println("SAFARI - 1000Rs");
								System.out.println("WROGN - 1500Rs");
								System.out.println("******************************");
								System.out.println("press 1 for SKYBAGS");
								System.out.println("press 2 for SAFARI");
								System.out.println("press 3 for WROGN");
								System.out.println("                           ");
								int select2=sc.nextInt();
								switch (select2)
								{
								case 1:
								{

									double Skybags_cost=700;
									double deduction=bal-Skybags_cost;
									if (deduction>m_bal)
									{
										bal=bal-Skybags_cost;
										System.out.println("                           ");
										System.out.println("Purchase Successful");
										System.out.println("                           ");
										System.out.println("Your updated bal is "+bal);
										System.out.println("                           ");
										b3=true;
										b2=true;
										boolean b4=false;
										while(!b4)
										{
											System.out.println("                           ");
											System.out.println("Press 1 for continue with Bags");
											System.out.println("Press 2 to Shopping");
											System.out.println("Press 3 to Main_Menu");
											System.out.println("Press 4 to Exit");
											System.out.println("                           ");
											int select5=sc.nextInt();
											switch(select5)
											{
											case 1:
											{
												b4=true;
												b3=false;
											}break;
											case 2:
											{
												b4=true;
												b3=true;
												b2=false;
												shopping();
											}
											case 3:
											{
												b4=true;
												b3=true;
												main_menu();
											}break;
											case 4:
											{
												System.out.println("                           ");
												System.out.println("Thank you visit us again");
												b4=true;
												b2=true;
												b3=true;
											}break;
											}

										}
									}
									else
									{
										System.out.println("                           ");
										System.out.println("Please check your balance");
										System.out.println("press 1 to Add Money");
										System.out.println("press 2 for exit");
										System.out.println("                           ");
										int select3=sc.nextInt();
										switch (select3)
										{
										case 1:
										{
											add_balance1();
										}break;

										case 2:
										{
											System.out.println("                           ");

											b3=false;
											b2=true;

										}
										}	
									}
								}break;
								case 2:
								{

									double Safari_cost=1000;
									double deduction=bal-Safari_cost;
									if (deduction>m_bal)
									{
										bal=bal-Safari_cost;
										System.out.println("                           ");
										System.out.println("Purchase Successful");
										System.out.println("                           ");
										System.out.println("Your updated bal is "+bal);
										System.out.println("                           ");
										b3=true;
										b2=true;
										boolean b4=false;
										while(!b4)
										{
											System.out.println("                           ");
											System.out.println("Press 1 for continue with Bags");
											System.out.println("Press 2 to Shopping");
											System.out.println("Press 3 to Main_Menu");
											System.out.println("Press 4 to Exit");
											System.out.println("                           ");
											int select5=sc.nextInt();
											switch(select5)
											{
											case 1:
											{
												b4=true;
												b3=false;
											}break;
											case 2:
											{
												b4=true;
												b3=true;
												b2=false;
											}
											case 3:
											{
												b4=true;
												b3=true;
												main_menu();
											}break;
											case 4:
											{
												System.out.println("                           ");
												System.out.println("Thank you visit us again");
												b4=true;
												b2=true;
												b3=true;
											}break;
											}

										}
									}
									else
									{
										System.out.println("                           ");
										System.out.println("Please check your balance");
										System.out.println("press 1 to Add Money");
										System.out.println("press 2 for exit");
										System.out.println("                           ");
										int select3=sc.nextInt();
										switch (select3)
										{
										case 1:
										{
											add_balance1();
										}break;

										case 2:
										{
											System.out.println("                           ");

											b3=false;
											b2=true;

										}
										}	
									}
								}break;
								case 3:
								{

									double Wrogn_cost=1500;
									double deduction=bal-Wrogn_cost;
									if (deduction>m_bal)
									{
										bal=bal-Wrogn_cost;
										System.out.println("                           ");
										System.out.println("Purchase Successful");
										System.out.println("                           ");
										System.out.println("Your updated bal is "+bal);
										System.out.println("                           ");
										b3=true;
										b2=true;
										boolean b4=false;
										while(!b4)
										{
											System.out.println("                           ");
											System.out.println("Press 1 for continue with Bags");
											System.out.println("Press 2 to Shopping");
											System.out.println("Press 3 to Main_Menu");
											System.out.println("Press 4 to Exit");
											System.out.println("                           ");
											int select5=sc.nextInt();
											switch(select5)
											{
											case 1:
											{
												b4=true;
												b3=false;
											}break;
											case 2:
											{
												b4=true;
												b3=true;
												b2=false;
												shopping();
											}
											case 3:
											{
												b4=true;
												b3=true;
												main_menu();
											}break;
											case 4:
											{
												System.out.println("                           ");
												System.out.println("Thank you visit us again");
												b4=true;
												b2=true;
												b3=true;
											}break;
											}

										}
									}
									else
									{
										System.out.println("                           ");
										System.out.println("Please check your balance");
										System.out.println("press 1 to Add Money");
										System.out.println("press 2 for exit");
										System.out.println("                           ");
										int select3=sc.nextInt();
										switch (select3)
										{
										case 1:
										{ 
											add_balance1();
										}break;

										case 2:
										{
											System.out.println("                           ");
											b3=false;
											b2=true;	
										}
										}	
									}
								}break;	
								}
							}
						}break;
						case 5:
						{
							boolean b3=false;
							while (!b3)
							{
								System.out.println("                           ");
								System.out.println(">>>>>>>>>CAPS<<<<<<<<<<<");
								System.out.println("                        ");
								System.out.println("PUMA -  1300");
								System.out.println("URBAN_MONKEY - 2000");
								System.out.println("JACK_AND_JONES - 2500");
								System.out.println("******************************");
								System.out.println("press 1 for PUMA");
								System.out.println("press 2 for URBAN_MONKEY");
								System.out.println("press 3 for JACK_AND_JONES");
								System.out.println("                           ");
								int select2=sc.nextInt();
								switch (select2)
								{
								case 1:
								{

									double Puma1_cost=1300;
									double deduction=bal-Puma1_cost;
									if (deduction>m_bal)
									{
										bal=bal-Puma1_cost;
										System.out.println("                           ");
										System.out.println("Purchase Successful");
										System.out.println("                           ");
										System.out.println("Your updated bal is "+bal);
										System.out.println("                           ");
										b3=true;
										b2=true;
										boolean b4=false;
										while(!b4)
										{
											System.out.println("                           ");
											System.out.println("Press 1 for continue with Caps");
											System.out.println("Press 2 to Shopping");
											System.out.println("Press 3 to Main_Menu");
											System.out.println("Press 4 to Exit");
											System.out.println("                           ");
											int select5=sc.nextInt();
											switch(select5)
											{
											case 1:
											{
												b4=true;
												b3=false;
											}break;
											case 2:
											{
												b4=true;
												b3=true;
												b2=false;
												shopping();
											}
											case 3:
											{
												b4=true;
												b3=true;
												main_menu();
											}break;
											case 4:
											{
												System.out.println("                           ");
												System.out.println("Thank you visit us again");
												b4=true;
												b2=true;
												b3=true;
											}break;
											}

										}
									}
									else
									{
										System.out.println("                           ");
										System.out.println("Please check your balance");
										System.out.println("press 1 to Add Money");
										System.out.println("press 2 for exit");
										System.out.println("                           ");
										int select3=sc.nextInt();
										switch (select3)
										{
										case 1:
										{
											add_balance1();
										}break;

										case 2:
										{
											System.out.println("                           ");

											b3=false;
											b2=true;

										}
										}	
									}
								}break;
								case 2:
								{

									double Urban_cost=2000;
									double deduction=bal-Urban_cost;
									if (deduction>m_bal)
									{
										bal=bal-Urban_cost;
										System.out.println("                           ");
										System.out.println("Purchase Successful");
										System.out.println("                           ");
										System.out.println("Your updated bal is "+bal);
										System.out.println("                           ");
										b3=true;
										b2=true;
										boolean b4=false;
										while(!b4)
										{
											System.out.println("                           ");
											System.out.println("Press 1 for continue with Caps");
											System.out.println("Press 2 to Shopping");
											System.out.println("Press 3 to Main_Menu");
											System.out.println("Press 4 to Exit");
											System.out.println("                           ");
											int select5=sc.nextInt();
											switch(select5)
											{
											case 1:
											{
												b4=true;
												b3=false;
											}break;
											case 2:
											{
												b4=true;
												b3=true;
												b2=false;
												shopping();
											}
											case 3:
											{
												b4=true;
												b3=true;
												main_menu();
											}break;
											case 4:
											{
												System.out.println("                           ");
												System.out.println("Thank you visit us again");
												b4=true;
												b2=true;
												b3=true;
											}break;
											}

										}
									}
									else
									{
										System.out.println("                           ");
										System.out.println("Please check your balance");
										System.out.println("press 1 to Add Money");
										System.out.println("press 2 for exit");
										System.out.println("                           ");
										int select3=sc.nextInt();
										switch (select3)
										{
										case 1:
										{
											add_balance1();
										}break;

										case 2:
										{
											System.out.println("                           ");

											b3=false;
											b2=true;

										}
										}	
									}
								}break;
								case 3:
								{

									double Jack_cost=2500;
									double deduction=bal-Jack_cost;
									if (deduction>m_bal)
									{
										bal=bal-Jack_cost;
										System.out.println("                           ");
										System.out.println("Purchase Successful");
										System.out.println("                           ");
										System.out.println("Your updated bal is "+bal);
										System.out.println("                           ");
										b3=true;
										b2=true;

										boolean b4=false;
										while(!b4)
										{
											System.out.println("                           ");
											System.out.println("Press 1 for continue with Caps");
											System.out.println("Press 2 to Shopping");
											System.out.println("Press 3 to Main_Menu");
											System.out.println("Press 4 to Exit");
											System.out.println("                           ");
											int select5=sc.nextInt();
											switch(select5)
											{
											case 1:
											{
												b4=true;
												b3=false;

											}break;
											case 2:
											{
												b4=true;
												b3=true;
												b2=false;
												shopping();
											}
											case 3:
											{
												b4=true;
												b3=true;
												main_menu();

											}break;
											case 4:
											{
												System.out.println("                           ");
												System.out.println("Thank you visit us again");
												b4=true;
												b2=true;
												b3=true;
											}break;
											}

										}
									}
									else
									{
										System.out.println("                           ");
										System.out.println("Please check your balance");
										System.out.println("press 1 to Add Money");
										System.out.println("press 2 for exit");
										System.out.println("                           ");
										int select3=sc.nextInt();
										switch (select3)
										{
										case 1:
										{
											add_balance1();
										}break;

										case 2:
										{
											System.out.println("                           ");

											b3=false;
											b2=true;

										}
										}	
									}
								}break;

								}
							}
						}break;
						case 6:
						{
							boolean b3=false;
							while (!b3)
							{
								System.out.println("                           ");
								System.out.println(">>>>>>>MAKE_UP_KIT<<<<<<<<<");
								System.out.println("                           ");
								System.out.println("LAKME - 2500Rs");
								System.out.println("LOREAL - 3000Rs");
								System.out.println("MAC is - 3500Rs");
								System.out.println("******************************");
								System.out.println("press 1 for LAKME");
								System.out.println("press 2 for LOREAL");
								System.out.println("press 3 for MAC");
								System.out.println("                           ");
								int select2=sc.nextInt();
								switch (select2)
								{
								case 1:
								{

									double Lakme_cost=2500;
									double deduction=bal-Lakme_cost;
									if (deduction>m_bal)
									{
										bal=bal-Lakme_cost;
										System.out.println("                           ");
										System.out.println("Purchase Successful");
										System.out.println("                           ");
										System.out.println("Your updated bal is "+bal);
										System.out.println("                           ");
										b3=true;
										b2=true;
										boolean b4=false;
										while(!b4)
										{
											System.out.println("                           ");
											System.out.println("Press 1 for continue with Make_up_Kits");
											System.out.println("Press 2 to Shopping");
											System.out.println("Press 3 to Main_Menu");
											System.out.println("Press 4 to Exit");
											System.out.println("                           ");
											int select5=sc.nextInt();
											switch(select5)
											{
											case 1:
											{
												b4=true;
												b3=false;
											}break;
											case 2:
											{
												b4=true;
												b3=true;
												b2=false;
												shopping();
											}
											case 3:
											{
												b4=true;
												b3=true;
												main_menu();
											}break;
											case 4:
											{
												System.out.println("                           ");
												System.out.println("Thank you visit us again");
												b4=true;
												b2=true;
												b3=true;
											}break;
											}

										}
									}
									else
									{
										System.out.println("                           ");
										System.out.println("Please check your balance");
										System.out.println("press 1 to Add Money");
										System.out.println("press 2 for exit");
										System.out.println("                           ");
										int select3=sc.nextInt();
										switch (select3)
										{
										case 1:
										{ 
											add_balance1();
										}break;

										case 2:
										{
											System.out.println("                           ");

											b3=false;
											b2=true;

										}
										}	
									}
								}break;
								case 2:
								{

									double Loreal_cost=3000;
									double deduction=bal-Loreal_cost;
									if (deduction>m_bal)
									{
										bal=bal-Loreal_cost;
										System.out.println("                           ");
										System.out.println("Purchase Successful");
										System.out.println("                           ");
										System.out.println("Your updated bal is "+bal);
										System.out.println("                           ");
										b3=true;
										b2=true;
										boolean b4=false;
										while(!b4)
										{
											System.out.println("                           ");
											System.out.println("Press 1 for continue with Make_up_Kits");
											System.out.println("Press 2 to Shopping");
											System.out.println("Press 3 to Main_Menu");
											System.out.println("Press 4 to Exit");
											System.out.println("                           ");
											int select5=sc.nextInt();
											switch(select5)
											{
											case 1:
											{
												b4=true;
												b3=false;
											}break;
											case 2:
											{
												b4=true;
												b3=true;
												b2=false;
												shopping();
											}
											case 3:
											{
												b4=true;
												b3=true;
												main_menu();
											}break;
											case 4:
											{
												System.out.println("                           ");
												System.out.println("Thank you visit us again");
												b4=true;
												b2=true;
												b3=true;
											}break;
											}

										}
									}
									else
									{
										System.out.println("                           ");
										System.out.println("Please check your balance");
										System.out.println("press 1 to Add Money");
										System.out.println("press 2 for exit");
										System.out.println("                           ");
										int select3=sc.nextInt();
										switch (select3)
										{
										case 1:
										{
											add_balance1();
										}break;

										case 2:
										{
											System.out.println("                           ");

											b3=false;
											b2=true;

										}
										}	
									}
								}break;
								case 3:
								{

									double Mac_cost=3500;
									double deduction=bal-Mac_cost;
									if (deduction>m_bal)
									{
										bal=bal-Mac_cost;
										System.out.println("                           ");
										System.out.println("Purchase Successful");
										System.out.println("                           ");
										System.out.println("Your updated bal is "+bal);
										System.out.println("                           ");
										b3=true;
										b2=true;
										boolean b4=false;
										while(!b4)
										{
											System.out.println("                           ");
											System.out.println("Press 1 for continue with Make_up_Kits");
											System.out.println("Press 2 to Shopping");
											System.out.println("Press 3 to Main_Menu");
											System.out.println("Press 4 to Exit");
											System.out.println("                           ");
											int select5=sc.nextInt();
											switch(select5)
											{
											case 1:
											{
												b4=true;
												b3=false;
											}break;
											case 2:
											{
												b4=true;
												b3=true;
												b2=false;
												shopping();
											}
											case 3:
											{
												b4=true;
												b3=true;
												main_menu();
											}break;
											case 4:
											{
												System.out.println("                           ");
												System.out.println("Thank you visit us again");
												b4=true;
												b2=true;
												b3=true;
											}break;
											}

										}
									}
									else
									{
										System.out.println("                           ");
										System.out.println("Please check your balance");
										System.out.println("press 1 to Add Money");
										System.out.println("press 2 for exit to Shopping");
										System.out.println("                           ");
										int select3=sc.nextInt();
										switch (select3)
										{
										case 1:
										{
											add_balance1();
										}break;

										case 2:
										{
											b3=true;
											b2=false;
										}
										}	
									}
								}break;

								}
							}
						}break;
						case 7:
						{
							b2=true;
							main_menu();
						}break;
						}
					}
				}
			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				int pswd=1234;
				System.out.println("Welcome to E_Wallet application");
				boolean b=false;
				while (!b)
				{
					System.out.println("Enter the password");
					int pswd1=sc.nextInt();
					if (pswd==pswd1)
					{
						b=true;
						main_menu();
					}
					else
					{
						System.out.println("                           ");
						System.out.println("Please 1 to Re-enter password");
						System.out.println("Press 2 to exit");
						System.out.println("                           ");
						int select_=sc.nextInt();
						switch (select_)
						{
						case 1:
							{
								b=false;
							}break;
							case 2:
							{
								b=true;
							}break;
						
						}

					}
				}
			}
		}

