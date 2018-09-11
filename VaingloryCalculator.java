/*
Autor: JBC
Fecha de inicio: 9/6/18 
Fecha de terminación:
Objetivo del Programa: Calcular el Daño en vainglory
*/
class VaingloryCalculator
{
	public static void main(String[] args)
	{
		
		char condition=Condition();
		MethodCaller(condition);
				
	}
	//Calcular daño de ataques basicos sin criticos ni perforacion de armadura
	public static void BasicDamageC(float armor, float wp)
	{
		float armorSum=(1+(armor/100));
		float basicDamage=(wp/armorSum);
		
		System.out.println("El daño del ataque basico es: "+basicDamage);
	}
	//Calcular daño de habilidad sin perforacion de escudo
	public  static  void AbilityDamage(float shield, float cp, float cpDamage, float cpRatio)
	{
		float abilityPower=cpDamage+(cpRatio*cp);
		float abilityDamage=abilityPower/(1+shield/100);
		
		System.out.println("El daño de la habilidad es: "+abilityDamage);
	}
	//Calcular daño de ataque basico con perforacion de armadura
	public static void ArmorPiercing(float armor,float wp,float pierc)
	{
		float piercedDamage =pierc*wp+(1-pierc)*wp/(1+armor/100);
		
		System.out.println("El daño del basico es: "+piercedDamage);
	}
	//Calcular daño de habilidad con perforacion de escudo
	public static void ShieldPiercing(float shield,float cp,float cpDamage,float cpRatio,float pierc)
	{
		float abilityPower=cpDamage+(cpRatio*cp);
		float abilityDamage=abilityPower/(1+shield/100);
		
		float piercedDamage =pierc*abilityDamage+(1-pierc)*abilityDamage/(1+shield/100);
		
		System.out.println("El daño de la habilidad con perforacion es: "+piercedDamage);
	}
	//Condicion para elegir que calcular
	public static char Condition()
	{
		System.out.println("Que quieres calcular (B)asico, (H)abilidad, Perforacion de (A)rmadura o Perforacion de (E)scudo");
			char condition=Lectura.readChar();
			
			return condition;
	}
	public static void MethodCaller(char condition)
	{
		//Condicion de Ataque Basico
		if (condition=='B' || condition=='b')
		{
			System.out.println("Introduce la cantidadad de armadura del enemigo");
				float armor=Lectura.readFloat();
				
			System.out.println("Introduce la cantidadad de poder de Arma (WP)");
				float wp=Lectura.readFloat();
				
				BasicDamageC(armor,wp);
		}
		//Condicion de Habilidad
		else if(condition=='H' || condition =='h')
		{
			
			System.out.println("Introduce la cantidadad de escudo del enemigo");
				float shield=Lectura.readFloat();
				
			System.out.println("Introduce la cantidadad de poder de Cristal (CP)");
				float cp=Lectura.readFloat();
				
			System.out.println("Introduce la cantidadad de daño de la habilidad");
				float cpDamage=Lectura.readFloat();
					
			System.out.println("Introduce el porcentaje de cristal de la habilidad");
				float cpRatio=Lectura.readFloat();
				//Convierte el porcentaje ejemplo 100 = 1.0
				cpRatio=(cpRatio/100);
				
				AbilityDamage(shield,cp,cpDamage,cpRatio);
		}
		//Condicion de perforacion de armadura
		else if(condition =='A' || condition =='a')
		{
			System.out.println("Introduce la cantidadad de armadura del enemigo");
				float armor=Lectura.readFloat();
				
			System.out.println("Introduce la cantidadad de poder de Arma (WP)");
				float wp=Lectura.readFloat();
				
			System.out.println("Introduce la cantidadad de perforacion");
				float pierc=Lectura.readFloat();
				pierc=(pierc/100);
				
				ArmorPiercing(armor,wp,pierc);	
		}
		//Condicion de perforacion de escudo
		else
		{
			System.out.println("Introduce la cantidadad de escudo del enemigo");
				float shield=Lectura.readFloat();
				
			System.out.println("Introduce la cantidadad de poder de Cristal (CP)");
				float cp=Lectura.readFloat();
				
			System.out.println("Introduce la cantidadad de daño de la habilidad");
				float cpDamage=Lectura.readFloat();
					
			System.out.println("Introduce el porcentaje de cristal de la habilidad");
				float cpRatio=Lectura.readFloat();
				//Convierte el porcentaje ejemplo 100 = 1.0
				cpRatio=(cpRatio/100);
			System.out.println("Introduce la perforacion de escudo");
				float pierc=Lectura.readFloat();
				pierc=(pierc/100);
				
				ShieldPiercing(shield,cp,cpDamage,cpRatio,pierc);	
		}
	}
}