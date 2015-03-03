//arbys dnh shot data maker

import java.io.*;

//thanks http://www.caveofprogramming.com/frontpage/articles/java/java-file-reading-and-writing-files-in-java/#writetext
public class ShotMaker {
	public static int	BLEND_ALPHA=0;
	public static int	BLEND_ADD_RGB=1;
	public static int	BLEND_ADD_ARGB=2;
	public static String[] BLENDS_LIST={
						"ALPHA",
						"ADD_RGB",
						"ADD_ARGB"
						};

	public static void main(String [] args) {

		int currentID=1;//Start at 1, not 0.

		int idAddShift=500;
		String[] colorNames16 =	{	"RED","DRED","ORANGE","YELLOW",
									"DYELLOW","LIME","GREEN","DGREEN",
									"SKY","DSKY","BLUE","DBLUE",
									"DPURPLE","PURPLE","BLACK","WHITE"};
		int[][] colors16 =		{	{255,0,0},{255,0,0},{255,128,0},{255,255,0},
									{255,255,0},{128,255,0},{0,255,0},{0,255,0},
									{0,255,255},{0,255,255},{0,0,255},{0,0,255},
									{255,0,255},{255,0,255},{255,255,255},{255,255,255}};
		String[] colorNames8 =	{	"RED","ORANGE","YELLOW","GREEN",
									"SKY","BLUE","PURPLE","WHITE"};
		int[][] colors8 =		{	{255,0,0},{255,128,0},{255,255,0},{0,255,0},
									{0,255,255},{0,0,255},{255,0,255},{255,255,255}};
		String[] colorNames9 =	{	"RED","ORANGE","YELLOW","LIME","GREEN",
									"SKY","BLUE","PURPLE","WHITE"};
		int[][] colors9 =		{	{255,0,0},{255,128,0},{255,255,0},{128,255,0},{0,255,0},
									{0,255,255},{0,0,255},{255,0,255},{255,255,255}};
		ColorGroup c16 = new ColorGroup(colorNames16,colors16);
		ColorGroup c8 = new ColorGroup(colorNames8,colors8);
		ColorGroup c9 = new ColorGroup(colorNames9,colors9);

		int num=16;

		SimpleBulletsGroup group1 = new SimpleBulletsGroup( new String[]	{"BALL1",	"RICE1",	"ICE1",	"GEM1",	"BALL_BS1",	"KUNAI1",	"SCALE1",	"STAR1"},
															new boolean[]	{false,		false,		false,	false,	false,		false,		false,		false},
															new int[]		{4,			2,			2,		2,		3,			2,			2,			2},
															new int[]		{0,			0,			0,		0,		0,			0,			0,			15},
															new int[]		{BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA});
		//alternative method
		SimpleBulletsGroup group1v2 = new SimpleBulletsGroup(7);
		group1v2.AddNames(new String[]		{"BALL1",	"RICE1",	"ICE1",	"GEM1",	"BALL_BS1",	"KUNAI1",	"SCALE1",	"STAR1"});
		group1v2.AddSplits(new boolean[]	{false,		false,		false,	false,	false,		false,		false,		false});
		group1v2.AddRads(new int[]			{4,			2,			2,		2,		3,			2,			2,			2});
		//group1v2.AddAvs(new int[]			{0,			0,			0,		0,		0,			0,			0,			15});
		group1v2.AddXAvs(7, 0);
		group1v2.AddXAvs(1, 15);
		group1v2.AddBlends(new int[]	{BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA});

		SimpleBulletsGroup group2 = new SimpleBulletsGroup( new String[]	{"BILL1"},
															new boolean[]	{false},
															new int[]		{2},
															new int[]		{0},
															new int[]		{BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA});
		SimpleBulletsGroup group2p1 = new SimpleBulletsGroup( new String[]	{"BILL2"},
															new boolean[]	{false},
															new int[]		{2},
															new int[]		{0},
															new int[]		{BLEND_ALPHA});
		SimpleBulletsGroup group3 = new SimpleBulletsGroup( new String[]	{"SLUG1",	"RICE_INV1",	"HEART1",	"DROP1",	"SLASER1"},
															new boolean[]	{false,		false,			false,		false,		false},
															new int[]		{2,			3,				3,			2,			1},
															new int[]		{0,			0,				0,			0,			0},
															new int[]		{BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA});
		SimpleBulletsGroup laser1 = new SimpleBulletsGroup( new String[]	{"LASER1"},
															new boolean[]	{false},
															new int[]		{1},
															new int[]		{0},
															new int[]		{BLEND_ALPHA});
		SimpleBulletsGroup arrow1 = new SimpleBulletsGroup( new String[]	{"ARROW1"},
															new boolean[]	{false},
															new int[]		{2},
															new int[]		{0},
															new int[]		{BLEND_ALPHA});
		SimpleBulletsGroup small1 = new SimpleBulletsGroup( new String[]	{"DOT1",	"DOT1SPIN"},
															new boolean[]	{false,		false},
															new int[]		{1,			1},
															new int[]		{0,			11},
															new int[]		{BLEND_ALPHA,BLEND_ALPHA});
		SimpleBulletsGroup group4 = new SimpleBulletsGroup( new String[]	{"BALL2",	"RICE2",	"ICE2",	"BALL_BS2",	"KUNAI2",	"SCALE2",	"STAR2",	"SLUG2",	"RICE_INV2",	"HEART2",	"DROP2"},
															new boolean[]	{false,		false,		false,	false,		false,		false,		false,		false,		false,			false,		false},
															new int[]		{6,			4,			3,		5,			3,			3,			3,			3,			4,				4,			3},
															new int[]		{0,			0,			0,		0,			0,			0,			-10,		0,			0,				0,			0},
															new int[]		{BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA});
		SimpleBulletsGroup group5 = new SimpleBulletsGroup( new String[]	{"BALL3",	"RICE3",	"KNIFE2",	"BUTTERFLY1",	"STAR3",	"RICE_INV3",	"HEART3"},
															new boolean[]	{false,		false,		false,		false,			false,		false,			false,},
															new int[]		{9,		4,			3,			3,				5,			4,				6,},
															new int[]		{0,			0,			0,			0,				8,			0,				0},
															new int[]		{BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA});
		SimpleBulletsGroup knife1 = new SimpleBulletsGroup( new String[]	{"KNIFE1"},
															new boolean[]	{false},
															new int[]		{3},
															new int[]		{0},
															new int[]		{BLEND_ALPHA});
		SimpleBulletsGroup ball_l1 = new SimpleBulletsGroup( new String[]	{"BALL_L1"},
															new boolean[]	{true},
															new int[]		{16},
															new int[]		{-9},
															new int[]		{BLEND_ALPHA});
		SimpleBulletsGroup corona1 = new SimpleBulletsGroup( new String[]	{"CORONA1"},
															new boolean[]	{true},
															new int[]		{11},
															new int[]		{0},
															new int[]		{BLEND_ALPHA});
		SimpleBulletsGroup flash1 = new SimpleBulletsGroup( new String[]	{"FLASH",	"FLASH_F2",	"FLASH_F3",	"FLASH_F4"},
															new boolean[]	{false,		false,		false,		false},
															new int[]		{1,			1,			1,			1},
															new int[]		{0,			0,			0,			0},
															new int[]		{BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA,BLEND_ALPHA});

		BulletsSetDef wispSet1 = new BulletsSetDef("WISP1", false, 4, 0, BLEND_ALPHA);
		BulletsSetDef wispSet2 = new BulletsSetDef("WISP2", false, 6, 0, BLEND_ALPHA);

		//BufferedWriter[] writers = {file1bw,file2bw,file1Abw,file2Abw};
		LineList written1 = new LineList();
		LineList written2 = new LineList();
		LineList written1A = new LineList();
		LineList written2A = new LineList();
		written1.write("#UserShotData");
		written1.write("");
		written1.write("shot_image = \"./img/arbyshot3.png\"");
		written1.write("");
		written1A.write("#UserShotData");
		written1A.write("");
		written1A.write("shot_image = \"./img/arbyshot3.png\"");
		written1A.write("");
		written2.write("local");
		written2.write("{");
		written2.write("	let current = GetCurrentScriptDirectory();");
		written2.write("	let path = current ~ \"arbyShot3Data.dnh\";");
		written2.write("	LoadEnemyShotData(path);");
		written2.write("	path = current ~ \"arbyShot3Data_add.dnh\";");
		written2.write("	LoadEnemyShotData(path);");
		written2.write("}");
		written2.write("");

		LineList[] writers = {written1,written2, written1A, written2A};
		currentID=WriteGroup(writers, currentID, group1, new int[]{0,0}, new int[]{18,18},0, c16, idAddShift);
		currentID=WriteGroup(writers, currentID, group2, new int[]{0,18*8}, new int[]{18,18},18, c8, idAddShift);
		currentID=WriteGroup(writers, currentID, group2p1, new int[]{18,18*8}, new int[]{18,18},18, c8, idAddShift);
		currentID=WriteGroup(writers, currentID, group3, new int[]{0,18*9}, new int[]{18,18},0, c16, idAddShift);
		currentID=WriteGroup(writers, currentID, laser1, new int[]{0,18*9+18*5}, new int[]{18,72},0, c16, idAddShift);
		currentID=WriteGroup(writers, currentID, arrow1, new int[]{0,18*9+18*5+72}, new int[]{18,72},0, c16, idAddShift);

		currentID=WriteGroup(writers, currentID, small1, new int[]{0,396}, new int[]{10,10},0, c8, idAddShift);

		currentID=WriteGroup(writers, currentID, group5, new int[]{0,416}, new int[]{32,32},0, c8, idAddShift);
		currentID=WriteGroup(writers, currentID, knife1, new int[]{256,608}, new int[]{32,32},0, c8, idAddShift);
		currentID=WriteGroup(writers, currentID, ball_l1, new int[]{0,640}, new int[]{64,64},0, c8, idAddShift);
		currentID=WriteGroup(writers, currentID, corona1, new int[]{256,640}, new int[]{64,64},0, c8, idAddShift);
		currentID=WriteGroup(writers, currentID, flash1, new int[]{0,768}, new int[]{32,32},0, c8, idAddShift);

		currentID=WriteBulletSetAnimated(writers, currentID, wispSet2, new int[]{256,416}, new int[]{32,48}, 4,3, 0, c8, idAddShift);
		currentID=WriteBulletSetAnimated(writers, currentID, wispSet1, new int[]{288,264}, new int[]{24,30}, 4,3, 0, c9, idAddShift);

		currentID=WriteGroup(writers, currentID, group4, new int[]{288,0}, new int[]{24,24},0, c9, idAddShift);

		// The name of the file to open.
		String fileName1 = "arbyShot3Data.dnh";
		String fileName2 = "arbyShot3Const.dnh";
		String fileName1A = "arbyShot3Data_add.dnh";
		//String fileName2A = "arbyShot3Const_add.dnh";
		try {
			// Assume default encoding.
			FileWriter fileWriter1 = new FileWriter(fileName1);
			// Always wrap FileWriter in BufferedWriter.
			BufferedWriter file1bw = new BufferedWriter(fileWriter1);
			for(int i=0; i<writers[0].size; i++){
				file1bw.write(writers[0].selected.content);
				file1bw.newLine();
				writers[0].Advance();
			}
			// Always close files.
			file1bw.close();

			// Assume default encoding.
			FileWriter fileWriter1A = new FileWriter(fileName1A);
			// Always wrap FileWriter in BufferedWriter.
			BufferedWriter file1Abw = new BufferedWriter(fileWriter1A);
			for(int i=0; i<writers[2].size; i++){
				file1Abw.write(writers[2].selected.content);
				file1Abw.newLine();
				writers[2].Advance();
			}
			// Always close files.
			file1Abw.close();


			// Assume default encoding.
			FileWriter fileWriter2 = new FileWriter(fileName2);
			// Always wrap FileWriter in BufferedWriter.
			BufferedWriter file2bw = new BufferedWriter(fileWriter2);
			for(int i=0; i<writers[1].size; i++){
				file2bw.write(writers[1].selected.content);
				file2bw.newLine();
				writers[1].Advance();
			}
			file2bw.newLine();
			for(int i=0; i<writers[3].size; i++){
				file2bw.write(writers[3].selected.content);
				file2bw.newLine();
				writers[3].Advance();
			}
			// Always close files.
			file2bw.close();
		}
		catch(IOException ex) {
			System.out.println(
				"Error opening files");
			// Or we could just do this:
			// ex.printStackTrace();
		}
	}
	public static int WriteGroup(LineList[] writers, int bID, SimpleBulletsGroup bG, int[] startCoord, int[] tile, int exshiftx, ColorGroup cg, int idAddShift) {
		int len = bG.length;
		for(int i=0;i<len;i++){
			bID = WriteBulletSet(writers, bID, bG.bg[i], new int[]{startCoord[0],startCoord[1]+tile[1]*i}, tile, exshiftx, cg, idAddShift);
		}
		return bID;
	}
	public static int WriteBulletSet(LineList[] writers, int bID, BulletsSetDef bSet, int[] startCoord, int[] tile, int exshiftx, ColorGroup cg, int idAddShift) {
		// Sometimes one group is in two rows, like large bubbles.
		//  We call WriteBulletSet twice over again, with adjustments to the second one.
		if(bSet.split){
			int num2=cg.length/2;
			ColorGroup cg1stHalf = new ColorGroup(cg);
			cg1stHalf.length = num2;
			bSet.split=false;
			bID=WriteBulletSet(writers, bID, bSet, startCoord, tile, exshiftx, cg1stHalf, idAddShift);
			ColorGroup cg2ndHalf=new ColorGroup(num2);
			for(int i=0; i<num2; i++){
				cg2ndHalf.cg[i]=new ColorDef(cg.GetName(i+num2),cg.GetValue(i+num2));
			}
			BulletsSetDef bSet2ndHalf = new BulletsSetDef(bSet);
			bID=WriteBulletSet(writers, bID, bSet2ndHalf, new int[] {startCoord[0],startCoord[1]+tile[1]}, tile, exshiftx, cg2ndHalf, idAddShift);
			return bID;
		}

		// Write the group of bullets
		int num = cg.length;
		LineList file1bw = writers[0];
		LineList file2bw = writers[1];
		LineList file1Abw = writers[2];
		LineList file2Abw = writers[3];
		file1bw.write("// " + bSet.name + " --------------------------------");
		file1Abw.write("// " + bSet.name + " --------------------------------");
		for(int c=0; c<num; c++){
			int u=startCoord[0]+c*tile[0]+c*exshiftx;
			int v=startCoord[1];
			WriteBullet(writers, bID+c, new int[]{u,v,u+tile[0],v+tile[1]},1,1,0, cg.GetName(c),cg.GetValue(c), bSet.rad, bSet.av, BLEND_ALPHA);
			LineList[] writers2 = {file1Abw, file2Abw};
			WriteBullet(writers2, bID+c+idAddShift, new int[]{u,v,u+tile[0],v+tile[1]},1,1,0, cg.GetName(c),cg.GetValue(c), bSet.rad, bSet.av, BLEND_ADD_ARGB);
			file2bw.write("let AN_" + bSet.name + "_" + cg.GetName(c) + " =		" + (bID+c) + ";");
			file2Abw.write("let AN_" + bSet.name + "_A_" + cg.GetName(c) + " =		" + (bID+c+idAddShift) + ";");
		}
		file1bw.write("");
		file2bw.write("");
		file1Abw.write("");
		file2Abw.write("");

		return bID+num;
	}
	public static int WriteBulletSetAnimated(LineList[] writers, int bID, BulletsSetDef bSet, int[] startCoord, int[] tile, int frames,int ftime, int exshiftx, ColorGroup cg, int idAddShift) {
		// Write the group of bullets
		int num = cg.length;
		LineList file1bw = writers[0];
		LineList file2bw = writers[1];
		LineList file1Abw = writers[2];
		LineList file2Abw = writers[3];
		file1bw.write("// " + bSet.name + " --------------------------------");
		for(int c=0; c<num; c++){
			int u=startCoord[0]+c*tile[0]+c*exshiftx;
			int v=startCoord[1];
			WriteBullet(writers, bID+c, new int[]{u,v,u+tile[0],v+tile[1]}, frames,ftime, tile[1], cg.GetName(c),cg.GetValue(c), bSet.rad, bSet.av, BLEND_ALPHA);
			LineList[] writers2 = {file1Abw, file2Abw};
			WriteBullet(writers2, bID+c+idAddShift, new int[]{u,v,u+tile[0],v+tile[1]}, frames,ftime, tile[1], cg.GetName(c),cg.GetValue(c), bSet.rad, bSet.av, BLEND_ADD_ARGB);
			file2bw.write("let AN_" + bSet.name + "_" + cg.GetName(c) + " =		" + (bID+c) + ";");
			file2Abw.write("let AN_" + bSet.name + "_A_" + cg.GetName(c) + " =		" + (bID+c+idAddShift) + ";");
		}
		file1bw.write("");
		file2bw.write("");
		file1Abw.write("");
		file2Abw.write("");
		return bID+num;
	}
	public static void WriteBullet(LineList[] writers, int bID, int[] rect, int frames,int ftime, int yshift, String colorName, int[] color, int collision, int av, int blend) {
		LineList file1bw=writers[0];
		LineList file2bw=writers[1];
		String csp=", ";
		file1bw.write("ShotData{id = " + bID + " // " + colorName);
		String line = " ";//space
		if(frames > 1){
			file1bw.write("	AnimationData {");
			for(int i=0; i<frames; i++){
				file1bw.write("		animation_data = ( "
									+ftime
									+csp+rect[0]
									+csp+(rect[1]+yshift*i)
									+csp+(rect[2])
									+csp+(rect[3]+yshift*i)
									+ " )");
			}
			file1bw.write("	}");
			line = "	";//tab
		}
		else{
			line = line + "	rect=(" +rect[0]+csp+rect[1]+csp+(rect[2])+csp+(rect[3]) + ")";
		}
		line = line + "delay_color=(" +color[0]+csp+color[1]+csp+color[2] + ")";
		if(collision != -1){
			line = line + " collision=" + collision;
		}
		if(av != 0){
			line = line + " angular_velocity=" + av;
		}
		if(blend != BLEND_ALPHA){
			line = line + " render=" + BLENDS_LIST[blend];
		}
		line = line + " }";
		file1bw.write(line);
	}
}

