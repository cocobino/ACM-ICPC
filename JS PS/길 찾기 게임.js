class Node {
    constructor(value, x_pos) {
        this.value = value;
        this.x_pos = x_pos;
        this.left = null;
        this.right = null;
    }

    insert(value, x_pos) {
        x_pos <= this.x_pos
            ? this._toLeft(value, x_pos)
            : this._toRight(value, x_pos);
    }

    _toLeft(value, x_pos) {
        this.left
            ? this.left.insert(value, x_pos)
            : this.left = new Node(value, x_pos);
   }

    _toRight(value, x_pos) {
        this.right
            ? this.right.insert(value, x_pos)
            : this.right = new Node(value, x_pos);
    }
}



function solution(nodeinfo) {
    const preorderArr = [];
    const postorderArr = [];

    const preorder = (bTree, arr) => {
        if(bTree !== null) {
            arr.push(bTree.value);
            preorder(bTree.left, arr);
            preorder(bTree.right, arr);
        }
    }

    const postorder = (bTree, arr) => {
        if(bTree !== null) {
            postorder(bTree.left, arr);
            postorder(bTree.right, arr);
            arr.push(bTree.value);
        }
    }

    const node = nodeinfo.map((node, idx) => [idx + 1, node[0], node[1]])
        .sort((a, b) => b[2] - a[2]);

    const bTree = new Node(node[0][0], node[0][1]);
    for(let i = 1; i < node.length; i++) {
        bTree.insert(node[i][0], node[i][1]);
    }

    preorder(bTree, preorderArr);
    postorder(bTree, postorderArr);

    return [preorderArr, postorderArr];
}

solution([[5, 3], [11, 5], [13, 3], [3, 5], [6, 1], [1, 3], [8, 6], [7, 2], [2, 2]])