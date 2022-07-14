一、环境搭建
1. 创建maven项目
2. 导包、导入已有的sql表
3. 创建包结构
4. 启动类、配置文件yml
5. Lombok插件的使用
具体实现
   domain
   工具类：
        BaseQuery：查询参数
        PageList：前端分页展示的查询数据
   mapper
   sql
   service

   二、git版本控制工具的使用
   分支的用法
   git checkout -b dev  创建并切换到dev分支
   相当于
   git branch dev
   git checkout dev

   删除分支
   git branch -d branch_nameName

   分支合并的问题

   分支合并的冲突解决
   
   bug分支与stash命令
   git stash 保存当前的工作现场，等后续继续
   git stash list 列出现场
   git stash pop 恢复工作现场

   第二种恢复现场的方法
   git stash apply 

   git stash drop 删除存储的现场

   当有多个现场时，使用 stash@{0}来指定一个要操作的现场
   
   将修改的代码作用与其他分支
   git cherry-pick 提交代号

   多人协作
   **远程仓库的多分支使用**

   多人合作
   使用 git checkout -b dev origin/dev 在本地创建dev分支并关联远程仓库的dev分支

