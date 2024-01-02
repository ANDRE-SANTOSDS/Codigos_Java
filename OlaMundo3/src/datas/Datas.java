package datas;

import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
//import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		
		/* System.out.print("Birth date (DD/MM/YYYY):");
	     LocalDate data = LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	     System.out.println(data); Para o usuario digitar a data
	     */
		
		//Data dd MM yyyy
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		
		System.out.println(LocalDate.of(2019, 02, 1));
		System.out.println(LocalDate.parse("2019-02-01"));//Formato string, tem que escrever a data na sequência (yyyy-mm-dd)
		
		//System.out.println(agora.plusDays(30));Adicionar mais dias
		
		//System.out.println(agora.minus(1, ChronoUnit.MONTHS)); Diminuir a quantidade de meses
		
		//System.out.println(agora.getDayOfWeek()); Para verificar o dia da semana
		//System.out.println(agora.getDayOfMonth()); Para verificar o dia do mês
		//System.out.println(agora.getDayOfYear()); Para verificar o dia do ano
		
		//System.out.println(agora.isLeapYear()); Para verificar se o ano e bissexto
		//System.out.println(LocalDate.of(2020, 02, 1).isLeapYear()); Para verificar se o ano e bissexto
		
		
		//Hora formato iso
		LocalTime hAgora = LocalTime.now();
		System.out.println(hAgora);
		
		//System.out.println(LocalTime.of(20,18)); Hora e minuto
		//System.out.println(LocalTime.parse("20:18")); Hora e minuto String
		//System.out.println(LocalTime.of(17, 40, 20)); Hora,minuto e segundo
		//System.out.println(LocalTime.parse("20:18:33"));Hora,minuto e segundo (String)
		
		//System.out.println(hAgora.plusMinutes(60)); Adicionas minutos
		//System.out.println(hAgora.minus(40, ChronoUnit.HOURS)); Diminuir horas
		
		//System.out.println(hAgora.getHour());Para saber somente a hora atual
		//System.out.println(hAgora.getMinute()); Para saber somente o minuto atual
		//System.out.println(hAgora.getSecond()); Para saber somente o segundo atual
		
		
		//Data completa = data + hora
		System.out.println();
		LocalDateTime agoraCompleto = LocalDateTime.now();
		System.out.println(agoraCompleto);
		
		System.out.println(LocalDateTime.of(agora, hAgora));
		//System.out.println(LocalDateTime.of(2023, 10, 28, 17, 54)); Ano , mês , dia , hora e minuto
		//System.out.println(LocalDateTime.of(2023, 10, 28, 18, 29, 30));  Ano , mês , dia , hora , minuto e segundo
		//System.out.println(LocalDateTime.parse("2023-10-28T17:57:44"));  Ano , mês , dia , hora e minuto (String)
		//System.out.println(agoraCompleto.plusYears(10)); Adicionar anos
		
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		/*Set<String> fusos = ZoneId.getAvailableZoneIds(); Para saber todos os fusos existentes
		for(String f: fusos) {
			System.out.println(f);
		}*/
		
		ZoneId sp = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2023-10-28T18:10:41"),sp);
		System.out.println(zdt);
		System.out.println(ZonedDateTime.parse("2023-10-28T18:10:41-03:00[America/Sao_Paulo]"));
		
		ZoneOffset offset = ZoneOffset.of("+02:00");
		OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset);
		System.out.println(offsetdt);
		
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);
		System.out.println(ldtDate);
		System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));
		
	}

}
