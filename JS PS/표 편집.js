function solution(n, k, testcase) {
    let rst = new Array(n);
    for(let i=0; i<n; i++) {
        rst[i] = 'O';
    }

    let root = new Node(0);
    let curNode = root;
    let prevNode = root;

    for(let i =0; i<n; i++) {
        const newNode= new Node(i, prevNode);
        prevNode.next = newNode;
        prevNode = newNode;

        if(i===k) {
            curNode = newNode;
        }
    }

    const log = [];
    testcase.map( line => {
        const [command, count] = line.split(' ');
        let i=0;
        switch (command) {
            case 'U':
                while(i < count && curNode.prev) {
                    curNode = curNode.prev;
                    i++;
                }
                break;
            case 'D':
                while (i <count && curNode.next) {
                    curNode = curNode.next;
                    i++
                }
                break;
            case 'C':
                log.push(curNode);
                const prev = curNode.prev;
                const next = curNode.next;

                if(prev && next) {
                    prev.next =next;
                    next.prev = prev;
                    curNode = next;
                } else if(prev) {
                    prev.next = null;
                    curNode = prev;
                } else if(next) {
                    next.prev = null;
                    curNode = next;
                }
                break;
            case 'Z':
                const node =log.pop();
                const prevNode = node.prev;
                const nextNode= node.next;

                if(prevNode) {
                    prevNode.next =node;
                }
                if(nextNode) {
                    nextNode.prev = node;
                }
                break;
        }
    })

    log.map( node => rst[node.idx] ='X').join('');

    return rst.join('')

}

const Node = function(idx, prevNode) {
    this.idx = idx;
    this.prev =prevNode;
    this.next;
}

solution(8, 2, ["D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"]);