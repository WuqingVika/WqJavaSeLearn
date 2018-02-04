## 一、Idea常用技巧总结

### 1.无处不在的跳转
>注：这里的快捷键是自己定义的，并非大家的都一样，可以通过findAction查找相应的快捷键。
> 菜单栏选择"帮助/help"&rarr;FindAction(ctrl+shift+A)快速搜索想要查找命令。
> 我这里只演示windows平台使用的快捷键(eclipse版本KeyMap)。
#### 1.1 项目窗口间的跳转
- 菜单栏选择window &rarr;Previous Project Window(ctrl+alt+左方括号)

#### 1.2 文件之间的跳转
- 查看近期浏览文件 findaction(ctrl+shift+A)  &rarr;输入recent files
  - Ctrl+E
- 查看近期改动文件 recent changed files &hArr; ctrl+shift+e
- 修改位置跳转
  - 菜单栏"Navigate"&rarr;last edit location(ctrl+Q)
  - 反之 next edit location 可以自定义快捷键。
- 浏览位置跳转(光标停留位置) navigate  &rarr;back(alt+向左箭头)

#### 1.3 项目区与代码编辑区的相应跳转
- 项目区跳到右边代码编辑区
  - 按ESC键
- 代码编辑区跳到左边项目区
  - Alt+数字1

#### 1.4 书签之间的跳转
- 利用书签跳转
  - findaction&rarr;bookmarks&rarr;toggle bookmark(ctrl+shift+F11)
  - 带标记书签 bookmarks&rarr;toggle bookmarks with Mnemonic(ctrl+alt+shift+F11)
  - 标签间跳转 用ctrl+作标记的数字(这里有个坑我按小键盘数字没反应，得按大键盘的数字才行)
#### 1.5 收藏夹
- 查看收藏夹 findaction&rarr;favorites(alt+2)
  - 可以看到我们的书签、收藏夹。
  - 单独添加到收藏夹（自定义收藏夹）
    - findaction &rarr; add to favorites(Alt+shift+F)
    - 我们可以光标定位到某个函数、或是某个类添加到自定义的收藏夹中（add to new favorites list)
#### 1.6 插件
- 调插件页面 findaction&rarr;输入plugins
- 1.神器 emacsIdeas 安装
   - browse repositories &rarr;emacIdeas&rarr;install&rarr;restart idea(重启Idea)
   - 配置emacsIdeas快捷键 settings/keymap/emacIdeas文件夹下AceJumpWord添加对应的快捷键。
     -  按下刚配置的快捷键比如我这里shift+alt+K &rarr;按下要找的数字&rarr;输入任意高亮位置就跳转到对应位置了。
   
#### 1.7 编辑区分屏
- 垂直分屏
   - IntelliJ IDEA 支持对代码进行垂直或是水平分组，在打开的文件Tab上打开鼠标右键菜单，选择对应的split vertically功能即可
- 水平分屏
   - 设为split horizontally即可。
   
### 2.高速定位代码
#### 2.1 精准搜索
- 类
  - 菜单栏 &rarr;Navigate &rarr;Class(Ctrl+shift+T) 其中include none..勾上就可以关联到Jar包里所依赖的类。
- 文件
  - 菜单栏 navigate &rarr;file(ctrl+shift+r)
- 符号
  - 菜单栏 navigate &rarr;symbol(ctrl+alt+shift+n)
- 字符串
  - 菜单栏 edit&rarr;find&rarr;find in path(ctrl+H)
### 3.代码小助手
#### 3.1 列操作
- 移动到当前单词尾部
  - findaction &rarr;输入move caret to next word(ctrl+向右箭头)
- 选中到当前单词尾部 （ctrl+shift+向右箭头）
- 当前单词设置大小写切换
   - edit&rarr;toggle case(ctrl+shift+u)
- 移动到当前行首
   - findaction&rarr;输入move caret to line start(Home键)
- 移动到当前行尾
   - findaction&rarr;输入move caret to line end(End键)
- 将当前行的操作应用到相似行进行批量操作★
   - 菜单栏edit&rarr;find&rarr;select all occurrences(ctrl+alt+Y)
- 格式化下代码
   - 菜单栏code&rarr;reformat code
#### 3.2 live Template★  
- main
  - findaction&rarr;输入live templates&rarr;点击右上角“+”
  - 输入缩写main 简介public static void main
  - 输入方法体
      
     ```java
      public static void main(String[] args){
          $END$
      }
    ```
  - 点击define&rarr;勾选java
  - 输入main敲下回车即可。
- psfi
  - 输入最终模板(右边var1、var2确保输入一个参数回车后跳到另一参数输入)
      ```java
      public static final int $var1$=$var2$;
      ```
  - 点击define&rarr;勾选java      
- psfs
  - 输入最终模板(右边var1、var2确保输入一个参数回车后跳到另一参数输入)
      ```java
      public static final String $var1$="$var2$";
      ```
   - 点击define&rarr;勾选java
- pic
  - 输入模板 pic(private int 带有注释)
    ```java
        /**
        * $var1$
        **/
        private int $var2$;
        $End$
    ```
  - 点击define&rarr;勾选java
- pi、ps（private int ..和private String..)设置同上，略。
  
#### 3.3 postfix★
- 使用此功能（神器,输入一些东西加上"."后自动转换成想要的模板）
  - findaction&rarr;postfix completion&rarr;勾选enable postfix completion.
     - 找到java&rarr;fori可以查看实现原理(下面仅列出几种常用的)。
- for循环(fori)
- 打印(sout)
- field
  - 构造方法中.field会自动补充不存在的字段(详见wqjavase项目idea包下的B.java)。
- return
- nn(判断是否为空)

#### 3.4 alt+enter智能提示
- 快捷键
  - findaction&rarr;show intention actions(alt+anter)
- list replace
- 字符串format或者build
- 实现接口
  - 新建接口&rarr;UserService&rarr;光标定位到接口名称&rarr;按下alt+anter
  - 选择implement interface&rarr;输入实现类名称+选择创建位置
  - 选择实现接口中的方法即可生成。
- 单词拼写
  - 如果单词不记得如何拼写可以选中再按下alt+anter选择type change to它提示的英文单词进行矫正。
- 导包 ★
  - 通过提示手动导包
    - 按下alt+anter即可(我喜欢这种)
  - 自动导包
    - Settings&rarr;Editor&rarr;general&rarr;勾上auto import Optimize...
### 4.编写高质量代码
#### 4.1 重构
- 重构变量
  - 选中要重构的变量&rarr;菜单栏选择refactor&rarr;rename(alt+shift+r)
- 重构方法
  - 选择要重构的方法名&rarr;菜单栏选择refactor&rarr;change signature&rarr;输入相关参数配置即可。
  - 另一种通过alt anter
     - 直接在调用时输入要添加的参数&rarr;alt+anter&rarr;add 相应参数至方法即可。
- 抽取
  - 抽取变量
       - 选中字符串中的变量&rarr;refactor&rarr;extract&rarr;variable(alt+shift+L);
  - 抽取静态变量
      - 选中字符串中变量&rarr;refactor&rarr;extract&rarr;Constant(ctrl+alt+c)
  - 抽取方法参数
     - 如果方法中有用到成员变量（如this.name)&rarr;refactor&rarr;extract&rarr;parameter(alt+ctrl+p)就可以将成员变量以入参的形式传进来。
  - 抽取函数
     - 将方法中的逻辑抽取为一个函数。refactor&rarr;extract&rarr;Method（shift+alt+m)
### 5.寻找修改轨迹
#### 5.1 git集成
- annotate
   - 找出某行代码作者是谁
      - 在代码行左侧右击annotate
- 移动所有改动之处
   - findaction&rarr;previous changes(ctrl+alt+shift+向上箭头)
- 撤销操作
   - findaction&rarr;revert(ctrl+z)
#### 5.2 local history★
- 显示本地修改历史记录
   - findaction&rarr;local history&rarr;show history
   - 点击箭头可撤销。
   - put label(类似commit提交注释的功能)

### 6.关联一切
#### 6.1 与Spring的关联
- [视频学习链接](https://www.imooc.com/video/16226)
- 操作流程
  - file&rarr;project structure&rarr;facets&rarr;点击“+”&rarr;Spring到项目&rarr;点左下角加号&rarr;再勾上Spring配置文件即可（可以看到Springbean被哪里定义等信息）。
  
#### 6.2 与数据库的关联  
- 数据库连接
  - view&rarr;tool windows&rarr;database
  - 按“+”&rarr;datasource&rarr;mysql&rarr;输入数据库名；用户名、密码测试连接出现Suqcessful即可。
  - 关联sqlmap我就略过了。
### 7.调试程序  
#### 7.1 断点调试
- 打断点
  - run&rarr;toggle line breakpoint(ctrl+shift+B)
- 运行Debug模式
  - run&rarr;debug...(alt+shift+F9)或者按小虫子
- 按步运行
  - step over(F6)
- 跳过断点
  - resume program(f8)
- 查看所有断点
  - run&rarr;view breakpoints(ctrl+shift+F8)
- 禁止所有断点
  - debug窗口中左侧找到禁止标志（mute breakpoints)&rarr;F8跳过所有断点
- 条件断点
  - 在断点上右击出现 condition 输入条件(如s.equals("wuqingvika"))
- 表达式求值
  - 查看值★
    - run&rarr;evaluate expression
- 运行到指定行
  - 在Debug窗口找到有个光标图标 run to cursor(ctrl+R)
- setValue★
  - 在debug中只要选中要设置的变量按下F2设定想要设定的值即可。
#### 7.2 任一处运行
  - 运行当前上下文
    - findaction&rarr;debug context 就会运行光标就近处的方法
    - 注：如果光标在中间 那么两个都会运行
  - 在当前可运行列表中选择一个运行
    - alt+shift+F9
  - 编辑当前运行    
    - run&rarr;edit configurations&rarr;application&rarr;选择某个应用程序&rarr;在program arguments输入参数信息
### 8.其他操作  
#### 8.1 文本操作
- 复制文件名
    - 直接点击文件名 Ctrl+c在文本编辑区ctrl+v即可。
- 复制文件全名
    - shift+ctrl+c 再ctrl+v即可。
- 复制多个文件名
    - 多次ctrl+c 再shift+ctrl+v选择要复制哪些文件名即可。
- 结构图
    - 查看当前field、method大纲
       - navigate&rarr;File Structure(ctrl+F3)
    - 查看maven依赖★
       - pom.xml&rarr;右击Maven&rarr;show dependencies可以看到所有的依赖关系。
          - 可以按Ctrl+f进行搜索
          - 可以右击exclude进行排除
    - 查看类图★
        - 普通的子类名右击Diagrams&rarr;Show diagram即可出现类图。
    - 查看类继承结构★
        - findaction&rarr;hierarchy actions&rarr;hierarchy(alt+8)
    - 方法调用层次★
        - findaction&rarr;call hierarchy(ctrl+alt+H)            
##致谢
> 此总结源自慕课网视频教程,感谢老师@闪电侠，受益匪浅！     

## 二、序列化与反序列化

### 1.Serializable
- 类实现 Serializable 
- 保存数据到本地磁盘
    ```java
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("D:/test/wuqingvika0204.dat"));
        oos.writeObject(person);
        oos.close();
    ```
- 从本地加载并读取
    ```java
       ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:/test/wuqingvika0204.dat"));
       Person person=(Person)ois.readObject();
       ois.close();
       return person;
    ```
- 不想被序列化的字段如何处理：
    - 采用transient关键字来修饰字段即可。但它仅与Serializable配合使用。
### 2.Externalizable   
- 类实现 Externalizable
- 需要实现两个方法：
    ```java
       @Override
           public void writeExternal(ObjectOutput out) throws IOException {
               out.writeObject(this.getName());
               out.writeInt(this.getAge());
           }
       
           @Override
           public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
               this.setName((String)in.readObject());//这里位置不能颠倒
               this.setAge( in.readInt());
           }
    ```
- 其余序列化到本地磁盘和加载数据同上。
- 这里说下我遇到的坑：读取时候需要与写入字段顺序位置一致。不然报错。
- 另外，transient在这里使用无效。  