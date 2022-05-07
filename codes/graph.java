public class graph {
        class Edge{
            int src, dest, weight;
            Edge(){
                src = dest = weight = 0;
            }
        };
     
        int V, E;
        Edge edge[];
        graph(int v, int e){
            V = v;
            E = e;
            edge = new Edge[e];
            for (int i = 0; i < e; ++i)
                edge[i] = new Edge();
        }
        public static void bellmanford(graph graph,int src){
            for(int i=0;i<)
        }
    public static void main(String[]args){
        
    }
}

