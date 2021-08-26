function solution(record, rst=[]) {
    const user = new Map;
    record.forEach(v => {
        const [command, id, name] = v.split(' ');
        (command !== 'Leave') && user.set(id, name);
    });

    record.forEach(v => {
        const [command, id, name] = v.split(' ');
        if(command === 'Change')return;
        rst.push(`${user.get(id)}님이 ${command==='Enter' ? '들어왔습니다' : '나갔습니다'}.`);
    });

    return rst;
}