# CoolWeather

这是学习完《第一行代码》中所有知识点后的练习之作。该App能实现手动查询全国某地的天气。

## 应用功能实现细节

用户在选择地理信息的时候，App会先从数据库读取信息，假如数据库中不存在数据的话，则会通过HttpURLConnection类来访问[http://www.weather.com.cn/data/list3/city.xml][1]获取国内的省市县信息，并将其存储在本地创建的SQLite数据库中。

用户在选定目标县城后，App会通过查询服务器获取县级代号获取到对应的天气代号。然后再通过该天气代号获取一段JSON数据。接下来只要用JSONObject类来分析获取到的JSON数据即可得到该县的天气信息。 

用户可以点击更新按钮来手动更新天气信息，同时项目中还写了一个Service来在后台自动更新天气信息。

## 截图

![Home](http://i.imgur.com/NOf3gR6.png)
![Province](http://i.imgur.com/dv2SGGb.png)
![City](http://i.imgur.com/QmJiEsK.png)

[1]:	http://www.weather.com.cn/data/list3/city.xml
