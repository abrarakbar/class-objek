
public class main {

	
	public static void main(String[] args) {
		Kotak kotakHitam = new Kotak();
		
		kotakHitam.setPanjang(20);
		kotakHitam.setLebar(10);
		
		kotakHitam.hitungLuas();
		kotakHitam.hitungKeliling();
	
		System.out.println("Panjang : " + kotakHitam.getPanjang());
		System.out.println("Lebar : " + kotakHitam.getLebar());
		System.out.println("LuasKotak : " + kotakHitam.getLuas());
		System.out.println("KelilingKotak " + kotakHitam.getKeliling());
		System.out.println("___________________________________________");
				
		{
			//HasilMahasiswa
			mahasiswa mhs1 = new mahasiswa();
			mhs1.setNama("Muh.AbrarAkbar.T");
			mhs1.setNim("D0217367");
			mhs1.setAlamat("campalagian");
			mhs1.setGolonganDarah("C");
			mhs1.setStatus("Mahasiswa");
			mhs1.setTinggiBadan(169);
			mhs1.setBeratBadan(48);
			
			System.out.println("Nama : " + mhs1.getNama());
			System.out.println("Nim : " + mhs1.getNim());
			System.out.println("Alamat : " + mhs1.getAlamat());
			System.out.println("GolonganDarah : " + mhs1.getGolonganDarah());
			System.out.println("Status : " + mhs1.getStatus());
			System.out.println("TinggiBadan : " + mhs1.getTinggiBadan());
			System.out.println("BeratBadan : " + mhs1.getBaratBadan());
			System.out.println("---------------------------------------------");

			System.out.println("------Object Kelas node------");
			//membuat object darikelas node
			node node = new node();
			
			//method setter node
			node.label = "PAPAYA_SOAP";
			node.Value = 1;
			
			//method getter node
			System.out.println("Nama Label : " + node.getlabel());
			System.out.println("jumlah label : " + node.getValue());
			
			
			//membuat object darikelas stack
			stack stack = new stack();
			System.out.println("------Object Kelas stack------");
			stack.value[0] = "MUH.ABRAR AKBAR.T";
			stack.value[1] = "Ali Baba";
			stack.value[2]= "Ismail imar";
			stack.value[3]= "Andika";
			stack.value[4]= "ika";
			stack.value[5]= "Andi";
			stack.value[6]= "Adi";
			stack.value[7]= "tuturu";
			stack.value[8]= "yuyu";
			stack.value[9]= "Atu";
			stack.value[10]= "dompet";
			stack.value[11]= "Andika";
			stack.value[12]= "hilang";
			stack.value[13]= "di";
			stack.value[14]= "makan";
			stack.value[15]= "Andika";
			stack.value[16]= "abrar";
			stack.value[17]= "ingin";
			stack.value[18]= "Anja";
			stack.value[19]= "ka";
			stack.value[20]= "cyc";
			stack.value[21]= "Akbar";
			stack.value[22]= "cocc";
			stack.value[23]= "yuyu";
			stack.value[24]= "kankang";
			stack.value[25]= "terhebat";
			stack.value[26]= "dengan";
			stack.value[27]= "Aku";
			stack.value[28]= "yang";
			stack.value[29]= "Akan";
			stack.value[30]= "kata";
			stack.value[31]= "ika";
			stack.value[32]= "778";
			stack.value[33]= "janda";
			stack.value[34]= "istri";
			stack.value[35]= "akan";
			stack.value[36]= "pergi";
			stack.value[37]= "yang";
			stack.value[38]= "berlalu";
			stack.value[39]= "biarlah";
			stack.value[40]= "berlalu";
			stack.value[41]= "kenangn";
			stack.value[42]= "pahit";
			stack.value[43]= "Andika";
			stack.value[44]= "selalu";
			stack.value[45]= "terringat";
			stack.value[46]= "denganjelas";
			stack.value[47]= "Abrar";
			stack.value[48]= "Abrar";
			stack.value[49]= "Abrar";
			stack.value[50]= "Abrar";
			stack.value[51]= "Abrar";
			stack.value[52]= "Abrar";
			stack.value[53]= "Abrar";
			stack.value[54]= "Abrar";
			stack.value[55]= "Abrar";
			stack.value[56]= "Abrar";
			stack.value[57]= "Abrar";
			stack.value[58]= "Abrar";
			stack.value[59]= "Abrar";
			stack.value[60]= "Akbar";
			stack.value[61]= "Akbar";
			stack.value[62]= "Akbar";
			stack.value[63]= "Akbar";
			stack.value[64]= "Akbar";
			stack.value[65]= "Akbar";
			stack.value[66]= "Akbar";
			stack.value[67]= "Akbar";
			stack.value[68]= "Akbar";
			stack.value[69]= "Akbar";
			stack.value[70]= "Akbar";
			stack.value[71]= "Akbar";
			stack.value[72]= "Akbar";
			stack.value[73]= "Akbar";
			stack.value[74]= "good";
			stack.value[75]= "gusion";
			stack.value[76]= "gusion";
			stack.value[77]= "nana";
			stack.value[78]= "irithel";
			stack.value[79]= "lesley";
			stack.value[80]= "combec";
			stack.value[81]= "tutter";
			stack.value[82]= "has lein";
			stack.value[83]= "duoubel";
			stack.value[84]= "kill";
			stack.value[85]= "tripel";
			stack.value[86]= "kill";
			stack.value[87]= "maniac";
			stack.value[88]= "savage";
			stack.value[89]= "victory";
			stack.value[90]= "defeat";
			stack.value[91]= "war";
			stack.value[92]= "indo";
			stack.value[93]= "merah";
			stack.value[94]= "putih";
			stack.value[95]= "Abrar";
			stack.value[96]= "cencer";
			stack.value[97]= "cencer";
			stack.value[98]= "gusion";
			stack.value[99]= "mobail legend";
			stack.setvalueAt(4 ,"");

			for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};
		}

	}

}
