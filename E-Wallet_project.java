			import java.util.Scanner;

			class E-Wallet_project
			{
				public static void main(String[] args) 
				{
					Scanner sc=new Scanner(System.in );
					int pswd=1234;
					double m_bal=2000;
					System.out.println("Welcome to E_Wallet application");
				    boolean b=false;
					while (!b)
					{
						System.out.println("Enter the password");
						int pswd1=sc.nextInt();
						if (pswd==pswd1)
						{
							b=true;
						
					boolean b1=false;
					double bal=2000;
					while (!b1)
					{
						System.out.println("                           ");
						System.out.println(">>>>>>>>>MAIN_MENU<<<<<<<<<<<");
						System.out.println("                             ");
						System.out.println("Press 1 for shopping");
						System.out.println("Press 2 for Add money");
						System.out.println("Press 3 for Check balance");
						System.out.println("                           ");
						int select=sc.nextInt();
						switch (select)
						{
						case 1:
							{
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
															b1=true;
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
																		b1=false;
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
																		b1=false;
																	}break;
																	case 4:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b4=true;
																		b1=true;
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
																		 boolean a18=false;
																		while(!a18)
																	{
																			System.out.println("                           ");
																        System.out.println(">>>>>>>>>>CHARGES<<<<<<<<<<<");
																		System.out.println("                            ");
																		System.out.println("10% charges for ADD MONEY between 1000 to 999999");
																		System.out.println("2.5% charges for ADD MONEY over 1000000");
																		System.out.println("                                                   ");
																		System.out.println("********************************************************");
																		System.out.println("                                                   ");
																		System.out.println("Enter the amount to be added");
																		System.out.println("                                                        ");
																		int bal1 =sc.nextInt();
																	
																			if(bal1>=1000&& bal1<=999999)
																			{
																				bal=bal+bal1-(bal1*10/100);
																				System.out.println("                           ");
																				System.out.println("Your updated balance is "+bal);
																				System.out.println("                           ");
																				a18=true;
																			}
																			else if(bal1>=1000000)
																			{
																			bal=bal+bal1-(bal1*2.5/100);
																			System.out.println("                           ");
																			System.out.println("Your updated balance is "+bal);
																			System.out.println("                           ");
																			a18=true;
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
																						a18=false;
																					}break;
																				case 2:
																					{
																						a18=true;
																						b3=true;
																						b2=false;
																						b1=true;
																					}break;
																				
																				}

																			}
																}
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
															b1=true;
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
																		b1=false;
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
																		b1=false;
																	}break;
																	case 4:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b4=true;
																		b1=true;
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
																     boolean a17=false;
																	 while(!a17)
																	{
																		 System.out.println("                           ");
																		 System.out.println(">>>>>>>>>>CHARGES<<<<<<<<<<<");
																		 System.out.println("                                                   ");
																	 System.out.println("10% charges for ADD MONEY between 1000 to 999999");
																		System.out.println("2.5% charges for ADD MONEY over 1000000");
																		System.out.println("                                                   ");
																		System.out.println("********************************************************");
																		System.out.println("                                                   ");
																		System.out.println("Enter the amount to be added");
																		System.out.println("                           ");
																		int bal1 =sc.nextInt();
																	
																			if(bal1>=1000&& bal1<=999999)
																			{
																				bal=bal+bal1-(bal1*10/100);
																				System.out.println("                           ");
																				System.out.println("Your updated balance is "+bal);
																				System.out.println("                           ");
																				a17=true;
																			}
																			else if(bal1>=1000000)
																			{
																			bal=bal+bal1-(bal1*2.5/100);
																			System.out.println("                           ");
																			System.out.println("Your updated balance is "+bal);
																			System.out.println("                           ");
																			a17=true;
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
																						a17=false;
																					}break;
																				case 2:
																					{
																						a17=true;
																						b1=true;
																					}break;
																				
																				}

																			}
																}
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
															b1=true;
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
																		b1=false;
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
																		b1=false;
																	}break;
																	case 4:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b4=true;
																		b1=true;
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
																     boolean a16=false;
																	 while(!a16)
																	{
																		 System.out.println("                           ");
																	 System.out.println(">>>>>>>>>>CHARGES<<<<<<<<<<<");
																		System.out.println("                            ");
																		System.out.println("10% charges for ADD MONEY between 1000 to 999999");
																		System.out.println("2.5% charges for ADD MONEY over 1000000");
																		System.out.println("                                                   ");
																		System.out.println("********************************************************");
																		System.out.println("                                                      ");
																		System.out.println("Enter the amount to be added");
																		System.out.println("                           ");
																		int bal1 =sc.nextInt();
																	
																			if(bal1>=1000&& bal1<=999999)
																			{
																				bal=bal+bal1-(bal1*10/100);
																				System.out.println("                           ");
																				System.out.println("Your updated balance is "+bal);
																				System.out.println("                           ");
																				a16=true;
																			}
																			else if(bal1>=1000000)
																			{
																			bal=bal+bal1-(bal1*25/100);
																			System.out.println("                           ");
																			System.out.println("Your updated balance is "+bal);
																			System.out.println("                           ");
																			a16=true;
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
																						a16=false;
																					}break;
																				case 2:
																					{
																						a16=true;
																						b1=true;
																					}break;
																				
																				}

																			}
																}
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
															b1=true;
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
																		b1=false;
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
																		b1=false;
																	}break;
																	case 4:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b4=true;
																		b1=true;
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
																     boolean a15=false;
																	 while(!a15)
																	{
																		 System.out.println("                           ");
																	 System.out.println(">>>>>>>>>>CHARGES<<<<<<<<<<<");
																		System.out.println("                            ");
																		System.out.println("10% charges for ADD MONEY between 1000 to 999999");
																		System.out.println("2.5% charges for ADD MONEY over 1000000");
																		System.out.println("                                                   ");
																		System.out.println("********************************************************");
																		System.out.println("                                                     ");
																		System.out.println("Enter the amount to be added");
																		System.out.println("                           ");
																		int bal1 =sc.nextInt();
																	
																			if(bal1>=1000&& bal1<=999999)
																			{
																				bal=bal+bal1-(bal1*10/100);
																				System.out.println("                           ");
																				System.out.println("Your updated balance is "+bal);
																				System.out.println("                           ");
																				a15=true;
																			}
																			else if(bal1>=1000000)
																			{
																			bal=bal+bal1-(bal1*25/100);
																			System.out.println("                           ");
																			System.out.println("Your updated balance is "+bal);
																			System.out.println("                           ");
																			a15=true;
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
																						a15=false;
																					}break;
																				case 2:
																					{
																						a15=true;
																						b1=true;
																					}break;
																				
																				}

																			}
																}
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
															b1=true;
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
																		b1=false;
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
																		b1=false;
																	}break;
																	case 4:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b4=true;
																		b1=true;
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
																     boolean a14=false;
																	 while(!a14)
																	{
																		 System.out.println("                           ");
																	 System.out.println(">>>>>>>>>>CHARGES<<<<<<<<<<<");
																		System.out.println("                            ");
																		System.out.println("10% charges for ADD MONEY between 1000 to 999999");
																		System.out.println("2.5% charges for ADD MONEY over 1000000");
																		System.out.println("                                                   ");
																		System.out.println("********************************************************");
																		System.out.println("                                                       ");
																		System.out.println("Enter the amount to be added");
																		System.out.println("                           ");
																		int bal1 =sc.nextInt();
																	
																			if(bal1>=1000&& bal1<=999999)
																			{
																				bal=bal+bal1-(bal1*10/100);
																				System.out.println("                           ");
																				System.out.println("Your updated balance is "+bal);
																				System.out.println("                           ");
																				a14=true;
																			}
																			else if(bal1>=1000000)
																			{
																			bal=bal+bal1-(bal1*25/100);
																			System.out.println("                           ");
																			System.out.println("Your updated balance is "+bal);
																			System.out.println("                           ");
																			a14=true;
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
																						a14=false;
																					}break;
																				case 2:
																					{
																						a14=true;
																						b1=true;
																					}break;
																				
																				}

																			}
																}
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
															b1=true;
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
																		b1=false;
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
																		b1=false;
																	}break;
																	case 4:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b4=true;
																		b1=true;
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
																      boolean a13=false;
																	  while(!a13)
																	{
																		  System.out.println("                           ");
																	 System.out.println(">>>>>>>>>>CHARGES<<<<<<<<<<<");
																		System.out.println("                            ");
																		System.out.println("10% charges for ADD MONEY between 1000 to 999999");
																		System.out.println("2.5% charges for ADD MONEY over 1000000");
																		System.out.println("                                                   ");
																		System.out.println("********************************************************");
																		System.out.println("                                                      ");
																		System.out.println("Enter the amount to be added");
																		System.out.println("                           ");
																		int bal1 =sc.nextInt();
																	
																			if(bal1>=1000&& bal1<=999999)
																			{
																				bal=bal+bal1-(bal1*10/100);
																				System.out.println("                           ");
																				System.out.println("Your updated balance is "+bal);
																				System.out.println("                           ");
																				a13=true;
																			}
																			else if(bal1>=1000000)
																			{
																			bal=bal+bal1-(bal1*25/100);
																			System.out.println("                           ");
																			System.out.println("Your updated balance is "+bal);
																			System.out.println("                           ");
																			a13=true;
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
																						a13=false;
																					}break;
																				case 2:
																					{
																						a13=true;
																						b1=true;
																					}break;
																				
																				}

																			}
																}
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
															b1=true;
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
																		b1=false;
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
																		b1=false;
																	}break;
																	case 4:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b4=true;
																		b1=true;
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
																      boolean a12=false;
																	  while(!a12)
																	{
																		  System.out.println("                           ");
																	 System.out.println(">>>>>>>>>>CHARGES<<<<<<<<<<<");
																		System.out.println("                            ");
																		System.out.println("10% charges for ADD MONEY between 1000 to 999999");
																		System.out.println("2.5% charges for ADD MONEY over 1000000");
																		System.out.println("                                                   ");
																		System.out.println("********************************************************");
																		System.out.println("                                                       ");
																		System.out.println("Enter the amount to be added");
																		System.out.println("                           ");
																		int bal1 =sc.nextInt();
																	
																			if(bal1>=1000&& bal1<=999999)
																			{
																				bal=bal+bal1-(bal1*10/100);
																				System.out.println("                           ");
																				System.out.println("Your updated balance is "+bal);
																				System.out.println("                           ");
																				a12=true;
																			}
																			else if(bal1>=1000000)
																			{
																			bal=bal+bal1-(bal1*25/100);
																			System.out.println("                           ");
																			System.out.println("Your updated balance is "+bal);
																			System.out.println("                           ");
																			a12=true;
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
																						a12=false;
																					}break;
																				case 2:
																					{
																						a12=true;
																						b1=true;
																					}break;
																				
																				}

																			}
																}
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
															b1=true;
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
																		b1=false;
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
																		b1=false;
																	}break;
																	case 4:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b4=true;
																		b1=true;
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
																     boolean a11=false;
																	 while(!a11)
																	{
																		 System.out.println("                           ");
																	 System.out.println(">>>>>>>>>>CHARGES<<<<<<<<<<<");
																		System.out.println("                            ");
																		System.out.println("10% charges for ADD MONEY between 1000 to 999999");
																		System.out.println("2.5% charges for ADD MONEY over 1000000");
																		System.out.println("                                                   ");
																		System.out.println("********************************************************");
																		System.out.println("                                                     ");
																		System.out.println("Enter the amount to be added");
																		System.out.println("                           ");
																		int bal1 =sc.nextInt();
																	
																			if(bal1>=1000&& bal1<=999999)
																			{
																				bal=bal+bal1-(bal1*10/100);
																				System.out.println("                           ");
																				System.out.println("Your updated balance is "+bal);
																				System.out.println("                           ");
																				a11=true;
																			}
																			else if(bal1>=1000000)
																			{
																			bal=bal+bal1-(bal1*25/100);
																			System.out.println("                           ");
																			System.out.println("Your updated balance is "+bal);
																			System.out.println("                           ");
																			a11=true;
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
																						a11=false;
																					}break;
																				case 2:
																					{
																						a11=true;
																						b1=true;
																					}break;
																				
																				}

																			}
																}
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
															b1=true;
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
																		b1=false;
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
																		b1=false;
																	}break;
																	case 4:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b4=true;
																		b1=true;
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
																      boolean a10=false;
																	  while(!a10)
																	{
																		  System.out.println("                           ");
																	 System.out.println(">>>>>>>>>>CHARGES<<<<<<<<<<<");
																		System.out.println("                            ");
																		System.out.println("10% charges for ADD MONEY between 1000 to 999999");
																		System.out.println("2.5% charges for ADD MONEY over 1000000");
																		System.out.println("                                                   ");
																		System.out.println("********************************************************");
																		System.out.println("                                                     ");
																		System.out.println("Enter the amount to be added");
																		System.out.println("                           ");
																		int bal1 =sc.nextInt();
																	
																			if(bal1>=1000&& bal1<=999999)
																			{
																				bal=bal+bal1-(bal1*10/100);
																				System.out.println("                           ");
																				System.out.println("Your updated balance is "+bal);
																				System.out.println("                           ");
																				a10=true;
																			}
																			else if(bal1>=1000000)
																			{
																			bal=bal+bal1-(bal1*25/100);
																			System.out.println("                           ");
																			System.out.println("Your updated balance is "+bal);
																			System.out.println("                           ");
																			a10=true;
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
																						a10=false;
																					}break;
																				case 2:
																					{
																						a10=true;
																						b1=true;
																					}break;
																				
																				}

																			}
																}
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
															b1=true;
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
																		b1=false;
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
																		b1=false;
																	}break;
																	case 4:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b4=true;
																		b1=true;
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
																      boolean a9=false;
																	  while(!a9)
																	{
																		  System.out.println("                           ");
																	 System.out.println(">>>>>>>>>>CHARGES<<<<<<<<<<<");
																		System.out.println("                            ");
																		System.out.println("10% charges for ADD MONEY between 1000 to 999999");
																		System.out.println("2.5% charges for ADD MONEY over 1000000");
																		System.out.println("                                                   ");
																		System.out.println("********************************************************");
																		System.out.println("                                                    ");
																		System.out.println("Enter the amount to be added");
																		System.out.println("                           ");
																		int bal1 =sc.nextInt();
																	
																			if(bal1>=1000&& bal1<=999999)
																			{
																				bal=bal+bal1-(bal1*10/100);
																				System.out.println("                           ");
																				System.out.println("Your updated balance is "+bal);
																				System.out.println("                           ");
																				a9=true;
																			}
																			else if(bal1>=1000000)
																			{
																			bal=bal+bal1-(bal1*25/100);
																			System.out.println("                           ");
																			System.out.println("Your updated balance is "+bal);
																			System.out.println("                           ");
																			a9=true;
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
																						a9=false;
																					}break;
																				case 2:
																					{
																						a9=true;
																						b1=true;
																					}break;
																				
																				}

																			}
																}
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
															b1=true;
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
																		b1=false;
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
																		b1=false;
																	}break;
																	case 4:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b4=true;
																		b1=true;
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
																     boolean a8=false;
																	 while(!a8)
																	{
																		 System.out.println("                           ");
																	 System.out.println(">>>>>>>>>>CHARGES<<<<<<<<<<<");
																		System.out.println("                            ");
																		System.out.println("10% charges for ADD MONEY between 1000 to 999999");
																		System.out.println("2.5% charges for ADD MONEY over 1000000");
																		System.out.println("                                                   ");
																		System.out.println("********************************************************");
																		System.out.println("                                                     ");
																		System.out.println("Enter the amount to be added");
																		System.out.println("                           ");
																		int bal1 =sc.nextInt();
																	
																			if(bal1>=1000&& bal1<=999999)
																			{
																				bal=bal+bal1-(bal1*10/100);
																				System.out.println("                           ");
																				System.out.println("Your updated balance is "+bal);
																				System.out.println("                           ");
																				a8=true;
																			}
																			else if(bal1>=1000000)
																			{
																			bal=bal+bal1-(bal1*25/100);
																			System.out.println("                           ");
																			System.out.println("Your updated balance is "+bal);
																			System.out.println("                           ");
																			a8=true;
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
																						a8=false;
																					}break;
																				case 2:
																					{
																						a8=true;
																						b1=true;
																					}break;
																				
																				}

																			}
																}
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
															b1=true;
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
																		b1=false;
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
																		b1=false;
																	}break;
																	case 4:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b4=true;
																		b1=true;
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
																     boolean a7=false;
																	 while(!a7)
																	{
																		 System.out.println("                           ");
																	System.out.println(">>>>>>>>>>CHARGES<<<<<<<<<<<");
																		System.out.println("                            ");
																		System.out.println("10% charges for ADD MONEY between 1000 to 999999");
																		System.out.println("2.5% charges for ADD MONEY over 1000000");
																		System.out.println("                                                   ");
																		System.out.println("********************************************************");
																		System.out.println("                                                      ");
																		System.out.println("Enter the amount to be added");
																		System.out.println("                           ");
																		int bal1 =sc.nextInt();
																	
																			if(bal1>=1000&& bal1<=999999)
																			{
																				bal=bal+bal1-(bal1*10/100);
																				System.out.println("                           ");
																				System.out.println("Your updated balance is "+bal);
																				System.out.println("                           ");
																				a7=true;
																			}
																			else if(bal1>=1000000)
																			{
																			bal=bal+bal1-(bal1*25/100);
																			System.out.println("                           ");
																			System.out.println("Your updated balance is "+bal);
																			System.out.println("                           ");
																			a7=true;
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
																						a7=false;
																					}break;
																				case 2:
																					{
																						a7=true;
																						b1=true;
																					}break;
																				
																				}

																			}
																}
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
															b1=true;
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
																		b1=false;
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
																		b1=false;
																	}break;
																	case 4:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b4=true;
																		b1=true;
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
																     boolean a6=false;
																	 while(!a6)
																	{
																		 System.out.println("                           ");
																	 System.out.println(">>>>>>>>>>CHARGES<<<<<<<<<<<");
																		System.out.println("                            ");
																		System.out.println("10% charges for ADD MONEY between 1000 to 999999");
																		System.out.println("2.5% charges for ADD MONEY over 1000000");
																		System.out.println("                                                   ");
																		System.out.println("********************************************************");
																		System.out.println("                                                     ");
																		System.out.println("Enter the amount to be added");
																		System.out.println("                           ");
																		int bal1 =sc.nextInt();
																	
																			if(bal1>=1000&& bal1<=999999)
																			{
																				bal=bal+bal1-(bal1*10/100);
																				System.out.println("                           ");
																				System.out.println("Your updated balance is "+bal);
																				System.out.println("                           ");
																				a6=true;
																			}
																			else if(bal1>=1000000)
																			{
																			bal=bal+bal1-(bal1*25/100);
																			System.out.println("                           ");
																			System.out.println("Your updated balance is "+bal);
																			System.out.println("                           ");
																			a6=true;
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
																						a6=false;
																					}break;
																				case 2:
																					{
																						a6=true;
																						b1=true;
																					}break;
																				
																				}

																			}
																}
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
															b1=true;
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
																		b1=false;
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
																		b1=false;
																	}break;
																	case 4:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b4=true;
																		b1=true;
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
																      boolean a5=false;
																	  while(!a5)
																	{
																		  System.out.println("                           ");
																	 System.out.println(">>>>>>>>>>CHARGES<<<<<<<<<<<");
																		System.out.println("                            ");
																		System.out.println("10% charges for ADD MONEY between 1000 to 999999");
																		System.out.println("2.5% charges for ADD MONEY over 1000000");
																		System.out.println("                                                   ");
																		System.out.println("********************************************************");
																		System.out.println("                                                    ");
																		System.out.println("Enter the amount to be added");
																		System.out.println("                           ");
																		int bal1 =sc.nextInt();
																	
																			if(bal1>=1000&& bal1<=999999)
																			{
																				bal=bal+bal1-(bal1*10/100);
																				System.out.println("                           ");
																				System.out.println("Your updated balance is "+bal);
																				System.out.println("                           ");
																				a5=true;
																			}
																			else if(bal1>=1000000)
																			{
																			bal=bal+bal1-(bal1*25/100);
																			System.out.println("                           ");
																			System.out.println("Your updated balance is "+bal);
																			System.out.println("                           ");
																			a5=true;
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
																						a5=false;
																					}break;
																				case 2:
																					{
																						a5=true;
																						b1=true;
																					}break;
																				
																				}

																			}
																}
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
															b1=true;
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
																		b1=false;
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
																		b1=false;
																	}break;
																	case 4:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b4=true;
																		b1=true;
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
																      boolean a4=false;
																	  while(!a4)
																	{
																		  System.out.println("                           ");
																	 System.out.println(">>>>>>>>>>CHARGES<<<<<<<<<<<");
																		System.out.println("                            ");
																		System.out.println("10% charges for ADD MONEY between 1000 to 999999");
																		System.out.println("2.5% charges for ADD MONEY over 1000000");
																		System.out.println("                                                   ");
																		System.out.println("********************************************************");
																		System.out.println("                                                    ");
																		System.out.println("Enter the amount to be added");
																		System.out.println("                           ");
																		int bal1 =sc.nextInt();
																	
																			if(bal1>=1000&& bal1<=999999)
																			{
																				bal=bal+bal1-(bal1*10/100);
																				System.out.println("                           ");
																				System.out.println("Your updated balance is "+bal);
																				System.out.println("                           ");
																				a4=true;
																			}
																			else if(bal1>=1000000)
																			{
																			bal=bal+bal1-(bal1*25/100);
																			System.out.println("                           ");
																			System.out.println("Your updated balance is "+bal);
																			System.out.println("                           ");
																			a4=true;
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
																						a4=false;
																					}break;
																				case 2:
																					{
																						a4=true;
																						b1=true;
																					}break;
																				
																				}

																			}
																}
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
															b1=true;
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
																		b1=false;
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
																		b1=false;
																	}break;
																	case 4:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b4=true;
																		b1=true;
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
																      boolean a3=false;
																	  while(!a3)
																	{
																		  System.out.println("                           ");
																	 System.out.println(">>>>>>>>>>CHARGES<<<<<<<<<<<");
																		System.out.println("                            ");
																		System.out.println("10% charges for ADD MONEY between 1000 to 999999");
																		System.out.println("2.5% charges for ADD MONEY over 1000000");
																		System.out.println("                                                   ");
																		System.out.println("********************************************************");
																		System.out.println("                                                       ");
																		System.out.println("Enter the amount to be added");
																		System.out.println("                           ");
																		int bal1 =sc.nextInt();
																	
																			if(bal1>=1000&& bal1<=999999)
																			{
																				bal=bal+bal1-(bal1*10/100);
																				System.out.println("                           ");
																				System.out.println("Your updated balance is "+bal);
																				System.out.println("                           ");
																				a3=true;
																			}
																			else if(bal1>=1000000)
																			{
																			bal=bal+bal1-(bal1*25/100);
																			System.out.println("                           ");
																			System.out.println("Your updated balance is "+bal);
																			System.out.println("                           ");
																			a3=true;
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
																						a3=false;
																					}break;
																				case 2:
																					{
																						a3=true;
																						b1=true;
																					}break;
																				
																				}

																			}
																}
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
															b1=true;
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
																		b1=false;
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
																		b1=false;
																	}break;
																	case 4:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b4=true;
																		b1=true;
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
																     boolean a2=false;
																	 while(!a2)
																	{
																		 System.out.println("                           ");
																	 System.out.println(">>>>>>>>>>CHARGES<<<<<<<<<<<");
																		System.out.println("                            ");
																		System.out.println("10% charges for ADD MONEY between 1000 to 999999");
																		System.out.println("2.5% charges for ADD MONEY over 1000000");
																		System.out.println("                                                   ");
																		System.out.println("********************************************************");
																		System.out.println("                                                     ");
																		System.out.println("Enter the amount to be added");
																		System.out.println("                           ");
																		int bal1 =sc.nextInt();
																	
																			if(bal1>=1000&& bal1<=999999)
																			{
																				bal=bal+bal1-(bal1*10/100);
																				System.out.println("                           ");
																				System.out.println("Your updated balance is "+bal);
																				System.out.println("                           ");
																				a2=true;
																			}
																			else if(bal1>=1000000)
																			{
																			bal=bal+bal1-(bal1*25/100);
																			System.out.println("                           ");
																			System.out.println("Your updated balance is "+bal);
																			System.out.println("                           ");
																			a2=true;
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
																						a2=false;
																					}break;
																				case 2:
																					{
																						b1=true;
																						a2=true;
																					}break;
																				
																				}

																			}
																	}
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
															b1=true;
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
																		b1=false;
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
																		b1=false;
																	}break;
																	case 4:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b4=true;
																		b1=true;
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
																      boolean a1=false;
																	  while(!a1)
																	{
																		  System.out.println("                           ");
																	 System.out.println(">>>>>>>>>>CHARGES<<<<<<<<<<<");
																		System.out.println("                            ");
																		System.out.println("10% charges for ADD MONEY between 1000 to 999999");
																		System.out.println("2.5% charges for ADD MONEY over 1000000");
																		System.out.println("                                                   ");
																		System.out.println("********************************************************");
																		System.out.println("                                                        ");
																		System.out.println("Enter the amount to be added");
																		System.out.println("                           ");
																		int bal1 =sc.nextInt();
																	
																			if(bal1>=1000&& bal1<=999999)
																			{
																				bal=bal+bal1-(bal1*10/100);
																				System.out.println("                           ");
																				System.out.println("Your updated balance is "+bal);
																				System.out.println("                           ");
																				a1=true;
																			}
																			else if(bal1>=1000000)
																			{
																			bal=bal+bal1-(bal1*25/100);
																			System.out.println("                           ");
																			System.out.println("Your updated balance is "+bal);
																			System.out.println("                           ");
																			a1=true;
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
																						a1=false;
																					}break;
																				case 2:
																					{
																						b1=true;
																						a1=true;
																					}break;
																				
																				}

																			}
																}
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
											b1=false;
										}break;
										
									
									}
								}
							}break;
						case 2:
																{
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
																		b1=false;
																		d=true;
																	}break;
																	case 2:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b7=true;
																		b1=true;
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
																		b1=false;
																		d=true;
																	}break;
																	case 2:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b7=true;
																		b1=true;
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
																						b1=false;
																					}break;
																				
																				}

																			}
																	
																				
															
														}
																}break;
																
															
						case 3:
							{
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
																		
																		b12=true;
																		b1=false;
																	}break;
																	case 2:
																	{
																		System.out.println("                           ");
																		System.out.println("Thank you visit us again");
																		b12=true;
																		b1=true;
																	
															
																	}
																}
															
														}
							}

					}
					}
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
