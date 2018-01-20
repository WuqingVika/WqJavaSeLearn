## Idea常用技巧总结
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
#### 3.1 