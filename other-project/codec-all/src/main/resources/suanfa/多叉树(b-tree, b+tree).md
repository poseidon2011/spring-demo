区别：
btree 是为了 磁盘存储设计的，所有节点会存储 指针，文件名和文件内容，因为磁盘一个block大小有限制，会导致 btree树很高。 
![btree][1]
b+tree是为了 索引设计的，为了解决btree中节点存储数据导致一个block存表多少文件名和指针，设计为所有数据在叶子节点。这样b+tree一般不会超过4层高度。
    以InnoDb为例（一页大小16KB）： 假设数据表的主键是 bigint类型（8个字节），指针类型也是bigint，那么 16KB / (8B + 8B) = 1000 个 数据库主键。那么深度为3的B+tree会维护 1000 * 1000 * 1000 = 1亿条数据库表主键。
    
![b+tree][1]

定义： 
m阶 BTree
1. 非root和叶子节点外限制： 所有节点子节点个数 应该  [ceil(m/2), m] 其中ceil是取上限函数。
2. root限制： 根节点不是叶子节点至少应该有 2个孩子（没有孩子的根结点，即根结点为叶子结点，整棵树只有一个根节点）
3. 叶子节点限制： 叶子节点应该在同一层上， 且 叶子节点不能包含指针信息。

每个node内部 p1, k1, p2, k2, p3, k3 ... kn, pn+1 且 关键字个数 范围： [ceil(m/2), m-1]

B+tree
1. 所有的叶子节点包含关键信息， 且用双下那个链表连接起来。 所有非叶子节点方 指针信息。 



[1]: http://img.blog.csdn.net/20160202204827368
[2]: http://img.blog.csdn.net/20160202205105560
