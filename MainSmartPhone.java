interface MusicPlayer
{
	void playMusic();
	void stopMusic();
}

interface Camera
{
	void takeSelfie();
	void takeVideo();
}

class SmartPhone implements Camera,MusicPlayer 
{
	@Override
	public void playMusic()
	{
		System.out.println("Music is geting play --> Aaj ki raat maza husn kaa aankhon se lijiye");
	}

	@Override
	public void stopMusic()
	{
		System.out.println("Ruk beeee");
	}

	@Override
	public void takeSelfie()
	{
		System.out.println("Toh Kheench meri photo ooooo piya");
	}

	@Override
	public void takeVideo()
	{
		System.out.println("Chal video bana ------>chaumin khaynege nepal me bas jayenge theekk haiiii");
	}

	public void playGame()
	{
		System.out.println("Clash of Clans......");
	}
}

class MainSmartPhone
{
	public static void main(String[] args) 
	{
		SmartPhone sp = new SmartPhone();
		sp.playMusic();
		sp.stopMusic();
		sp.takeSelfie();
		sp.takeVideo();
		sp.playGame();
	}
}