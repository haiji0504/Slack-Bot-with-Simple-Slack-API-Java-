package bot;

import java.io.IOException;

import com.google.gson.Gson;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.impl.SlackSessionFactory;


public class Main {
	public static void main(String[] args) throws IOException {
		SlackSession session = SlackSessionFactory.createWebSocketSlackSession("xoxb-801592256240-790123214931-NVbKyHZJ3TQSPOK6wBVI51uM");
		ListeningToMessageEvents ltme = new ListeningToMessageEvents();
		ltme.registeringAListener(session);
		session.connect();
		
		GetWeatherByOkHttp gw = new GetWeatherByOkHttp();
		System.out.println("-------------------------");
		System.out.println(gw.result);
		System.out.println("-------------------------");
		String A = gw.result;
		WeatherEntity we = Gson.fromJson(A, WeatherEntity.class);
		
	}
}

/*対応予定内容*/
//googleカレンダーとの連携
//天気
//所在確認(本社にいるか)